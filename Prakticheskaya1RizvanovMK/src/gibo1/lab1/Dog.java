package gibo1.lab1;

public class Dog {
    private String name;
    private int age;

    public Dog(String n, int a){
        name = n;
        age = a;
    }
    public Dog(String n){
        name = n;
        age = 2;
    }
    public Dog(){
        name = "Рекс";
        age = 3;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name){
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        return this.name+", возраст "+this.age;
    }

    public void intoHumanAge(){
        System.out.println("Человеческий возраст собаки " + name + " " +age*7+" лет");
    }
}
