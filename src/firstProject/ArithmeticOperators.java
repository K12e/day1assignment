package firstProject;

import java.util.Scanner;

public class ArithmeticOperators {
	
	public static void main(String[] args) {
		int a, b;
		int addition, subtraction, multiplication, division, modulus;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter two value ");
		a = scan.nextInt();
		b = scan.nextInt();
		
		addition = a + b; 
		subtraction = a - b; 
		multiplication = a * b; 
		division = a / b; 
		modulus = a % b; 
		
		System.out.println("Addition of two numbers " +addition);
		System.out.println("Subtraction of two numbers " +subtraction);
		System.out.println("Multiplication of two numbers " +multiplication);
		System.out.println("Division of two numbers " +division);
		System.out.println("Modulus of two number" +modulus);
	}
}