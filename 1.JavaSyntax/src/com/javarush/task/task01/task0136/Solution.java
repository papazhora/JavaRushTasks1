package com.javarush.task.task01.task0136;

/* 
Да хоть на Луну!
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(getWeight(888));
    }

    public static double getWeight(int weightEarth) {
        double weightEarth2 = weightEarth;
        double weightMoon = (weightEarth2 * 17) / 100;
        return weightMoon;
    }
}