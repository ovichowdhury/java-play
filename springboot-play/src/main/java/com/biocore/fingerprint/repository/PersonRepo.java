package com.biocore.fingerprint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biocore.fingerprint.model.Person;
@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {
    public Person findByName(String name);
}
