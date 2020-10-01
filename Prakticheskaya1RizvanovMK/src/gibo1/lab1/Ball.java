package gibo1.lab1;
import java.util.Scanner;

public class Ball {
    // Переменные
    private double x, y, xStep, yStep;

    /** Создает мячик с заданными параметрами */
    public Ball(double x, double y, double xStep, double yStep) {
        this.x = x;
        this.y = y;
        this.xStep = xStep;
        this.yStep = yStep;
    }

    // Геттеры и сеттеры для переменных
    public double getX() {
        return this.x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return this.y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getXStep() {
        return this.xStep;
    }
    public void setXStep(double xStep) {
        this.xStep = xStep;
    }
    public double getYStep() {
        return this.yStep;
    }
    public void setYStep(double yStep) {
        this.yStep = yStep;
    }

    /** Возвращает самописную строку с выводом информации мячика */
    public String toString() {
        return "Позиция мячика (" + x + "," + y + "), скорость=(" + xStep + "," + yStep + ")";
    }

    /** Возвращает позицию мяча  (x,y) */
    public double[] getXY() {
        double[] results = new double[2];
        results[0] = this.x;
        results[1] = this.y;
        return results;
    }
    /** Задает позицию мячику (x,y) */
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    /** Возвращает xStep и yStep в формате double */
    public double[] getXYStep() {
        double[] results = new double[2];
        results[0] = this.xStep;
        results[1] = this.yStep;
        return results;
    }
    /** Задает xStep и yStep */
    public void setXYStep(double xStep, double yStep) {
        this.xStep = xStep;
        this.yStep = yStep;
    }

    /** Перемещает шаг за шагом x и y с учетом xStep и yStep соответственно. */
    public Ball move() {
        x += xStep;
        y += yStep;
        return this;
    }
}