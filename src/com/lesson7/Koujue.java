package com.lesson7;

/***
 * 2. 打印九九乘法口诀表
 * 1*1=1
 * 1*2=2 2*2=4
 * 1*3=3 2*3=6 3*3=9
 * ...
 * a. 双循环实现
 * b. 先横向打印一次，然后再纵向打印一次
 *
 * @author OW
 */
public class Koujue {
    public static void main(String[] args) {
        printHorizontal();
        System.out.println("\n\n");
        printVertical();
    }

    //竖向打印
    public static void printVertical() {
        for (int i = 1; i <= 9; i++) {
            for (int j = i; j <= 9; j++) {
                System.out.print(i + " * " + j + " = " + i * j + "    ");
                if (i * j < 10) System.out.print(" ");//为了对齐
            }
            System.out.println("");
        }
    }

    //横向打印
    public static void printHorizontal() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + i * j + "    ");
                if (i * j < 10) System.out.print(" ");//为了对齐
            }
            System.out.println("");
        }
    }
}