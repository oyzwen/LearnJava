package com.lesson7;

/***
 * 把字符串“我是一个java初学者”，拆开每个字打印一行
 *
 * @author OW
 */
public class ZuoyeA {

    public static void main(String[] args) {
        String str = "我是一个java初学者";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

}
