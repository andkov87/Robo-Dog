package com.codecool.RoboDog.service;

import com.codecool.RoboDog.enums.Breed;
import com.codecool.RoboDog.enums.DogName;
import com.codecool.RoboDog.model.Dog;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class DogCreator {
    private final Random random = new Random();

    public int generateRandomAge(){
        return random.nextInt(15) + 1;
    }

    public DogName generateRandomName(){
        DogName[] dogNames = DogName.values();
        int index = random.nextInt(dogNames.length);
        return dogNames[index];
    }

    public Breed generateRandomBreed(){
        Breed[] dogBreeds = Breed.values();
        int index = random.nextInt(dogBreeds.length);
        return dogBreeds[index];
    }

    public Dog createRandomDog(){
        int age = generateRandomAge();
        DogName nameOfDog = generateRandomName();
        Breed breedOfDog = generateRandomBreed();

        return new Dog(nameOfDog, age, breedOfDog);
    }
}
