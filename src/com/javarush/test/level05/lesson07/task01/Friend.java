package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //Напишите тут ваш код
    String name;
    int age;
    String sex;
    public void initialize(String name)
    {
        this.name = name;
    }
    public void initialize(String name, int age)
    {
        initialize(name);
        this.age = age;
    }
    public void initialize(String name, int age, String sex)
    {
        initialize(name, age);
        this.sex = sex;
    }

}
