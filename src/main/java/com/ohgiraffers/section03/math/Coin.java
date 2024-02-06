package com.ohgiraffers.section03.math;

public class Coin {

    public static void main(String[] args) {
        Coin.method(770);
    }
    public static void method(int x) {

        int coin500 = x/500;  //coin500=1
        x = x%500;       // 현재 x의 값은 270
        int coin100 = x/100;     //coin100= 2
        x = x%100;               // 현재 x의 값은 70
        int coin50 = x/50;      // coin50= 1
        x = x%50;           // 현재 x의 값은 20
        int coin10 = x/10; //coin10 = 2
        x = x%10;    //현재 x는 0

        int numOfCoins = coin500+coin100+coin50+coin10;
        System.out.println(numOfCoins);

    }


}
