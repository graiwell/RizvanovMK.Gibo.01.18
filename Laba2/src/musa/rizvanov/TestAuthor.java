package musa.rizvanov;

public class TestAuthor {
    public static void main(String[] args) {
        Author first = new Author("Musa Rizvanov", "musarizvanov@mail.ru", 'M');
        Author second = new Author("Eugene Kaspersky", "kaspersky@gmail.com", 'M');
        System.out.println("Author #1: " + first);
        System.out.println("Author #2: " + second);
        System.out.println(first.getName()); // Тестирую геттеры
        first.setEmail("newrizvanov@gmail.com"); // сеттеры
        System.out.println(first.getEmail());
        System.out.println("Author #1 new info: " + first);
        }
    }

