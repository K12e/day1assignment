package firstProject;

import java.util.Scanner;

public class positiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		num=scan.nextInt();
		if(num>0)
		{
			System.out.println("positive");
		}
		else
		{
			System.out.println("negative");
		}
		
	}

}
