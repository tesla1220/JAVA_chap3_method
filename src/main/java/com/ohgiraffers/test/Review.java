package com.ohgiraffers.test;

public class Review {

    public static void main(String[] args) {

        System.out.println("메소드 동작 실행 시작!!! ");

        Review rev = new Review();
        rev.method1();
        rev.method2(10 , 20);

    }

    public void method1() {

        System.out.println("지은님 감사합니다!!!");
    }

    public void method2(int num1, int num2) {

        System.out.println(num1 + num2);

    }

}
