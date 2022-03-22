package firstProject;

import java.util.Scanner;

public class ternaryOpertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x ;
		int y ;
		int z;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		x=scan.nextInt();
		y=scan.nextInt();
		z=scan.nextInt();		
		System.out.println(x>y ? "x is greater" : "y is greater");
		
     	if(x>y && x>z)                                                                                         
		{                                                                                                      
			System.out.println("x is greater");
		}
		else if(y>x && y>z)
		{    
			System.out.println("y is greater");
			
		}
		else
		{
			System.out.println("z is greater ");
		}
	
	
	
	
	}
	
	
	
	
	
	

}
