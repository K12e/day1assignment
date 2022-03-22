package firstProject;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		   System.out.println("Enter Two Numbers :");
		   
		   double n1, n2, n3;
		   n1 = scan.nextDouble();
		   n2 = scan.nextDouble();
		   n3 = n1 * n2;
		   System.out.println("Total = " + n3);

	}

}
