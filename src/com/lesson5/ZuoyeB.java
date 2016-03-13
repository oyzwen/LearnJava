package com.lesson5;

import java.util.Scanner;

/***
 * 依次输入10个学生成绩，判断学生（优秀、及格、不及格）并计算人数
 * a.键盘输入10个学习成绩.
 * b.优秀 >=80、及格>=60、不及格<60
 * c.分别统计优秀,及格，不及格的人数。
 *
 * @author OW
 */

public class ZuoyeB {

    public static void main(String[] args) {
        float[] scores = new float[10];
        int goodNum = 0;
        int passNum = 0;
        int failNum = 0;

        for (int i = 0; i < scores.length; i++) {
            int curNum = i + 1;
            System.out.println("请输入第" + curNum + "位同学的成绩");
            Scanner sc = new Scanner(System.in);

            float curScore = sc.nextFloat();
            scores[i] = curScore;


            if (curScore >= 80)//good
            {
                goodNum++;
            } else if (curScore >= 60)//pass
            {
                passNum++;
            } else//fail
            {
                failNum++;
            }


            if (i >= scores.length - 1) sc.close();
        }

        System.out.println("获得优秀的同学有" + goodNum + "位");
        System.out.println("及格的同学有" + passNum + "位");
        System.out.println("不及格的同学有" + failNum + "位");
    }

}
