package firstProject;

public class Student {
	
	
		String f_name;
		String l_name;
		String address;
		int roll_no;
		String collegename;
		int totalmarks;
		
		
		//not return not take 
		public void printStudentDetails()
		{
			System.out.println("student1 Details =>");
			System.out.println("Name "+f_name);
			System.out.println("Surname  "+l_name);
			System.out.println("Address "+address);
			System.out.println("Roll_no "+roll_no);
			System.out.println("College Name "+collegename);
			System.out.println();
		}
			
			//return not take
			public String getCollegeName()
			{
				return "CEOK";
			}
			
	//return value not take parameter
			public float calculatePercentage(float bestOfFive) 
			{
				System.out.println(totalmarks);
				float percentage=(float)(totalmarks/bestOfFive)*100;
				System.out.println("persent of student is = "+percentage);
				return percentage;
				
			}
		//not return but take	
		//method define or function define
			public static void printCollegeResult(float avg)
			{
				System.out.println("College Result is = "+avg);
				
					
			}
		
		public static void main(String args[])
		{
		
		Student student1=new Student();
		student1.f_name="Kalyani";
		student1.l_name="rathod";
		student1.address="pusad";
		student1.roll_no=189;
		student1.collegename=student1.getCollegeName();
		student1.totalmarks=520;
		student1.printStudentDetails();
		float per1 = student1.calculatePercentage(520);
		
		System.out.println("student1.f_name");
		
		Student student2=new Student();
		student2.f_name="Ayansh";
		student2.l_name="jadhao";
		student2.address="digras";
		student2.roll_no=1;
		student2.collegename=student2.getCollegeName();
		student2.totalmarks=420;
		student2.printStudentDetails();
		float per2 = student2.calculatePercentage(600);
		
		float avg = (per1+per2)/2;
		printCollegeResult(avg);
		
	//	System.out.println("f_name "+student1.f_name);
   //System.out.println("l_name "+student1.l_name);
   //System.out.println("address "+student1.address);
    //System.out.println("roll_no "+student1.roll_no);
	}

}
