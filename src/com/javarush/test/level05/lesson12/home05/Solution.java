package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String lastPhrase = "";
        int sum = 0;
        while (true)
        {
            lastPhrase = bufferedReader.readLine();
            if (lastPhrase.equalsIgnoreCase("сумма")) break;
            else {
                try {
                    int lastInt = Integer.parseInt(lastPhrase);
                    sum += lastInt;
                }
                catch ( java.lang.NumberFormatException e)
                {
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
