package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone1", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("DECEMBER 1 1980"));
        map.put("Stallone3", new Date("JULY 1 1980"));
        map.put("Stallone4", new Date("SEPTEMBER 1 1980"));
        map.put("Stallone5", new Date("MAY 1 1980"));
        map.put("Stallone6", new Date("MAY 1 1980"));
        map.put("Stallone7", new Date("JUNE 1 1980"));
        map.put("Stallone8", new Date("JUNE 1 1980"));
        map.put("Stallone9", new Date("JUNE 1 1980"));
        map.put("Stallone0", new Date("JUNE 1 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        HashSet<String> forRemove = new HashSet<String>();

        for (Map.Entry<String, Date> currentEntry:map.entrySet())
        {
            int currentMonth = currentEntry.getValue().getMonth();
            if (currentMonth > 4 && currentMonth < 8)
                forRemove.add(currentEntry.getKey());
        }
        for (String currentEntryKey:forRemove) map.remove(currentEntryKey);
    }

    public static void main(String[] args)
    {
        HashMap<String, Date> map = Solution.createMap();
        System.out.println(map);
        Solution.removeAllSummerPeople(map);
        System.out.println(map);
    }

}
