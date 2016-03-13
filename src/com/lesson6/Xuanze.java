package com.lesson6;

public class Xuanze {

    public static void main(String[] args) {
        //选择语句if
        int a = 3;
        int b = 6;

        if (a > b) {
            System.out.println("a大于b");
        } else if (a == b) {
            System.out.println("a等于b");
        } else {
            System.out.println("a小于b");
        }

        //判断当前是星期几
        int week = 5;

        switch (week) {
            case 1:
                System.out.println("今天是星期一");
                break;

            case 2:
                System.out.println("今天是星期二");
                break;

            case 3:
                System.out.println("今天是星期三");
                break;

            case 4:
                System.out.println("今天是星期四");
                break;

            case 5:
                System.out.println("今天是星期五");
                break;

            default:
                System.out.println("今天是周末");
        }
    }

}
