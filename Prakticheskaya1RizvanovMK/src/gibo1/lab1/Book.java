package gibo1.lab1;


public class Book {
    // The private instance variables
    private String title;
    private String author;
    private int pages;


    /**
     * Создает конструктор Book
     */
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // Геттеры и сеттеры


    /** Возрващает название */
    public String getTitle() {
        return this.title;
    }
    /** Задает название */
    public void setTitle(String title) {
        this.title = title;
    }

    /** Возрващает автора */
    public String getAuthor() {
        return this.author;
    }

    /** Задает автора
     *
     */
    public void setAuthor(String author) {
        this.author = author;
    }
    /** Возрващает количество страниц */
    public int getPages() {
        return this.pages;
    }

    /** Задает количество страниц */
    public void setPages(int pages) {
        this.pages = pages;
    }

    /** Возвращает самописную строку с выводом информации о книге */
    public String toString() {
        return "Информация о книге: Название: " + title + ", Автор: " + author+ " и Количество страниц: " + pages;
    }
}