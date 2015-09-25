package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String> testSet = new HashSet<String>();
        testSet.add("Лево");
        testSet.add("Лист");
        testSet.add("Лётчик");
        testSet.add("Лукошко");
        testSet.add("Лодка");
        testSet.add("Лорингит");
        testSet.add("Лоб");
        testSet.add("Лето");
        testSet.add("Лук");
        testSet.add("Лыко");
        testSet.add("Лейка");
        testSet.add("Лот");
        testSet.add("Лото");
        testSet.add("Лизун");
        testSet.add("Лавина");
        testSet.add("Лунка");
        testSet.add("Леска");
        testSet.add("Лак");
        testSet.add("Лор");
        testSet.add("Луг");
        return testSet;
    }

    public static void main(String[] args)
    {
        Solution.createSet();
    }
}
