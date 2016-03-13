package com.lesson8;

public class JavaStudents {
    static Student[] students = new Student[5];//记录学生信息的数组
    static float scoresAverage;//平均分
    static float maxScore;//最高分
    static float minScore;//最低分


    public static void main(String[] args) {

        init();
        count();

    }

    public static void init() {
        Student zhangsan = new Student("2015122801", "张三", "男", "24", "67");
        Student lisi = new Student("2015122802", "李四", "女", "21", "97");
        Student wangwu = new Student("2015122803", "王武", "男", "26", "71");
        Student zhaoliu = new Student("2015122804", "赵六", "男", "23", "87");
        Student tianqi = new Student("2015122805", "田七", "女", "20", "47");

        students[0] = zhangsan;
        students[1] = lisi;
        students[2] = wangwu;
        students[3] = zhaoliu;
        students[4] = tianqi;

    }

    //算分
    public static void count() {
        float total = 0;//总分

        for (int i = 0; i < students.length; i++) {
            students[i].studentInfo();
            float itemScore = Float.parseFloat(students[i].sJava);
            if (i == 0) maxScore = minScore = itemScore;
            total += itemScore;
            minScore = Math.min(minScore, itemScore);
            maxScore = Math.max(maxScore, itemScore);
        }

        scoresAverage = total / students.length;
        System.out.println("同学们的平均分是：" + scoresAverage);
        System.out.println("最高分是：" + maxScore + "\n最低分是：" + minScore);
    }
}
