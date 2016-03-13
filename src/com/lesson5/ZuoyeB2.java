package com.lesson5;

import java.util.Scanner;

/***
 * 个人所得税是指国家对个人所得额征收的一种税,键盘输入工资数，然后根据下表计算交税金额。
 * 表2-1  所得税税率表
 * 级数       全月应纳税所得额      税率/％
 * 1        不超过500元的部分             5
 * 2        超过500元至2000元的部分       10
 * 3        超过2000元至5000元的部分       15
 * 4        超过5000元至20000元的部分       20
 * 5        超过20000元至40000元的部分       25
 * <p>
 * a.  税金 = 工资 * 税率 (简化，实际上计算要复杂)
 *
 * @author OW
 */
public class ZuoyeB2 {

    public static void main(String[] args) {
        final int threshold = 3500;//起征点

        while (true) {
            float tax = 0.0f;
            System.out.println("请输入工资金额");
            Scanner sc = new Scanner(System.in);
            float wage = sc.nextFloat();
            //sc.close();
            float beyond = wage - threshold;


            if (beyond > 20000 && beyond < 40000) {
                tax = beyond * 0.25f;
            } else if (beyond > 5000 && beyond <= 20000) {
                tax = beyond * 0.20f;
            } else if (beyond > 2000 && beyond <= 5000) {
                tax = beyond * 0.15f;
            } else if (beyond > 500 && beyond <= 2000) {
                tax = beyond * 0.10f;
            } else if (beyond <= 5000 && beyond >= 0) {
                tax = beyond * 0.05f;
            } else {
                System.out.println("超出范围！");
                //return;
            }

            System.out.println("您的应缴税金额为：" + tax + "\n");
        }

    }

}
