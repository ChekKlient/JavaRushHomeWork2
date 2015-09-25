package com.javarush.test.level04.lesson13.task02;

import java.io.*;
import java.util.ArrayList;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        try {
            InputStream inputStream = System.in;
            Reader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            int rows = 0;
            int columns = 0;
            rows = Integer.parseInt(bufferedReader.readLine());
            columns = Integer.parseInt(bufferedReader.readLine());
            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < columns; j++)
                {
                    System.out.print("8");
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.err.println("Error: " + e);
        } catch (NumberFormatException e) {
            System.err.println("Invalid number");
        }

    }
}
