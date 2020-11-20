package chapter3;

import java.util.Scanner;

/*
IF ELSE
All salespeople expected to make at least 10 sales per week
For those who do, they receive a congratulatory message
For those who don't, they are informed of how many sales they were short.
 */
public class QuotaCalculator {
    public static void main(String[] args){
        //Initialize values we know
        int quota = 10;
        // Get unknown values
        System.out.println("Enter the number of sales you made this week:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // Make a decision on the path to take - output
        if(sales >= quota){
            /* can omit curly braces here, since only one statement */
            System.out.println("Congratulations! You've met your quota");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("You did not meet your quota. You were " + salesShort + " sales short");
        }
    }
}
