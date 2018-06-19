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
    }
    public static class Student
    {
        int age;
        String name;
    }
}
