package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        array = sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static String[] sort(String[] array) {
        //напишите тут ваш код
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> indexNumbers = new ArrayList<Integer>();
        ArrayList<String> strings = new ArrayList<String>();
        ArrayList<Integer> indexStrings = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                numbers.add(Integer.parseInt(array[i]));
                indexNumbers.add(i);
            }
            else {
                strings.add(array[i]);
                indexStrings.add(i);
            }
        }
        String[] str = strings.toArray(new String[strings.size()]);
        Integer[] nmb = numbers.toArray(new Integer[numbers.size()]);
        for (int i = 0; i < nmb.length; i++) {
            for (int j = i+1; j < nmb.length; j++) {
                if (nmb[j]>nmb[i]){
                    int tmp = nmb[j];
                    nmb[j] = nmb[i];
                    nmb[i] = tmp;
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            for (int j = i+1; j < str.length; j++) {
                if (isGreaterThan(str[i], str[j])) {
                    String tmp = str[i];
                    str[i] = str[j];
                    str[j] = tmp;
                }
            }
        }
        String[] sorted = new String[array.length];
        for (int i = 0; i < indexNumbers.size(); i++) {
            sorted[indexNumbers.get(i)] = Integer.toString(nmb[i]);
        }
        for (int i = 0; i < indexStrings.size(); i++) {
            sorted[indexStrings.get(i)] = str[i];
        }
        return sorted;
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) { // не цифра и не начинается с '-'
                return false;
            }
        }
        return true;
    }
}
