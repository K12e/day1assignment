package firstProject;

import java.util.Scanner;

public class myname {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("enter your  fname");
		String fname=scan.next();
		
		System.out.println("enter your  lname");
		String lname=scan.next();
		
		
	fullname(fname, lname);
	}
	
	public static void fullname(String fname,String lname)
	{
		System.out.print(fname+" " );
		System.out.print(lname);
		
	}

}
