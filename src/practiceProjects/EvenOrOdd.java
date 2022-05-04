package practiceProjects;

import java.util.Scanner;

public class EvenOrOdd {
    //a number is even if it is divisible by two
    //if number is even, function returns true
    //if number is odd. function returns false
    //The input must be an integer

    public static boolean isEven(int n){
        return ( n % 2 == 0);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Is the number even? " + isEven(num));

    }
}
