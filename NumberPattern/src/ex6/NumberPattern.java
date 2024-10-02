package ex6;

public class NumberPattern {
	  public static void main(String[] args) {
	 int n = 5; // The maximum number and the height of the pattern
     
     // Loop for each row
     for (int i = 0; i < n; i++) {
         // Loop to print numbers from n down to n - i
         for (int j = n; j > i; j--) {
             System.out.print(j);
         }
         // Loop to print the last number (n - i) for the remaining places
         for (int k = 0; k < i; k++) {
             System.out.print(n - i);
         }
         // Move to the next line after each row
         System.out.println();
     }
 }

}
