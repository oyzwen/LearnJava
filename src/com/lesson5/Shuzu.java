package com.lesson5;

import java.util.Scanner;

public class Shuzu {

    public static void main(String[] args) {
        //Scanner int
        /*Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字");
		int i = sc.nextInt();
		System.out.println("你输入的是" + i);
		*/
		
		/*Scanner sc1 = new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String str = sc1.nextLine();
		System.out.println("你输入的是" + str);
		*/


        int[] i = new int[3];
        for (int n = 0; n < i.length; n++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入3个数字");
            i[n] = sc.nextInt();
            if (n == 2) sc.close();
        }


        for (int j = 0; j < i.length; j++) {
            System.out.println("数组的值是" + i[j]);

        }
    }

}
