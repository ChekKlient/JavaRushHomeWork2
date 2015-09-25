package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> solutionSet = new HashSet<Integer>();
        int numberOfValues = 20;
        Random rnd = new Random();
        rnd.setSeed(6748421);
        for (int i = 0; i < numberOfValues; i++)
        {
            solutionSet.add(rnd.nextInt());
        }

        return solutionSet;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        HashSet<Integer> forRemove = new HashSet<Integer>();
        Iterator iterator = set.iterator();
        for (Integer currentValue: set)
        {
            if (currentValue > 10) forRemove.add(currentValue);
        }
        set.removeAll(forRemove);
        return set;
    }

    public static void main(String[] args)
    {
        HashSet<Integer> set = Solution.createSet();
        set = Solution.removeAllNumbersMoreThan10(set);
    }
}
