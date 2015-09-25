package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;

/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        final int numberOfValues = 5;
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        for (int i = 0; i < numberOfValues; i++)
        {
            list.add(bufferedReader.readLine());
        }

        list.remove(2);
        for (int i = list.size()-1; i >=0 ; i--)
        {
            System.out.println(list.get(i));
        }


    }
}
