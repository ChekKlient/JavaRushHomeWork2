package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут

        Man man1 = new Man("Igor", "Odessa" , 20);
        Man man2 = new Man("Igor", "Odessa" , 20);

        Woman woman1 = new Woman("Julia", "Odessa" , 20);
        Woman woman2 = new Woman("Julia", "Odessa" , 20);
        //выведи их на экран тут

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
    }

    //добавьте тут ваши классы
    public static class Man
    {
        String name;
        String address;
        int age;
        public Man(String name)
        {
            this.name = name;
        }
        public Man(String name, String address)
        {
            this(name);
            this.address = address;
        }
        public Man(int age)
        {
            this("", "");
            this.age = age;
        }
        public Man(String name, String address, int age)
        {
            this(name, address);
        }
        public String toString() {
            return "" + name + " " + age + " " + address ;
        }

    }
    public static class Woman
    {
        String name;
        String address;
        int age;
        public Woman(String name)
        {
            this.name = name;
        }
        public Woman(String name, String address)
        {
            this(name);
            this.address = address;
        }
        public Woman(int age)
        {
            this("", "");
            this.age = age;
        }
        public Woman(String name, String address, int age)
        {
            this(name, address);
        }
        public String toString() {
            return "" + name + " " + age + " " + address ;
        }

    }
}
