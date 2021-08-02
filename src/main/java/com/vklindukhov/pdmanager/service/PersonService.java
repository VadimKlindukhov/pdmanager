package com.vklindukhov.pdmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vklindukhov.pdmanager.domain.Person;
import com.vklindukhov.pdmanager.mapper.PersonMapper;
import com.vklindukhov.pdmanager.repository.PersonRepository;
import com.vklindukhov.pdmanager.web.dto.AddPersonRequest;
import com.vklindukhov.pdmanager.web.dto.FullPersonDataResponse;
import com.vklindukhov.pdmanager.web.dto.PersonDataResponse;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PersonMapper personMapper;

    public void add(AddPersonRequest request) {
        Person person = personMapper.mapToEntity(request);
        personRepository.save(person);
    }

    public List<PersonDataResponse> getAll() {
        List<Person> persons = personRepository.getAll();
        return personMapper.mapToResponse(persons);
    }

    public FullPersonDataResponse get(Long personId) {
        Person person = personRepository.get(personId);
        return personMapper.mapToFullResponse(person);
    }
}
