package io.zipcoder.polymorphism;


public class Cat extends Pet{
    public Cat(String name, String typeOfPet, Integer age) {
        super(name, typeOfPet, age);
    }

    @Override
    public String speak() {
        return "meow!";
    }
}
