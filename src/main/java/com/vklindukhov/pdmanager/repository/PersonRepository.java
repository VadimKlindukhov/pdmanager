package com.vklindukhov.pdmanager.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.vklindukhov.pdmanager.domain.Gender;
import com.vklindukhov.pdmanager.domain.Person;

@Repository
public class PersonRepository {

    private static final RowMapper<Person> PERSON_ROW_MAPPER = (r, i) -> {
        Person person = new Person();
        person.setId(r.getLong("id"));
        person.setUsername(r.getString("username"));
        person.setFullName(r.getString("fullName"));
        person.setEmail(r.getString("email"));
        String dateOfBirth = r.getString("dateOfBirth");
        person.setDateOfBirth(dateOfBirth != null ? LocalDate.parse(dateOfBirth) : null);
        String gender = r.getString("gender");
        person.setGender(gender != null ? Gender.valueOf(gender) : null);
        person.setRawImage(r.getString("rawImage"));
        return person;
    };

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(Person person) {
        jdbcTemplate.update(
                "insert into persons(username,fullName,email,dateOfBirth,gender,rawImage) values(?,?,?,?,?,?)",
                person.getUsername(), person.getFullName(), person.getEmail(), person.getDateOfBirth(), person.getGender(), person.getRawImage()
        );
    }

    public List<Person> getAll() {
        return jdbcTemplate.query(
                "select * from persons",
                PERSON_ROW_MAPPER
        );
    }

    public Person get(Long personId) {
        return jdbcTemplate.queryForObject(
                "select * from persons where id = ?",
                PERSON_ROW_MAPPER,
                personId
        );
    }
}
