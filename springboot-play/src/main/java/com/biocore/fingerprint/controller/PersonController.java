package com.biocore.fingerprint.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biocore.fingerprint.dto.PersonDto;
import com.biocore.fingerprint.model.Person;
import com.biocore.fingerprint.service.PersonService;


@RestController
@RequestMapping("api/v1/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping
    public Person createPerson(@Valid @RequestBody PersonDto person)
    {
        System.out.println(person.getAddress().getPermanent());
        return personService.createPerson(person);
        
    }

    @GetMapping("/{name}")
    public Person findByName(@PathVariable(name = "name") String name)
    {
       return personService.findByName(name);

    }
}
