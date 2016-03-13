package com.lesson9;

public class Flower {
    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void info() {
        System.out.println("花的名字是：" + this.getName() + ",花的颜色是：" + this.getColor());
    }

}
