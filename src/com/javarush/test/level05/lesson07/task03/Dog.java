package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
     //Напишите тут ваш код
        String name;
        double growth;
        String colour;

        static double defaultGrowth = 0.5;

        private void initialize_(String name, double growth, String colour)
        {
            this.name = name;
            this.growth = growth;
            this.colour = colour;
        }

        public void initialize(String name)
        {
            initialize_(name, defaultGrowth, null);
        }
        public void initialize(String name, double growth)
        {
            initialize_(name, growth, null);
        }
        public void initialize(String name, double growth, String colour)
        {
            initialize_(name, growth, colour);
        }
}
