package ex2;

import java.util.Scanner;

public class PositiveNegativeCheck {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        } 
        else if (number < 0) 
        {
            System.out.println("The number is negative.");
        } 
        else 
        {
            System.out.println("The number is zero.");
        }

        scanner.close();
    }
}
