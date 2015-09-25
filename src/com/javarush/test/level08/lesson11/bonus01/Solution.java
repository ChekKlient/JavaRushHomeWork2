package com.javarush.test.level08.lesson11.bonus01;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        //Map<String, Integer> months = new HashMap<String, Integer>();
        List<String> monthes = new ArrayList<String>();
        for (int i = 0; i < 12; i++)
        {
            Calendar cal = Calendar.getInstance();
            cal.set(2015, i, 1);
            monthes.add(i, cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US).toUpperCase());
            //months.put(cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US).toUpperCase(), i+1);
        }
        //System.out.println(months);

        String enteredMonth = bufferedReader.readLine();
        //System.out.println(enteredMonth + " is " + months.get(enteredMonth.toUpperCase()) + " month");
        System.out.println(enteredMonth + " is " + (monthes.indexOf(enteredMonth.toUpperCase())+1) + " month");
    }

}
