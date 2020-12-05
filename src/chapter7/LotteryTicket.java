package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;
    public static void main (String [] args){
        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }
    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for (int i = 0; i < LENGTH; i++){
            int randomNumber;
            /*
            Generate random number then search to see if it exists. If it does,
            regenerate a new one.
             */
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while (search(ticket, randomNumber));
            /*
            If we make it to this point, it is unique. Add it to the array
             */
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    /**
     * Does a sequential search on the array to find a value.
     * @param array array to search through
     * @param numberToSearchFor value to search for
     * @return true if found, false if not
     */

    public static boolean search (int [] array, int numberToSearchFor){
        /*
        This is an enhanced loop. Iterate through the array and each time assign current
        element to value
        */
        for(int value : array){
            if (value == numberToSearchFor){
                return true;
            }
        }
        // if we've reached this point, the entire array was searched, and value not found
        return false;
    }

    public static boolean binarySearch(int [] array, int numberToSearchFor){
        // array has to be sorted first
        Arrays.sort(array);

        int index = Arrays.binarySearch(array, numberToSearchFor);
        return index >= 0;
    }

    public static void printTicket(int[] ticket){
        for (int i = 0; i < LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}
