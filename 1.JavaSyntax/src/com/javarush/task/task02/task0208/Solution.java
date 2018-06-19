package com.javarush.task.task02.task0208;

/* 
Одного кота нам мало
*/
public class Solution {
    public static void main(String[] args) {
        Cat catGazik = new Cat();
        catGazik.age = "6 yars";
        catGazik.weight = "10 kg.";
        catGazik.name = "Gazik";
        Cat catSnoopich = new Cat();
        catSnoopich.weight = "15 kg.";
        catSnoopich.age = "10 yers";
        catSnoopich.name = "Snoopich";
        System.out.println(catGazik.name +" " + catGazik.age + " " + catGazik.weight);
        System.out.println(catSnoopich.name +" " + catSnoopich.age + " " + catSnoopich.weight);

    }

    public static class Cat {
        String weight;
        String age;
        String name;

        public Cat() {
            System.out.println("May, May!");



        }

    }
}
