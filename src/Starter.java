import java.util.Scanner;

public class Starter {

	public static int sum (int x, int y) {
		// Takes 2 integers as parameters and returns the sum of the two integers
		return x + y;
	}
	
	public static void main(String args[]) {
		
        Scanner scanner = new Scanner(System.in); 

		System.out.println("Hello, please input a number: ");
		
		int firstNum = scanner.nextInt(); // Records first integer
		
		System.out.println("Now put in another number: ");
		
		int secondNum = scanner.nextInt(); // Records second integer
		
		int sum = sum(firstNum,secondNum); // sum() method call
		
		System.out.println("The sum of the integers you entered is: "+sum);
		
		System.out.println("Now exiting!");
		
	}
	
}
