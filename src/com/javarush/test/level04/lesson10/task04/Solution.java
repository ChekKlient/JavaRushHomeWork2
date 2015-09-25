package com.javarush.test.level04.lesson10.task04;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в одной строке не разделять.
*/

public class Solution
{
    public static void printMultipleTable(int maxValue)
    {
        int i = 0;
        while(i++<maxValue)
        {
            int j = 0;
            while (j++ < maxValue)
            {
                System.out.print("S");
                //if (j != maxValue) System.out.print(" ");
            }
            if (i != maxValue) System.out.println();
        }
    }

    public static void main(String[] args)throws Exception
    {
        printMultipleTable(10);
    }
}
