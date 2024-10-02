package ex1;

	import java.util.Scanner;

	public class PrintNumbers {
	    public static void main(String[] args) {
	       
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the starting number (10): ");
	        int start = scanner.nextInt();

	        System.out.print("Enter the ending number (50): ");
	        int end = scanner.nextInt();

	        System.out.println("Printing numbers from " + start + " to " + end + ":");
	        for (int i = start; i <= end; i++) {
	            System.out.println(i);
	        }

	        scanner.close();
	    }
	}

