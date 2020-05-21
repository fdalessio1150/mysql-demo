package com.example.mysqldemo.controller;

import com.example.mysqldemo.model.PersonDTO;
import com.example.mysqldemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
public class Controller {

    private PersonService personService;

    @Autowired
    public Controller(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/v1/customer/{personId}")
    public List<PersonDTO> getPersonById(@PathVariable @Valid @NotNull String personId) {
        return personService.getPersonById(personId);
    }


    @PostMapping("/v1/customer")
    public void createCustomer(@RequestBody @Validated @NotNull PersonDTO body) {
        personService.createPerson(body);
    }
}
