package com.ohgiraffers.test;

public class Practice {

    public static void main(String[] args) {

        Practice prt = new Practice();
        int num=10;
        int num2 = 20;
        System.out.println(prt.plus(num, num2));
        System.out.println(prt.minus(10, 20));

    }

    public int plus (int number1, int number2) {
        return number1 + number2;


    }

    public int minus (int number1, int number2){

        return number1 - number2;

    }

}
