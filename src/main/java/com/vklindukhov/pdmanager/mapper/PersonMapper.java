package com.vklindukhov.pdmanager.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mappings;

import com.vklindukhov.pdmanager.domain.Person;
import com.vklindukhov.pdmanager.web.dto.AddPersonRequest;
import com.vklindukhov.pdmanager.web.dto.FullPersonDataResponse;
import com.vklindukhov.pdmanager.web.dto.PersonDataResponse;

@Mapper(componentModel="spring")
public interface PersonMapper {

    Person mapToEntity(AddPersonRequest request);

    PersonDataResponse mapToResponse(Person person);

    List<PersonDataResponse> mapToResponse(List<Person> person);

    FullPersonDataResponse mapToFullResponse(Person person);
}
