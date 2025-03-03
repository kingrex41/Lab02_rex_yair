import java.util.Scanner;

public class Starter {

	public static void main(String args[]) {		
        Scanner scanner = new Scanner(System.in); 

        
		System.out.println("Hello, please input a number");
		
		int firstNum = scanner.nextInt();
		
		System.out.println("Now put in another number");
		
		int secondNum = scanner.nextInt();
		
		int sum = firstNum + secondNum;
		
		System.out.println("The sum of the integers you entered is: "+sum);
		
		System.out.println("Now exiting!");
		
		
	}
	
}
