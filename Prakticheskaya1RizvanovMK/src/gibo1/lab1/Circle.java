package gibo1.lab1;

public class Circle {
    // Константы круга
    public static final double DEFAULT_RADIUS = 2.0;
    public static final String DEFAULT_COLOR  = "голубой";

    // Переменные круга
    private double radius;
    private String color;

    // перегруженные конструкторы
    /** Создает конструктор Circle с дефолтными значениями */
    public Circle() {
        this.radius = DEFAULT_RADIUS;
        this.color  = DEFAULT_COLOR;
    }
    /** Создает конструктор Circle с заданным значением radius и дефолтным значением color */
    public Circle(double radius) {
        this.radius = radius;
        this.color = DEFAULT_COLOR;
    }
    /** Создает конструктор Circle с заданным значением radius и color соответственно*/
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /** Возвращает значение radius -  */
    public double getRadius() {
        return this.radius;
    }
    /** Задает значение radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    /** Возвращает значение color */
    public String getColor() {
        return this.color;
    }
    /** Задает значение color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Возвращает самописную строку со значениями круга (Circle) */
    public String toString() {
        return "Круг[радиус = " + radius + ", цвет = " + color + "]";
    }

    /** Возвращает площадь круга */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Возвращает окружность круга */
    public double getCircumference() {
        return 2.0 * radius * Math.PI;
    }
}