package gibo1.lab1;

import java.util.Scanner; // Решил сделать ввод ручным потому что так интереснее

public class TestDog {
    public static void main(String[] args) {
        // Запрашивает ввод у пользователя
        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя ");
        String dogName = input.nextLine();
        System.out.println("Введите возраст: ");
        int dogAge = input.nextInt();
        Dog d1 = new Dog(dogName, dogAge);
        Dog d2 = new Dog("Elena", 7);
        Dog d3 = new Dog("Boris");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
