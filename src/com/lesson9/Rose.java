package com.lesson9;

public class Rose extends Flower {
    public Rose() {
        this.setName("玫瑰花");
    }

    public void info() {
        System.out.println("这是玫瑰花,它的颜色是" + this.getColor());

    }
}
