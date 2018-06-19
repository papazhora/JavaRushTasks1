package com.javarush.task.task02.task0213;

/* 
Питомцам нужны люди
*/
public class Solution {
    public static void main(String[] args) {
        Woman woman = new Woman();
        woman.name = "Larisa";

        Cat cat = new Cat();
        cat.owner = woman;
        cat.name = "Barsik";

        Dog dog = new Dog();
        dog.owner = woman;
        dog.name = "Reks";

        Fish fish = new Fish();
        fish.owner = woman;
        fish.qunt = 10;

        System.out.println("Cat name is: " + cat.name + "\nName owner is: " + woman.name);
    }

    public static class Cat {
        public Woman owner;
        String name;
    }

    public static class Dog {
        public Woman owner;
        public String name;
    }

    public static class Fish {
        public Woman owner;
        int qunt;
    }

    public static class Woman {
        String name;
        int age = 55;
    }



}
