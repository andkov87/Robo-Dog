package com.codecool.RoboDog.repositories;

import com.codecool.RoboDog.enums.Breed;
import com.codecool.RoboDog.enums.DogName;
import com.codecool.RoboDog.model.Dog;
import com.codecool.RoboDog.service.DogCreator;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DogStorage {

    private final DogCreator dogCreator;
    private final List<Dog> dogList;

    public DogStorage(DogCreator dogCreator) {
        this.dogCreator = dogCreator;
        this.dogList = new ArrayList<>();
    }

    public void addDog(Dog dog) {
        dogList.add(dog);
    }

    public Dog addRandomDog(){
        Dog randomDog = dogCreator.createRandomDog();

        dogList.add(randomDog);
        return randomDog;
    }

    public List<Dog> getDogList(){
        return dogList;
    }


    public void update(DogName name, int age, Breed dogBreed){
        dogList.stream()
                .filter(dog -> dog.getName().equals(name))
                .findFirst()
                .ifPresent(dog -> {
                    dog.setName(name);
                    dog.setAge(age);
                    dog.setBreed(dogBreed);
                });
    }
}
