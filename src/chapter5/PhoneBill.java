package chapter5;

import java.util.Scanner;

public class PhoneBill {
    public static void main (String [] args) {
        // initialize what we know
        Scanner scanner = new Scanner(System.in);

        // Get what we don't know
        System.out.println("Enter your plan cost: ");
        double cost = scanner.nextDouble();

        System.out.println("How many minutes were you over? ");
        double over = scanner.nextDouble();

        scanner.close();

        double overageCost = get_overage(over);
        double tax = get_tax(cost + overageCost);

        showBill(cost, overageCost, tax);
    }

        // calculate overage, tax, and total
        public static double get_overage(double over){
            double rate = 0.25;
            double overage = over * rate;
            return overage;
        }

        public static double get_tax(double subtotal){
            double rate = 0.15;
            double tax = Math.round((subtotal * rate)*100) / 100;
            return tax;
        }

        public static void showBill(double cost, double overage, double tax) {
            double total = cost + overage + tax;
            System.out.println("Phone Bill Statement: ");
            System.out.println("Plan: $" + cost);
            System.out.println("Overage: $" + overage);
            System.out.println("Tax: $" + tax);
            System.out.println("Total: $" + total);
        }
    }
