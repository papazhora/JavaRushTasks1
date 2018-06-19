package com.javarush.task.task000;

import com.javarush.task.task0000.Solution.Student;

import static com.javarush.task.task000.Solution.Ggg.ggg;

public class Solution {
    Student lora = new Student();


    int age;
    String name;
    int o = 9;
    public static void main(String[] args) {
        int n = 5;
        int m = 10;
        String name = "Egor";
        Student kolya = new Student();
        final Student kolya1 = kolya;
        new Student();



        ggg(n + 3, m + 3);

        live(n, name);

        System.out.print("n = " + n + "\nm = " + m + "\nName: " + name + "\n");

        sw(n, m, name);


        System.out.print("n = " + n + "\nm = " + m + "\nName: " + name + "\n");


    }
        public static void sw(int a, int b, String s) {
            int c = a + b;
            a = c;
            b = c + a;
            live(c, s);
            ggg(1,1);
            System.out.println(c);
            s = "Pasha";
            System.out.println(b);
            System.out.println(s);

            Solution solution = new Solution();
                solution.age = 50;
                solution.name = "Petya";
                solution.o = solution.age + 5;


            a = 66;

            System.out.println(solution.name + " " + solution.age + " " + solution.o);


        }
        public static void live(int k, String p){
            ggg(3,3);
            Solution solution2 = new Solution();
                solution2.age = k;
                solution2.name = p;
                System.out.println(solution2.name + " " + solution2.age);

                Ggg ggg = new Ggg();
                    ggg.c = 100;
                    ggg.r = ggg.c + 2;
                    System.out.println(ggg.c);
                    ggg(ggg.c, ggg.r);


        }
        public static class Ggg {
            int c = 88;
            int r = 2;
            public static void ggg(int a, int b){

                System.out.println(a + b);
                int j = 8;
                int h = 7;
                String d = "fffffffff";
            }


        }
}