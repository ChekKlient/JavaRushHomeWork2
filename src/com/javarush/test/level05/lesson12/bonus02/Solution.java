package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maxValues = 5;
        int lastMin = Integer.parseInt(reader.readLine());
        for (int i = 1; i < maxValues; i++)
        {
            int b = Integer.parseInt(reader.readLine());
            lastMin = min(lastMin, b);
        }

        System.out.println("Minimum = " + lastMin);
    }


    public static int min(int a, int b)
    {
        return a < b ? a : b;
    }

}
