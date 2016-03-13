package com.lesson7;

/***
 * 1. 打印五星金字塔
 * <p>
 * *
 * 中       *
 * *   *   *
 * a. 双循环实现
 * b. 注意判断位置,注意"中"字
 *
 * @author OW
 */

public class Star {

    public static void main(String[] args) {

        int centerNum = 6;//塔顶那颗星的位置

        for (int i = 0; i < centerNum / 2 + 1; i++) {
            int firstStarPos = centerNum - i * 2;//每排第一课星的位置

            for (int j = 0; j <= centerNum * 2; j++) {
                //判断该位置是否应该显示*
                if (j == firstStarPos || ((j - firstStarPos) % 4 == 0) && j > firstStarPos && j <= firstStarPos + 4 * i) {
                    if (i == 2 && j == centerNum)//特殊情况 显示"中"
                    {
                        System.out.print("中    ");//得加空格才能对齐，不知道为什么。。。
                        continue;
                    }

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }
    }
}
