package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import sun.security.ssl.HandshakeOutStream;

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> humans = new ArrayList<Human>();
        humans.add(new Human("Superded1", true, 80));
        humans.add(new Human("Superded2", true, 80));
        humans.add(new Human("Superbaba1", false, 80));
        humans.add(new Human("Superbaba2", false, 80));
        humans.add(new Human("Papa", true, 50, humans.get(0), humans.get(2)));
        humans.add(new Human("Mama", false, 45, humans.get(1), humans.get(3)));
        humans.add(new Human("Sin1", true, 30, humans.get(4), humans.get(5)));
        humans.add(new Human("Sin2", true, 25, humans.get(4), humans.get(5)));
        humans.add(new Human("Doughter", false, 30, humans.get(4), humans.get(5)));
        for (Human human:humans){
            System.out.println(human);
        }
    }

    public static class Human
    {
        public String name;
        public boolean sex;
        public int age;
        public Human father, mother;
        public Human(String name,
                     boolean sex,
                     int age,
                     Human father, Human mother){
            this(name, sex, age);
            this.father = father;
            this.mother = mother;
        }
        public Human(String name,
                     boolean sex,
                     int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
