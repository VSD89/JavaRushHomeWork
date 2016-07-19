package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int[] arr = {a,b,c};
        int[] arrSel = selectionSort(arr);
        for (int i = 0; i < arrSel.length; i++)
        {
            System.out.println(arrSel[i]);
        }


    }
    public static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            int max_i = i;
            for (int j = i+1; j < arr.length; j++) {
                //Если находим, запоминаем его индекс
                if (arr[j] > max) {
                    max = arr[j];
                    max_i = j;
                }
            }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
            if (i != max_i) {
                int tmp = arr[i];
                arr[i] = arr[max_i];
                arr[max_i] = tmp;
            }
        }
        return arr;
    }
}
