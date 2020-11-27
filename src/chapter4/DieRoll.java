package chapter4;

import java.util.Random;

public class DieRoll {
    public static void main (String [] args){

        // Initialize what we know

        int totalSpaces = 20;
        int currentSpace = 0;
        int allowedRolls = 5;

        // generate a random number
        Random random = new Random();

        System.out.println("Welcome to the roll the die game. Are you feeling lucky?");


        for (int i = 1; i < allowedRolls; i++) {
            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            System.out.print(String.format("Roll #%d: You've rolled a %d. ", i, die));

            if(currentSpace == totalSpaces){
                System.out.print("You're on space " + currentSpace + ". Congratulations, you win!");
                break;
            }
            else if (currentSpace > totalSpaces){
                System.out.print("Unfortunately for you, you have gone past " + totalSpaces + " spaces. You lose!");
                break;
            }
            else if (i == allowedRolls && currentSpace < totalSpaces) {
                System.out.println("You're on space " + currentSpace + ".");
                System.out.println("Unfortunately for you, you didn't make it to all " + totalSpaces + " spaces. You lose!");
            }
            else {
                int spacesToGo = totalSpaces - currentSpace;
                System.out.print("You are now on space " + currentSpace + " and have " + spacesToGo + " more to go.");
            }
            System.out.println();
        }

    }
}
