package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static ArrayList<Integer> sortDesc(ArrayList<Integer> values)
    {
        ArrayList<Integer> answer = new ArrayList<Integer>(values);
        for (int i = 0; i < answer.size(); i++)
        {
            for (int j = i+1; j < answer.size(); j++)
            {
                if (answer.get(i)<answer.get(j))
                {
                    int k = answer.get(j);
                    answer.set(j, answer.get(i));
                    answer.set(i, k);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws Exception
    {
        try {
            InputStream inputStream = System.in;
            Reader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            int valuesNumber = 3;
            ArrayList<Integer> values = new ArrayList<Integer>();
            for (int i = 0; i < valuesNumber; i++) {
                values.add(Integer.parseInt(bufferedReader.readLine()));
            };
            ArrayList<Integer> sortedValues = sortDesc(values);
            for (int i = 0; i < valuesNumber; i++) {
                System.out.println(sortedValues.get(i));
            }
        } catch (IOException e) {
            System.err.println("Error: " + e);
        } catch (NumberFormatException e) {
            System.err.println("Invalid number");
        }

    }
}
