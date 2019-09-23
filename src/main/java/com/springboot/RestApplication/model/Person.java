package com.springboot.RestApplication.model;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.UUID;

public class Person {

    private UUID id;

    @NotNull
    private String name;

    @Min(0)
    private Integer age;

    public Person() {
    }

    public Person(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person(UUID id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
