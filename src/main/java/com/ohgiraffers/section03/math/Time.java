package com.ohgiraffers.section03.math;

public class Time {

    /* x 초가 주어졌을때 (x 는 항상 3600보다 크다.)  a 시간 b 분 c 초 형식으로 변환하여 출력하는 메소드를 구현해라. */

    public static void main(String[] args) {

        Time.method(3690);}

        public static void method(int second){

        int hour = second / 3600;       // 3690/3600 = 1 , hour는 1
        second %= 3600;    // 3690%3600 = 90
        int minute = second / 60;       //  90/60 = 1 ,. minute는 1
        second %= 60;   // minute / 60;

        // minute = 90/60 , second는 30

            System.out.println(hour + "시" + minute + "분" + second + "초" );


    }



}
