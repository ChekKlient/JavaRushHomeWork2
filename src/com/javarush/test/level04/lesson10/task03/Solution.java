package com.javarush.test.level04.lesson10.task03;

import java.io.*;
import java.util.ArrayList;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        try {
            InputStream inputStream = System.in;
            Reader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String printingValue = bufferedReader.readLine();
            int numberOfIterations = Integer.parseInt(bufferedReader.readLine());

            int i = 0; while (i++<numberOfIterations) {
                System.out.println(printingValue);
            }
        } catch (IOException e) {
            System.err.println("Error: " + e);
        } catch (NumberFormatException e) {
            System.err.println("Invalid number");
        }
    }
}
