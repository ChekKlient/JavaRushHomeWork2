package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat()
    {
    }

    // calculate power according to parameters
    public int getPower()
    {
        int goodWeight = 20;
        int goodAge = 5;
        return Math.max(0, strength - 10 *  Math.max(weight - goodWeight,  goodWeight - weight) / weight * Math.max(age - goodAge, goodAge - age) / age );
    }
    public boolean fight (Cat anotherCat)
    {
        return this.getPower() > anotherCat.getPower();
    }
}
