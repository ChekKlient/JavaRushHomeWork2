package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        try {
            InputStream inputStream = System.in;
            Reader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            int valuesNumber = 3;
            ArrayList<Integer> values = new ArrayList<Integer>();
            for (int i = 0; i < valuesNumber; i++) {
                values.add(Integer.parseInt(bufferedReader.readLine()));
            }
            int max = values.get(0), min = values.get(0), avr = values.get(0);
            for (int i = 1; i < valuesNumber; i++)
            {
                int currValue = values.get(i);
                if (currValue < min) min = currValue;
                if (currValue > max) max = currValue;
            }
            for (int i = 0; i < valuesNumber; i++)
            {
                int currValue = values.get(i);
                if (currValue > min && currValue < max) avr = currValue;
            }
            System.out.println(avr);
            //System.out.println(min(values));
        } catch (IOException e) {
            System.err.println("Error: " + e);
        } catch (NumberFormatException e) {
            System.err.println("Invalid number");
        }
    }
}
