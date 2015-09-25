package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human child1 = new Human("child1", true, 10, new ArrayList<Human>());
        Human child2 = new Human("child2", false, 20, new ArrayList<Human>());
        Human child3 = new Human("child3", true, 5, new ArrayList<Human>());
        ArrayList<Human> children = new ArrayList<Human>();
        children.add(child1);
        children.add(child2);
        children.add(child3);
        Human father = new Human("father", true, 40, children);
        Human mother = new Human("mother", false, 35, children);
        children.clear();
        children.add(father);
        Human granFather = new Human("granFather", true, 60, children);
        Human granMother = new Human("granMother", false, 60, children);
        children.clear();
        children.add(mother);
        Human granFather2 = new Human("granFather", true, 60, children);
        Human granMother2 = new Human("granMother", false, 60, children);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(granFather);
        System.out.println(granMother);
        System.out.println(granFather2);
        System.out.println(granMother2);
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
