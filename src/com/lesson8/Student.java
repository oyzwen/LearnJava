package com.lesson8;

public class Student {

    String sNO;//学号
    String sName;//姓名
    String sSex;//性别
    String sAge;//年龄
    String sJava;//java成绩


    public Student(String sNO, String sName, String sSex, String sAge, String sJava) {
        this.sNO = sNO;
        this.sName = sName;
        this.sSex = sSex;
        this.sAge = sAge;
        this.sJava = sJava;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }


    public String getsNO() {
        return sNO;
    }


    public void setsNO(String sNO) {
        this.sNO = sNO;
    }


    public String getsName() {
        return sName;
    }


    public void setsName(String sName) {
        this.sName = sName;
    }


    public String getsSex() {
        return sSex;
    }


    public void setsSex(String sSex) {
        this.sSex = sSex;
    }


    public String getsAge() {
        return sAge;
    }


    public void setsAge(String sAge) {
        this.sAge = sAge;
    }


    public String getsJava() {
        return sJava;
    }


    public void setsJava(String sJava) {
        this.sJava = sJava;
    }

    public void studentInfo() {
        System.out.println("--------------------\n学号：" + this.sNO + "\n姓名：" + this.sName + "\n性别：" + this.sSex + "\n年龄：" + this.sAge + "\nJava成绩：" + this.sJava + "\n");
    }
}
