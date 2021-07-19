package com.geekbrains.lesson1;

public class Cat {

    //private default protected public


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private String color;
    private int age;

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
