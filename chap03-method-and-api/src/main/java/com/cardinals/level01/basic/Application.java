package com.cardinals.level01.basic;

public class Application {
    public static void main(String[] args) {
        Calculator cc = new Calculator();

        cc.checkMethod();
        System.out.println("1부터 10까지의 합 : " + cc.sum1to10());
        cc.checkMaxNumber(10, 20);
        System.out.println("10과 20의 합은 : " + cc.sumTwoNumber(10, 20));
        System.out.println("10과 5의 차는 : " + cc.minusTwoNumber(10, 5));
    }
}
