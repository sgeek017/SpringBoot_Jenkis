package com.springboot.RestApplication.dao;

import com.springboot.RestApplication.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDAO {
    UUID addPerson(UUID id, Person name);

    default UUID addPerson(Person person) {
        UUID id = UUID.randomUUID();
        return addPerson(id, person);
    }

    List<Person> getPersonAllDAO();

    Optional<Person> getPersonDAO(UUID id);

    int deletPersonDAO(UUID id);

int updatePerosnDAO(UUID id, Person personUpdate);
}
