package io.zipcoder.polymorphism;


public class Dog extends Pet{
    public Dog(String name, String typeOfPet, Integer age) {
        super(name, typeOfPet, age);
    }

    @Override
    public String speak() {
        return "bark!";
    }
}
