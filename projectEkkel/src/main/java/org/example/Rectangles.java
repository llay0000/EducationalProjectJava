package org.example;

public class Rectangles {
    private double a;
    private double b;

    public Rectangles(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static void P(int a, int b){

    }
    public static double P(double a, double b){
        return a * 2 + b * 2;
    }
    //    public static int S(int a, int b){
//
//    }
    public static double S(double a, double b){
        return a * b;
    }
}

