package chapter5;

import java.util.Scanner;

/*
* OUR FIRST METHOD
* Write a method that asks a user for their name, then greets them by name.
 */
public class Greetings {
    public static void main(String [] args) {
        // Main method
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greetUser(name);
    }
    // Greet user method
    public static void greetUser (String name) {
        System.out.println("Hi there, " + name);
    }
}

