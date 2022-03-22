package firstProject;

import java.util.Scanner;

public class quotientRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			  

			    int dividend , divisor ;
			    Scanner scan = new Scanner(System.in);
			    
			    System.out.println("enter number");
			    dividend=scan.nextInt();
			    divisor=scan.nextInt();		

			    int quotient = dividend / divisor;
			   int remainder = dividend % divisor;

			    System.out.println("Quotient = " + quotient);
			    System.out.println("Remainder = " + remainder);
			  }
			}
	
