package com.javarush.task.task01.task0127;

/* 
Число в квадрате
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int a = scanner.nextInt();
        System.out.print("Введите число: ");
        System.out.println("Квадрат Вашего числа равен: " + sqr(scanner.nextInt()));
    }

    public static int sqr(int a) {
        return a * a;
    }
}
