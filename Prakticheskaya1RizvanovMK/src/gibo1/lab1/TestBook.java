package gibo1.lab1;

import java.util.Scanner; // Решил сделать ввод ручным потому что так интереснее

public class TestBook {
    public static void main(String[] args) {
        // Тестируем constructor и toString()
        Scanner input = new Scanner(System.in);
        System.out.println("Введите значения: title, author и pages");
        System.out.println("Название: ");
        String title = input.nextLine();
        System.out.println("Автор: ");
        String author = input.nextLine();
        System.out.println("Количество страниц: ");
        int pages = input.nextInt();
        Book book1 = new Book(title, author, pages);
        System.out.println("Информация о book1");
        System.out.println("↓↓↓↓↓↓↓↓↓");
        System.out.println(book1);

        // Проверяем сеттеры и геттеры

        book1.setTitle("Война и Мир");
        book1.setAuthor("Лев Толстой");
        book1.setPages(1225);

        System.out.println("Информация о book1 с измененными значениями");
        System.out.println("↓↓↓↓↓↓↓↓↓");

        System.out.println(book1);
        System.out.println("Название: " + book1.getTitle());
        System.out.println("Автор: " + book1.getAuthor());
        System.out.println("Количество страниц: " + book1.getPages());
    }
}
