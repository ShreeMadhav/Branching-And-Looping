package ex5;

import java.util.Scanner;

public class DiscountCalculator {
	 public static void main(String[] args) {
	        
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("Enter the purchase amount: ");
	        double purchaseAmount = input.nextDouble();
	        double finalAmount;
	        
	        if (purchaseAmount < 500) 
	        {
	            finalAmount = purchaseAmount;  // No discount
	        }
	        else if (purchaseAmount >= 500 && purchaseAmount <= 1000) 
	        {
	            finalAmount = purchaseAmount - (purchaseAmount * 0.10);  // 10% discount
	        } 
	        else 
	        {
	            finalAmount = purchaseAmount - (purchaseAmount * 0.20);  // 20% discount
	        }
	        
	        System.out.println("Final payable amount after discount: $" + finalAmount);

	        input.close();
	    }
}
