package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Ivanov4", "Ivan");
        map.put("Ivanov1", "Petr");
        map.put("Ivanov2", "Oleg");
        map.put("Ivanov3", "Surim");
        map.put("Petrov1", "Ivan");
        map.put("Petrov2", "Ivan");
        map.put("Petro3", "Ivan");
        map.put("Petro4", "Ivan");
        map.put("Petro5", "Ivan");
        map.put("Bondarev", "Oleg");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {

        int numberOfValues = 0;
        if (map.containsValue(name))
        for (Map.Entry<String, String> currentSet: map.entrySet())
        {
            if (name.equals(currentSet.getValue())) numberOfValues++;
        }
        return numberOfValues;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {

        if (map.containsKey(familiya)) return 1;
        return 0;

    }

    public static void main(String[] args)
    {
        HashMap<String, String> map = Solution.createMap();
        System.out.println(Solution.getCountTheSameFirstName(map, "Ivan"));
        System.out.println(Solution.getCountTheSameLastName(map, "Ivanov1"));
    }

}
