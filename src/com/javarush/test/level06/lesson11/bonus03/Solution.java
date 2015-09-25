package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        int valuesNumber = 5;
        ArrayList<Integer> valuesList = new ArrayList<Integer>(valuesNumber);
        for (int i = 0; i < valuesNumber; i++)
        {
            valuesList.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(valuesList);
        for (int i = 0; i < valuesNumber; i++)
        {
            System.out.println(valuesList.get(i));
        }

    }
}
