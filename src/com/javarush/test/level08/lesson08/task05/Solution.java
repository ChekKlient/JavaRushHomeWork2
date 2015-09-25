package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Ivanov1", "Ivan");
        map.put("Ivanov2", "Petr");
        map.put("Ivanov3", "Nikolay");
        map.put("Ivanov4", "Stepan");
        map.put("Ivanov5", "Nikolay");
        map.put("Ivanov6", "Konstantin");
        map.put("Ivanov7", "Ivan");
        map.put("Ivanov8", "Ivan");
        map.put("Ivanov9", "Ivan");
        map.put("Ivanov0", "Ivan");
return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashSet<String> usedValues =new HashSet<String>();
        HashSet<String> duplicateValues =new HashSet<String>();
        HashSet<String> duplicateKeys =new HashSet<String>();

        for (String currentValue: map.values()) if (usedValues.contains(currentValue)) duplicateValues.add(currentValue);
        else usedValues.add(currentValue);

        for (Map.Entry<String, String> currentMapElement:map.entrySet())
            if (duplicateValues.contains(currentMapElement.getValue())) duplicateKeys.add(currentMapElement.getKey());

        for (String currentKey:duplicateKeys) map.remove(currentKey);

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
    public static void main(String[] args)
    {
        HashMap<String, String> map = Solution.createMap();
        System.out.println(map);
        Solution.removeTheFirstNameDuplicates(map);
        System.out.println(map);
    }
}
