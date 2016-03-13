package com.lesson9;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Flower flower = new Flower();
        flower.setName("鲜花");
        flower.setColor("红色");
        flower.info();

        Flower rose = new Rose();
        rose.setColor("白色");

        rose.info();
    }

}
