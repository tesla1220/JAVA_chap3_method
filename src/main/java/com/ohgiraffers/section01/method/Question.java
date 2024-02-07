package com.ohgiraffers.section01.method;

public class Question {

    public static void main(String[] args) {

        int a = 10; // 일때

        System.out.println(++a);        // a = 10 , 1 + 10 = 11
        System.out.println(a++);        // 11
        System.out.println(a++);        // 12
        System.out.println(++a);        // 14



            int x = 900000;   //  x * y 는  630,000,000,000입니다.
            int y = 700000;
            long z =  (long)x * (long)y;
            System.out.println("z : " + (int)z );

        // 다섯 자리의 정수를 12345가 있습니다. 각 자리의 숫자를 모두 더한 결과를 출력하세요.
        // 출력값은 1 + 2 + 3 + 4 + 5 = 15 입니다.

//        int a = 12345;

        int q = a / 10000; // 1
        int w = (a % 10000) / 1000; // 2
        int e = (a % 1000) / 100; // 3
        int r = (a % 100) / 10; // 4
        int t = a % 10; // 5

        System.out.println(q+w+e+r+t);







    }
}
