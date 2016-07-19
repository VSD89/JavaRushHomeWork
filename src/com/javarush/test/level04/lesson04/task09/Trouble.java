package com.javarush.test.level04.lesson04.task09;

public class Trouble
{
    public static void main(String[] args) throws Exception
    {
        int i =63;
        System.out.println(sim(i));
    }
    public static int sim(int d){
        d-=5;
        if (d>5)
        d=sim(d);
        return d;
    }
}
