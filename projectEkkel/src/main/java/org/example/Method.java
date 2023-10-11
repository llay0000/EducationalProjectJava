package org.example;
import java.util.Scanner;

public class Method {
    public static int triangleOne;
    public static int triangleTwo;
    public static void main(String[] args){

        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        System.out.println(triangleOne(num));
        int sideOne = number.nextInt();
        int sideTwo = number.nextInt();
        int sideThree = number.nextInt();
        System.out.println(triangleTwo(sideOne,sideTwo,sideThree));

    }

    private static int triangleOne(int numberTriangle){
        return numberTriangle;
    }
    public static String triangleTwo(int sideOne, int sideTwo, int sideThree){
        String аnswer;
        if (sideOne < sideThree && sideTwo < sideThree ) {
            аnswer = "Это треугольник";
        }
        else{
            аnswer = "Это не треугольник";
        }
        return аnswer;
    }
}
