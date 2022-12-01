package io.zipcoder.polymorphism;


public class Pet {


    private static String name;
    private static String typeOfPet;
    private static Integer age;


    public Pet (String name, String typeOfPet, Integer age){
        this.name = name;
        this.typeOfPet = typeOfPet;
        this.age = age;

    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Pet.name = name;
    }

    public static String getTypeOfPet() {
        return typeOfPet;
    }

    public static void setTypeOfPet(String typeOfPet) {
        Pet.typeOfPet = typeOfPet;
    }

    public static Integer getAge() {
        return age;
    }

    public static void setAge(Integer age) {
        Pet.age = age;
    }

    public String speak() {
        return null;
    }

}

