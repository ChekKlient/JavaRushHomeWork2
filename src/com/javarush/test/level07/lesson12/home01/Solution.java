package com.javarush.test.level07.lesson12.home01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке.
Использовать только цикл for.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {

        ArrayList<Integer> list = new ArrayList<Integer>();
        final int numberOfValues = 10;
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        for (int i = 0; i < numberOfValues; i++)
        {
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }

        for (int i = list.size()-1; i >= 0 ; i--)
        {
            System.out.println(list.get(i));
        }
    }
}
