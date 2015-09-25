package com.javarush.test.level08.lesson11.home04;

import java.io.*;
import java.util.*;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум
        Collections.sort(array);
        Iterator<Integer> iterator = array.iterator();
        if (iterator.hasNext()) return (int)iterator.next();
        return 0;

    }

    public static List<Integer> getIntegerList() throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int valuesNumber = Integer.parseInt(bufferedReader.readLine());
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < valuesNumber; i++)
        {
            int currentNumber = Integer.parseInt(bufferedReader.readLine());
            result.add(currentNumber);
        }
        return result;
    }
}
