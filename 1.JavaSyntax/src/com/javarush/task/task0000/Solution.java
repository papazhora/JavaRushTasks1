package com.javarush.task.task0000;

public class Solution {

    public static void main(String[] args)
    {
        Student olga = new Student();
            olga.name = "Olga";
            olga.age = 18;

        Student elena = new Student();
            elena.name = "Elena";
            elena.age = 22;

        System.out.println(olga.name + " is " + olga.age + "\n" + elena.name + " is " + elena.age);

        Student(olga, elena);

        System.out.print(olga.name + " is " + olga.age + "\n" + elena.name + " is " + elena.age);
    }

    private static void Student(Student a, Student b){
        a.name = "Vasya";
        a.age = 80;
        b.name = "Petya";
        b.age = 60;
       // System.out.println(a.name + " is " + a.age + "\n" + b.name + " is " + b.age);



    }

    public static class Student
    {
        int age;
        String name;


    }
}
