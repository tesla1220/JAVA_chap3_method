package com.ohgiraffers.test;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. 메소드의 호출 흐름을 연습해보자 ! */
        System.out.println("main 프로그램이 시작됩니다...");

        Application01 app1 = new Application01();
        app1.testMethod1();


        System.out.println("main 프로그램이 모든 작업을 종료 후 없어집니다...");
    }


    public void testMethod1() {

        System.out.println("안녕 나는 testMethod1 이야 불렀니?");

        testMethod2();

        System.out.println("나는 내 용무를 마쳤으니 돌아가볼게");
    }


    public void testMethod2() {

        System.out.println("하이 나는 testMethod2야 불렀니?");

//        System.out.println(testMethod3());    값 자체를 출력문에 넣어서 출력을 한 상태
        String hi = testMethod3();
//        System.out.println("hi : " + hi);     값을 변수 공간에 담아서 출력을 한 상태


        System.out.println("나도 용무 마쳤으니 돌아가볼게~~~~~");

        // return;
    }

    // void는 값들 출력만하고 끝. 아무것도 가져가지 않고 호출된 곳으로 돌아감

    public String testMethod3() {

        return "안녕 불렀어?";       //String 이므로 문자열 제공


    }


    // String은 문자형을 가지고 돌아간다.

}
