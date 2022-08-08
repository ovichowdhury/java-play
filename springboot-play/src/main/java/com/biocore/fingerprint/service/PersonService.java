package com.biocore.fingerprint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biocore.fingerprint.dto.PersonDto;
import com.biocore.fingerprint.model.Address;
import com.biocore.fingerprint.model.Person;
import com.biocore.fingerprint.repository.PersonRepo;

@Service
public class PersonService {
    
    @Autowired
    PersonRepo personRepo;

    public Person createPerson(PersonDto person)
    {
        Person p = new Person();
        Address a = new Address();
        a.setPermanent(person.getAddress().getPermanent());
        a.setPresent(person.getAddress().getPresent());

        p.setName(person.getName()); 
        p.setAge(person.getAge());
        p.setAddress(person.getAddress());
        p.setHobbies(person.getHobbies());
        personRepo.save(p);
        return p;
    }


    public Person findByName(String name)
    {
        return personRepo.findByName(name);

    }

}
