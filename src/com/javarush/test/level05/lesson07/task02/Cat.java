package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //Напишите тут ваш код
    String name;
    int weight;
    int age;
    String colour;
    String address;
    static int defaultWeight = 20;
    static int defaultAge = 5;

    private void initialize_(String name, int weight, int age, String colour, String address)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.colour = colour;
        this.address = address;
    }

    public void initialize(String name)
    {
        initialize_(name, defaultWeight, defaultAge, null, null);
    }
    public void initialize(String name, int weight, int age)
    {
        initialize_(name, weight, age, null, null);
    }
    public void initialize(String name, int age)
    {
        initialize_(name, defaultWeight, age, null, null);
    }
    public void initialize(int weight, String colour)
    {
        initialize_(null, defaultWeight, defaultAge, colour, null);
    }
    public void initialize(int weight, String colour, String address)
    {
        initialize_(null, weight, defaultAge, colour, address);
    }
    //Напишите тут ваш код

}
