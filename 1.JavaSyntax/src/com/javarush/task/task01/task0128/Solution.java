package com.javarush.task.task01.task0128;

/* 
Просто, как 2+2
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 2 num: ");
        sum(scanner.nextInt(), scanner.nextInt());
    }

    public static void sum(int a, int b) {
        int c = a + b;
        System.out.print("Sum = " + c);
    }
}
