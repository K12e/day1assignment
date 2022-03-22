package firstProject;

import java.util.Scanner;

public class largestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		a=scan.nextInt();
		if(a<100)
		{
		System.out.println(" greater");
		}
	else
	{
		System.out.println("smaller");
	}
	}

}
