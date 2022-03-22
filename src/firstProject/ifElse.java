package firstProject;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num ;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		num=scan.nextInt();
		
		if(num%2==0)
			{
			System.out.println("the num is even");
			}
		else
		{
			System.out.println("the num is odd");
		}
	}

}
