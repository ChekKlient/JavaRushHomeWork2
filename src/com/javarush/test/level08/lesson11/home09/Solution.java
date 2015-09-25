package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("JANUARY 1 2000"));
        System.out.println(isDateOdd("JANUARY 2 2000"));
    }

    public static boolean isDateOdd(String date)
    {

        Date trueDate = new Date(Date.parse(date));
        Date yearStart = (Date)trueDate.clone();
        yearStart.setMonth(0);
        yearStart.setDate(1);


        long daysFromYearStart = (trueDate.getTime() - yearStart.getTime())/1000/60/60/24+1;
        return (boolean)(daysFromYearStart % 2!=0);
    }
}
