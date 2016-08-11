package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution {
    public static void main(String[] args)  throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        for (int i = 0; i < abcArray.length; i++) {   //проходим по каждой букве
            int count = 0; //счетчик для данной буквы
            for (String s : list) {  //проходим по каждой строке из списка
                for (char element : s.toCharArray()){  //разбиваем строку на буквы и сравниваем каждую букву с нашей
                    if (element == abcArray[i])
                        count++;
                }
            }
            System.out.println(abcArray[i] + " " + count);
        }
    }
}
