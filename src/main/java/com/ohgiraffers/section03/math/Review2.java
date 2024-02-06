package com.ohgiraffers.section03.math;

public class Review2 {

    public static void main(String[] args) {

       Review2 rev2 = new Review2();
       rev2.method2();

    }

    public void method1 () {
        System.out.println("whatever");
    }

    public void method2 () {
        method1();
    }

}
