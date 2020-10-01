package gibo1.lab1;

import java.util.Arrays;
import java.util.Scanner; // Решил сделать ввод ручным потому что так интереснее

public class TestBall {
    public static void main(String[] args) {
        // Тестируем constructor и toString()
        Scanner input = new Scanner(System.in);
        System.out.println("Введите значения: x, y, xStep и yStep");
        System.out.println("Значение x");
        double x = input.nextInt();
        System.out.println("Значение у");
        int y = input.nextInt();
        System.out.println("Значение xStep");
        int xStep = input.nextInt();
        System.out.println("Значение yStep");
        int yStep = input.nextInt();
        Ball b1 = new Ball(x, y, xStep, yStep);
        System.out.println("Позиция и скорость мячика с входными данными пользователя: ");
        System.out.println("↓↓↓↓↓↓↓↓↓");
        System.out.println(b1);  // toString()


        // Проверяем сеттеры и геттеры
        b1.setX(3);
        b1.setY(4);
        b1.setXStep(13);
        b1.setYStep(14);
        System.out.println("         ");
        System.out.println("Позиция и скорость мячика с прописанными значениями в ide: ");
        System.out.println("↓↓↓↓↓↓↓↓↓");
        System.out.println(b1);
        //Ball@(3.0,4.0),speed=(13.0,14.0)
        System.out.println("x : " + b1.getX());

        System.out.println("y : " + b1.getY());

        System.out.println("xStep : " + b1.getXStep());

        System.out.println("yStep : " + b1.getYStep());


        // Тестируем методы setXY(), getXY(), setXYStep(), getXYStep()
        b1.setXY(5, 6);
        b1.setXYStep(15, 16);
        System.out.println(b1);  // toString()

        System.out.println("x и y : " + Arrays.toString(b1.getXY()));  // Выводим позицию

        System.out.println("xStep и yStep : " + Arrays.toString(b1.getXYStep()));


        // Протестировать метод move()
        System.out.println(b1.move());  // toString()
        System.out.println(b1.move().move().move());

    }
}