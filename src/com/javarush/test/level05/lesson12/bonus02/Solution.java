package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution{
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        arr[0]=Integer.parseInt(reader.readLine());
        int m = arr[0];
        System.out.println(m);
        for (int i = 1; i < arr.length; i++){
            arr[i]=Integer.parseInt(reader.readLine());
            m=min(m, arr[i]);
        }
        System.out.println("Minimum = " + m);
    }
    public static int min(int a, int b){
        return a < b ? a : b;
    }
}
