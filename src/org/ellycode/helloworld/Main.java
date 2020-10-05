package org.ellycode.helloworld;

public class Main {
    public static void main(String[] args) {
        Bird pheonix = new Bird("birdyy", "Blue",2, false,2);
        System.out.println(pheonix.getName());
        pheonix.eat("Bird Seed");


        System.out.println(pheonix.getWings());
        pheonix.fly();
    }

}
