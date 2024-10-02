package ex3;

public class ReverseNumber {
	 public static void main(String[] args) {
	       
	        int number = 876;
	        int reversed = 0;
	        
	        System.out.println("Input Number: " + number);
	        
	        while (number != 0) {
	            int digit = number % 10;
	            reversed = reversed * 10 + digit;
	            number /= 10;
	        }
	        
	        System.out.println("Reversed Number: " + reversed);
	    }

}
