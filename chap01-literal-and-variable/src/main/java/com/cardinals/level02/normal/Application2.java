package com.cardinals.level02.normal;

public class Application2 {
    public static void main(String[] args) {
        double kor = 80.5;
        double math = 50.6;
        double eng = 70.8;
        int total = (int)(kor + math + eng);
        int avg = total / 3;

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + avg);
    }
}
