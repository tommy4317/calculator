package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		try {
		System.out.println("Hello, "
				+ "\nPlease enter two numbers and I will preform the following calculations on them: "
				+ "\naddition, subtraction, division, and multiplication. "
				+ "\nWhat is your first number?");
		
		 double firstNum = scan.nextDouble();
		 
		 System.out.println("Enter second number");
		
		 double secondNum = scan.nextDouble();
		 
		 System.out.println(firstNum + secondNum);
		 System.out.println(firstNum - secondNum);
		 if (secondNum == -0) {
			 System.out.println("Cannot divide by 0");
			 return;
		 }
		 System.out.println(firstNum / secondNum);
		 System.out.println(firstNum * secondNum);
		 
		 System.out.println("Now enter another number and I will square it");
		 double thirdNum = scan.nextDouble();
		 System.out.println(Math.pow(thirdNum, 2));
		 
		}
		catch(InputMismatchException exception) {
			System.out.println("Please use numbers only");
		}
	}
	

}
