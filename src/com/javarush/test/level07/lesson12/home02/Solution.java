package com.javarush.test.level07.lesson12.home02;

import java.io.*;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<String> list = new ArrayList<String>();
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        final int numberOfValues = Integer.parseInt(bufferedReader.readLine());
        final int numberOfShifts = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < numberOfValues; i++)
        {
            list.add(bufferedReader.readLine());
        }

        list.addAll(list.subList(0, numberOfShifts));
        list.subList(0, numberOfShifts).clear();
        for (String currentElement : list)
            System.out.println(currentElement);

    }
}
