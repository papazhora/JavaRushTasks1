package com.javarush.task.task01.task0121;
import java.lang.reflect.Array;
import java.util.*;

/* 
Контракт
*/

public class Solution {
    public static void main(String[] args) {
        String [] contrakt = {"Меня зовут Амиго.", "Я согласен на зарплату ", "", "$", "800", "1500", "2200",
                "2700", "3200", "/месяц", " в ", " во ", "год.", "первый ","второй","третий", "четвертый","пятый","Поцелуй мой блестящий металлический зад!"};
        //Arrays.sort(contrakt);
        //for (int i = 0; i<contrakt.length; i++){

            System.out.println(contrakt [0]);
            System.out.println(contrakt [2]);
            System.out.println(contrakt [1] + contrakt[3] + contrakt[4] + contrakt[9] + contrakt[10] + contrakt[13] + contrakt[12]);







//        String str = "Я согласен на зарплату ";
//        System.out.println("Меня зовут Амиго.");
//        System.out.println("");
//        System.out.println(str + "$800/месяц в первый год.");
//        System.out.println(str + "$1500/месяц во второй год.");
//        System.out.println(str + "$2200/месяц в третий год.");
//        System.out.println(str + "$2700/месяц в четвертый год.");
//        System.out.println(str + "$3200/месяц в пятый год.");
//        System.out.println("");
//        System.out.println("Поцелуй мой блестящий металлический зад!");

    }
}
