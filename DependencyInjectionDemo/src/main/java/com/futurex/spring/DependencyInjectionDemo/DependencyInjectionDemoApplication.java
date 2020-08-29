package com.futurex.spring.DependencyInjectionDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(DependencyInjectionDemoApplication.class, args);
		System.out.println("Dependency Injection Demo");
		//AnimalSpeak xyz = new AnimalSpeak();
		//Animal animal = new Cat();
		AnimalSpeak xyz = applicationContext.getBean(AnimalSpeak.class);
		Animal animal = applicationContext.getBean(Animal.class);

		xyz.setAnimal(animal);
		xyz.makeAnimalSpeak();

		System.out.println("********************");
	}

}
