package com.codecool.RoboDog;

import com.codecool.RoboDog.enums.Breed;
import com.codecool.RoboDog.enums.DogName;
import com.codecool.RoboDog.model.Dog;
import com.codecool.RoboDog.repositories.DogStorage;
import com.codecool.RoboDog.service.DogCreator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class RoboDogApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoboDogApplication.class, args);
	}

}
