package org.ellycode.helloworld;

import java.util.Random;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World");

//
//        System.out.println("Enter");
////        Scanner scanner = new Scanner(System.in);
////        int num = scanner.nextInt();
////        System.out.println("NUmber that is entered#:"+num);

        Random random = new Random();
        int number = random.nextInt(20);
        System.out.println(number);

    }
}
