package io.zipcoder.polymorphism;


public class Fish extends Pet{

    public Fish(String name, String typeOfPet, Integer age) {
        super(name, typeOfPet, age);
    }

    @Override
    public String speak() {
        return "bloop bloop!";
    }
}
