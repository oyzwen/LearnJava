package com.lesson6;

import java.util.Scanner;

/***
 * 1 . 公司给全体员发红包，工程师500，部门主管 1000，副总2000。
 * a. 键盘输入5个姓名和职称；
 * b. 考虑用常量代替职称；
 * c. 用switch分支累加本次需要发放的金额；
 * d. 输出每个人发放金额和总金额；
 *
 * @author OW
 */
public class ZuoyeB {

    public static void main(String[] args) {
        final int ENG = 0; //engineer 工程师
        final int DM = 1; //department Manager 部门主管
        final int VP = 2; //voice  president  副总

        int[] position = new int[5];//职称代号数组
        String[] names = new String[5];//姓名数组
        int totalPay = 0; //需要支付的总金额

        //记录输入信息
        for (int i = 0; i < names.length; i++) {
            System.out.println("请输入姓名");
            Scanner scName = new Scanner(System.in);
            //String curName = sc.nextLine();
            names[i] = scName.nextLine();
            System.out.println("您输入的姓名是：" + names[i] + "\n");
            //scName.close();

            System.out.println("请输入职称代号");
            Scanner scPosition = new Scanner(System.in);
            position[i] = scPosition.nextInt();
            System.out.println(names[i] + "的职称是：" + position[i] + "\n");
            //scPosition.close();
        }

        //计算每位员工红包金额，并累计总额
        for (int j = 0; j < position.length; j++) {
            int curPay = 0;

            switch (position[j]) {
                case ENG:
                    curPay = 500;
                    System.out.println("姓名：" + names[j] + "--ENG------红包金额：" + curPay);
                    totalPay += curPay;
                    break;

                case DM:
                    curPay = 1000;
                    System.out.println("姓名：" + names[j] + "--DM------红包金额：" + curPay);
                    totalPay += curPay;
                    break;

                case VP:
                    curPay = 2000;
                    System.out.println("姓名：" + names[j] + "--VP------红包金额：" + curPay);
                    totalPay += curPay;
                    break;

                default:
                    System.out.println("该员工信息输入有误！");
            }
        }

        System.out.println("总金额为：" + totalPay);
    }

}
