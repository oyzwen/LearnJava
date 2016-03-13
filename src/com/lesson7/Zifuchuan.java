package com.lesson7;

public class Zifuchuan {

    public static void main(String[] args) {
        // 字符串连接
        String str = "I am";
        String str2 = "一个程序员";
        int i = 2015;
        float f = 1.25f;

        //获取字符串信息
        String s = str + str2 + i + f;
        System.out.println(s);
        System.out.println(s.length());

        int pos = s.indexOf("a");
        System.out.println("a的位置是" + pos);
    }

}
