package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    double left;
    double top;
    double width;
    double height;
    
    public void initialize(    double left, double top, double width, double height)
    {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }
    public void initialize(    double left, double top)
    {
        initialize(left, top, 0, 0);
    }
    public void initialize(    double left, double top, double width)
    {
        initialize(left, top, width, width);
    }

    public void initialize(Rectangle rectangle)
    {
        initialize(rectangle.left, rectangle.top, rectangle.width, rectangle.height);
    }

}
