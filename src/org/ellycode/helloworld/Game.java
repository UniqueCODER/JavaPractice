package org.ellycode.helloworld;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Hello welcome to Guess the number!");
        System.out.println("Enter your Name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello"+name);
        System.out.println("Shall we start?");
        System.out.println("press 1 to start....");
        int answer = scanner.nextInt() ;

        if (answer==1) {
            Random random = new Random();
            int number = random.nextInt(20);
            int guess, count = 0;
            guess = scanner.nextInt();
            while (number != guess || count <= 5) {
                if (number == guess && count <= 5) {
                    count++;
                    System.out.println("You got it right!, number of guesses" + count);
                    break;
                } else if (number != guess && count < 5) {
                    count++;
                    System.out.println("Keep Guessing");
                    continue;

                } else {
                    System.out.println("Reached # of guess!");
                    break;
                }

            }
        }
        else{
            System.out.println("Please restart the game");
        }
    }
}
