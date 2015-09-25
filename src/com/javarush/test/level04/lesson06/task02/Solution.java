package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static int max(ArrayList<Integer> values)
    {
        if (values.size() == 0) return 0;
        int lastChoice = values.get(0);
        for (Integer currentValue : values) {
            if(lastChoice < currentValue) lastChoice = currentValue;
        }
        return lastChoice;
    }

    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код

        /* данные для тестирования:
        введите 1 и 2, минимум =  1
        введите 2 и 1, минимум =  1
        введите 1 и 1, минимум =  1
        введите -1 и -2, минимум =  -2
         */
        Integer val1 = 0, val2 = 0;
        try {
            InputStream inputStream = System.in;
            Reader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            int valuesNumber = 4;
            ArrayList<Integer> values = new ArrayList<Integer>();
            for (int i = 0; i < valuesNumber; i++) {
                values.add(Integer.parseInt(bufferedReader.readLine()));
            }
            System.out.println(max(values));
        } catch (IOException e) {
            System.err.println("Error: " + e);
        } catch (NumberFormatException e) {
            System.err.println("Invalid number");
        }
    }
}
