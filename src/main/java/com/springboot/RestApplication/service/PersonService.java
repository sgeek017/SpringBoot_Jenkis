package com.springboot.RestApplication.service;


import com.springboot.RestApplication.dao.PersonDAO;
import com.springboot.RestApplication.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {

    private final PersonDAO personDAO;

    @Autowired
    public PersonService(@Qualifier("PersonDAO") PersonDAO personDao) {
        this.personDAO = personDao;
    }

    public UUID addPerson(Person person) {
        return personDAO.addPerson(person);
    }

    public List<Person> getPersonAllService(){
        return personDAO.getPersonAllDAO();
    }

    public Optional<Person> getPersonService(UUID id){
        return personDAO.getPersonDAO(id);
    }

    public int deletePersonService(UUID id){
        return personDAO.deletPersonDAO(id);
    }

    public int updatePersonService(UUID id, Person personUpdate){
        return personDAO.updatePerosnDAO(id, personUpdate);
    }
}
