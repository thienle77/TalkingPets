package io.zipcoder.polymorphism;


public class Pet {
    String name;

   public Pet (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak() {
        return "";
    }

}

