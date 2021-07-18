package com.geekbrains.lesson1;

public class Cat {
    String name;
    String color;
    int age;

    public Cat(String name, String color, int age){
        this.name = name;
        this.age = age;
        this.color = color;

    }

    public void info() {
        System.out.println(name + " meow" + "" + color + "" + age);
    }

    public void meow() {
        System.out.println(name + " meow");
    }
}
