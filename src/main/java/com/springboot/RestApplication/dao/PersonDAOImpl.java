package com.springboot.RestApplication.dao;

import com.springboot.RestApplication.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("PersonDAO")
public class PersonDAOImpl implements PersonDAO {

    private final List<Person> DB = new ArrayList<>();

    @Override
    public UUID addPerson(UUID id, Person name) {
        DB.add(new Person(id, name.getName()));
        return id;
    }

    @Override
    public List<Person> getPersonAllDAO() {
        return DB;
    }

    @Override
    public Optional<Person> getPersonDAO(UUID id) {
        return DB
                .stream()
                .filter(person -> person.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deletPersonDAO(UUID id) {
        Optional<Person> person = getPersonDAO(id);
        if (person.isPresent()) {
            return 0;
        } else {
            boolean result = DB.remove(person.get());
            return 1;
        }
    }

    @Override
    public int updatePerosnDAO(UUID id, Person personUpdate) {
        return getPersonDAO(id)
                .map(person -> {
                    int personDelete = DB.indexOf(person);
                    if (personDelete >= 0) {
                        DB.set(personDelete, new Person(id, personUpdate.getName()));
                        return 1;
                    } else {
                        return 0;
                    }
                }).orElse(0);
    }
}
