package io.zipcoder.polymorphism;


public class Fish extends Pet{
    public Fish(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "bloop bloop!";
    }
}
