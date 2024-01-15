package org.example.oop.animals;

import java.util.Objects;

public class Dog extends Animal {

    private String name;
    private int age;
    private String breed;
    public static int membre = 4;

    public Dog(String name,int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;

    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void happyBirthday() {
        age++;
    }

    public void bark(){
        System.out.printf("%s is barking",name);
    }

    public Dog(){

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }

   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == Objects.hash(name);
    }
//primul age  /|\  este this
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static int getStaticMembre() {
        return membre;
    }

    @Override
    public void printSomething() {

        System.out.println("Metoda implementata deoarece Dog extinde clasa abstracta Animal");
    }
}
