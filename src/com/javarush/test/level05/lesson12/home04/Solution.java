package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Solution
{
    public static void main(String[] args)
    {

        LocalDate date = LocalDate.now();
        System.out.println(date.format(DateTimeFormatter.ofPattern("d MM uuuu")));
        //напишите тут ваш код
//        Calendar calendar = Calendar.getInstance();
//        Date date = new Date();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM y");
//        System.out.println(dateFormat.format(date));
//        System.out.println(calendar.get(Calendar.DATE)+" "+calendar.get(Calendar.MONTH)+" "+calendar.get(Calendar.YEAR));

    }
}
