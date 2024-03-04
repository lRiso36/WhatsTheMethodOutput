package Week6;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class FibPrime {
    private static final Scanner keyboard = new Scanner(System.in);

    public static int enterArray(int[] arrayInts){
        int numOfInts = 0;
        int intEntered;
        System.out.print("Please enter numbers (0 to stop): ");
        do {
            intEntered = keyboard.nextInt();
            if(intEntered > 0) //to make ints positive
            {
                arrayInts[numOfInts] = intEntered;
            }
            else
            {
                arrayInts[numOfInts] = Math.abs(intEntered);
            }
            numOfInts++;
            } while (intEntered != 0);

        return numOfInts;
    } // end of enterArray method
    public static boolean isFibonacci(int num)
    {
        boolean isFibonacci = false;
        int firstFibNum = 0, secondFibNum = 1, temp;
        do {
            if(num == secondFibNum || num == firstFibNum){
                isFibonacci = true;
            } //end of if
            temp = secondFibNum;
            secondFibNum = firstFibNum + secondFibNum;
            firstFibNum = temp;
            // swap
        }while(secondFibNum <= num); // end of do while
                //is fib sequence
        return isFibonacci;
    } // end of is fib method
    public static boolean isPrime(int num) {
        boolean isPrime = false;
        // Corner case
        if (num == 1) {
            return false;
        }

        // Check from 2 to sqrt(n)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            } // end of for loop
        }
        return true;
    } // end of is prime method

    public static void main(String[] args) {
        int[] arrayInts = new int[10]; //initialize array
        int numOfInts = enterArray(arrayInts);

        for(int i = 0; i < numOfInts -1; i++)
        {
            if(isFibonacci(arrayInts[i]) == true) {
                if (isPrime(arrayInts[i]) == true) {
                    System.out.println(arrayInts[i] + " is fibonacci and is prime");
                } else {
                    System.out.println(arrayInts[i] + " is fibonacci and is not prime");
                }
            }
            else if(isPrime(arrayInts[i]) == true){
                System.out.println(arrayInts[i] + " is not fibonacci and is prime");
            }
            else {
                System.out.println(arrayInts[i] + " is not fibonacci and is not prime");
            } // end of if statement

        } //end of for loop


    } // end of main

} // end of class
