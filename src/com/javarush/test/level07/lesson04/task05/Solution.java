package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] bigArray, smallArray1, smallArray2;
        ArrayList<String> ddd = new ArrayList<String>(5);
        int ddd1 = ddd.
        bigArray = new int[20];
        smallArray1 = new int[10];
        smallArray2 = new int[bigArray.length - smallArray1.length];
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        for (int i = 0; i < bigArray.length; i++)
        {
            bigArray[i] = Integer.parseInt(bufferedReader.readLine());
        };
        for (int i = 0; i < bigArray.length; i++)
        {
            if (i < smallArray1.length)
                smallArray1[i] = bigArray[i];
            else
                smallArray2[i-smallArray1.length] = bigArray[i];
        }
        for (int i = 0; i < smallArray2.length; i++)
        {
            System.out.println(smallArray2[i]);
        }

    }
}
