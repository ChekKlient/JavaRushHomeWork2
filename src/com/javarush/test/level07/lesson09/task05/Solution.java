package com.javarush.test.level07.lesson09.task05;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Считать строки с консоли и объявить ArrayList list тут

        ArrayList<String> list = new ArrayList<String>();
        final int numberOfValues = 10;
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        for (int i = 0; i < numberOfValues; i++)
        {
            list.add(bufferedReader.readLine());
        }


        ArrayList<String> result = doubleValues(list);
        for (int i = 0; i < result.size() ; i++)
        {
            System.out.println(result.get(i));
        }

        //Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list)
    {
        //напишите тут ваш код
        ArrayList<String> newList = new ArrayList<String>();
        for(String currentElement : list)  {
            newList.add(currentElement);
            newList.add(currentElement);
        }
        return newList;
    }
}
