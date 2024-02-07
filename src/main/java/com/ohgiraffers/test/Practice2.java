package com.ohgiraffers.test;

public class Practice2 {

    public static void main(String[] args) {

        Practice2 prt2 = new Practice2();
        System.out.println(prt2.method1());
        String hi = "문자열";
        System.out.println(prt2.method2(hi));
    }

    public String method1 () {

        return "안녕!!";

    }

    public String method2(String bye) {

        return bye;
    }
}
