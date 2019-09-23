package com.springboot.RestApplication.api;

import com.springboot.RestApplication.model.Person;
import com.springboot.RestApplication.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("test")
    public String test() {
        return "test";
    }

    @PostMapping
    public String addPerson(@NotNull @Valid @RequestBody Person person) {
        return ("id : " + personService.addPerson(person));
    }

    @GetMapping
    public List<Person> getPersonAll(){
        return personService.getPersonAllService();
    }

    @GetMapping("{id}")
    public Optional<Person> getPerson(@PathVariable(name = "id") UUID id){
        return personService.getPersonService(id);
    }

    @DeleteMapping("{id}")
    public int deletPerson(@PathVariable(name = "id") UUID id){
        return personService.deletePersonService(id);
    }

    @PutMapping("{id}")
    public int update(@PathVariable(name = "id")UUID id, @NotNull @Valid @RequestBody Person personUpdate){
        return personService.updatePersonService(id, personUpdate);
    }
}

