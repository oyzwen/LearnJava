package com.lesson8;

public class Circle {

    float radius;//半径
    float area;//面积
    float perimeter;//周长

    public Circle(float r) {
        this.radius = r;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getArea() {
        this.area = (float) (3.14 * Math.pow(radius, 2));
        return area;
    }

    public float getPerimeter() {
        this.perimeter = (float) (3.14 * 2 * radius);
        return perimeter;
    }

    public void printCircleInfo() {
        System.out.println("该圆的半径是：" + this.radius);
        System.out.println("该圆的面积是：" + this.getArea());
        System.out.println("该圆的周长是：" + this.getPerimeter());
    }

}
