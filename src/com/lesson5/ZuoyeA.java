package com.lesson5;

import java.util.Scanner;

/***
 * 输入5个学生的成绩 计算平均分并输出
 *
 * @author ow
 */

public class ZuoyeA {
    static float[] scores = new float[5];
    static float total = 0.0f;

    public static void main(String[] args) {

        for (int i = 0; i < scores.length; i++) {
            int curNum = i + 1;
            System.out.println("请输入第" + curNum + "位同学的成绩");
            Scanner sc = new Scanner(System.in);
            scores[i] = sc.nextFloat();
            total += scores[i];

            if (i >= 4) {
                sc.close();
                average();
            }
        }
    }

    public static void average() {
        System.out.println("ͬ同学们的平均分是" + total / scores.length);
    }

}
