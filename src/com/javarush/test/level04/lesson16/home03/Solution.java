package com.javarush.test.level04.lesson16.home03;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
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

            int currValue = 0;
            int sum = 0;
            while (currValue !=-1)
            {
                currValue = Integer.parseInt(bufferedReader.readLine());
                sum += currValue;
            }
            System.out.println(sum);
        } catch (IOException e) {
            System.err.println("Error: " + e);
        } catch (NumberFormatException e) {
            System.err.println("Invalid number");
        }
    }
}
