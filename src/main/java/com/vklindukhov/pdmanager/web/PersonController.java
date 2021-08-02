package com.vklindukhov.pdmanager.web;

import java.util.List;

import javax.validation.constraints.Positive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vklindukhov.pdmanager.service.PersonService;
import com.vklindukhov.pdmanager.web.dto.AddPersonRequest;
import com.vklindukhov.pdmanager.web.dto.FullPersonDataResponse;
import com.vklindukhov.pdmanager.web.dto.PersonDataResponse;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/persons")
    public void add(@RequestBody AddPersonRequest request) {
        personService.add(request);
    }

    @GetMapping("/persons")
    public List<PersonDataResponse> getAll() {
        return personService.getAll();
    }

    @GetMapping("/persons/{personId}")
    public FullPersonDataResponse get(@PathVariable @Positive Long personId) {
        return personService.get(personId);
    }
}
