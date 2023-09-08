package com.codecool.RoboDog.model;

import com.codecool.RoboDog.enums.Breed;
import com.codecool.RoboDog.enums.DogName;
import org.springframework.stereotype.Component;


public class Dog {
    private DogName name;
    private int age;
    private Breed breed;

    public Dog(DogName name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public DogName getName() {
        return name;
    }

    public void setName(DogName name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }
}
