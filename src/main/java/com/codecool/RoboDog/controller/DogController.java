package com.codecool.RoboDog.controller;

import com.codecool.RoboDog.enums.DogName;
import com.codecool.RoboDog.model.Dog;
import com.codecool.RoboDog.repositories.DogStorage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DogController {

    private final DogStorage dogStorage;


    public DogController(DogStorage dogStorage) {
        this.dogStorage = dogStorage;
    }

    @GetMapping("/alldogs")
    public List<Dog> getAllDogs(){
       return dogStorage.getDogList();
    }

    @GetMapping("/randomdog")
    public Dog getRandomDog(){
        return dogStorage.addRandomDog();
    }

    @PostMapping("/newdog")
        public void addNewDog(@RequestBody Dog dog){
            dogStorage.addDog(dog);
    }

    @PutMapping("/updatedog/{name}")
    public void updateDog(@PathVariable DogName name, @RequestBody Dog updateDog){
        dogStorage.update(name, updateDog.getAge(), updateDog.getBreed());
    }
}
