package com.futurex.spring.DependencyInjectionDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalSpeak {

    //Dependency

    @Autowired
    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void makeAnimalSpeak() {
        this.animal.speak();
    }
}
