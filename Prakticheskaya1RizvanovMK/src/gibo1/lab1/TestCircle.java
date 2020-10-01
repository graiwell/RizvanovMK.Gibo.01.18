package gibo1.lab1;

import java.util.Scanner; // Решил сделать ввод ручным потому что так интереснее

// Демонстирует работу класса Circle.java
public class TestCircle {
    public static void main(String[] args) {
        // Тестируем constructor и toString()
        Scanner input = new Scanner(System.in);
        System.out.println("Введите значения: цвет и радиус");
        System.out.println("Цвет: ");
        String color = input.nextLine();
        System.out.println("Радиус: ");
        double radius = input.nextDouble();
        Circle c1 = new Circle(radius, color);
        System.out.println("Значения круга c1: ");
        System.out.println("↓↓↓↓↓↓↓↓↓");
        System.out.println(c1); // выводим параментры круга
        Circle c2 = new Circle(2.2);
        System.out.println("Значения круга c2: ");
        System.out.println("↓↓↓↓↓↓↓↓↓");
        System.out.println(c2);
        Circle c3 = new Circle();
        System.out.println("Значения круга c3: ");
        System.out.println("↓↓↓↓↓↓↓↓↓");
        System.out.println(c3);

        // Проверяем сеттеры и геттеры
        c1.setRadius(3.3);
        c1.setColor("оранжевый");
        System.out.println("Измененные значения круга c1: ");
        System.out.println("↓↓↓↓↓↓↓↓↓");
        System.out.println(c1);  // Проверяем измененное значение c1
        System.out.println("Радиус: " + c1.getRadius());

        System.out.println("Цвет: " + c1.getColor());


        // Проверить методы getArea() и getCircumference() т.е. нахождение площади и окружности
        System.out.printf("Площадь круга: %.2f%n", c1.getArea());

        System.out.printf("Окружность круга: %.2f%n", c1.getCircumference());

    }
}