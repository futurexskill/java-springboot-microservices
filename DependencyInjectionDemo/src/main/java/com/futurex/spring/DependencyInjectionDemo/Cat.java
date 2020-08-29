package com.futurex.spring.DependencyInjectionDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

    public void speak() {

        System.out.println("Meow");
    }
}
