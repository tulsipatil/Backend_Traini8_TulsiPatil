package com.example.trainingcentersregistry;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TrainingCentersRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingCentersRegistryApplication.class, args);
	}

	//ModelMapper object created to use from anywhere
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

}
