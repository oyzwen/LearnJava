package com.lesson5;

public class FunctionDemo {

    public static void main(String[] args) {
        // 无参函数
        test();

        //有参数 有返回值
        int a = 3;
        int b;
        b = result(a);
        System.out.println(b);
    }

    public static void test() {
        System.out.println("没有参数,没用返回值");
    }


    /***
     * 参数乘以2的结果
     *
     * @param num 参数
     * @return 整型
     */
    public static int result(int num) {
        return num * 2;
    }
}
