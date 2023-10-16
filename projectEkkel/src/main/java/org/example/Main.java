package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static ru.exxo.jutil.Printer.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Задания 1
        //String str = scanner.nextLine();
//        for (int i = 0; i < str.length(); i++) {
//            println(str.charAt(i));
//        }
        // Задания 2
//        int size = scanner.nextInt();
//
//        String[] mac = new String[size];
//        for (int i = 0; i < size; i++) {
//            mac[i] = scanner.next();
//        }
//        for (int i = 0; i < mac.length; i++) {
//            println(mac[i]);
//        }
//        String longestString = "";
//        for (String str : mac) {
//            if (str.length() > longestString.length()) {
//                longestString = str;
//            }
//        }
//
//        println("Самая длинная строчечка: " + longestString);

        // Задания 3

//                String input = scanner.nextLine();
//
//                int sum = 0;
//                for (int i = 0; i < input.length(); i++) {
//                    char c = input.charAt(i);
//                    if (Character.isDigit(c)) {
//                        int digit = Character.getNumericValue(c);
//                        sum += digit;
//                    }
//                }
//
//               println(sum);
        // Задания 4
       String st = scanner.nextLine();
       String b = "";

        for (int i = st.length()-1; i >= 0 ; i--) {
           char a = st.charAt(i);
           b+=a;
        }
        println(b);
    }
}

