package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        try {
            InputStream inputStream = System.in;
            Reader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            int valuesNumber = 2;
            ArrayList<String> values = new ArrayList<String>();
            for (int i = 0; i < valuesNumber; i++) {
                values.add(bufferedReader.readLine());
            }
            if (values.get(0).equals(values.get(1))) System.out.println("Имена идентичны");
            else if (values.get(0).length() == values.get(1).length()) System.out.println("Длины имен равны");
        } catch (IOException e) {
            System.err.println("Error: " + e);
        } catch (NumberFormatException e) {
            System.err.println("Invalid number");
        }
    }
}
