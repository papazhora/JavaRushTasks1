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

        System.out.print(olga.name + " is " + olga.age + "\n" + elena.name + " is " + elena.age);
    }
    public static class Student
    {
        int age;
        String name;
    }
}
