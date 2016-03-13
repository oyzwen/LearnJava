package com.lesson7;

import java.util.Scanner;

/***
 * 1、 实现会员用户名密码注册，验证输入数据正确性。（字符串） 。
 * a. 用scanner分别输入一个用户名，两个密码。
 * b.要求用户名长度不小于3。
 * c.密码长度不小于6，且两端不能有空格。
 * d. 注册时两次输入密码必须相同。
 * e.输出用户名密码设置“通过”或者“不通过”和原因
 *
 * @author OW
 */

public class ZuoyeB1 {

    public static void main(String[] args) {
        String username = "";
        String password = "";

        //输入用户名
        while (true) {
            System.out.println("请输入您想申请的用户名:");
            Scanner scUsername = new Scanner(System.in);

            String strUsername = scUsername.nextLine();
            boolean usernameAvailable = checkUsername(strUsername);
            if (usernameAvailable) {
                username = strUsername;//通过验证，保存用户名
                break;
            }
        }

        //输入密码
        while (true) {
            System.out.println("请输入您想设置的密码:");
            Scanner scPassword = new Scanner(System.in);
            String strPassword = scPassword.nextLine();
            boolean passwordAvailable = checkPassword(strPassword);
            if (passwordAvailable) {
                System.out.println("密码通过验证");
                password = strPassword;//通过验证，保存密码
            } else {
                continue;
            }

            System.out.println("请再次输入您的密码:");
            Scanner scPassword2 = new Scanner(System.in);

            if (password.equals(scPassword2.nextLine())) {
                System.out.println("您的密码设置成功！");

                break;
            } else {
                System.out.println("两次密码不一致，密码设置不成功！");

                continue;
            }

        }


    }

    //用户名合法性验证
    public static boolean checkUsername(String str) {
        if (str.length() >= 3) {
            System.out.println("你输入的用户名为" + str + "，该用户名可用。");
            return true;
        } else {
            System.out.println("用户名长度不能小于3！\n\n");
            return false;
        }
    }

    //密码合法性验证
    public static boolean checkPassword(String str) {
        if (str.length() < 6) {
            System.out.println("密码长度不能小于6！");
            return false;
        }

        if (str.charAt(0) == 32 || str.charAt(str.length() - 1) == 32) {
            System.out.println("密码首尾不能为空格！");
            return false;
        }

        return true;
    }

}
