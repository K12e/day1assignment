package firstProject;

public class Vehicle {
	String typeofvehicle;
	     String  brand;
	     byte noOfwheels;
	     byte noofGear;
	     byte speed;
	     String mileage;
	     
	     
	     public static void bus()
	     {
	    	 int x;
	     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle  car=new Vehicle();
		car.typeofvehicle="car";
		car.brand="nexa";
		car.mileage="ab100";
		car.noofGear=5;
		car.noOfwheels=4;
		car.speed=100;
		System.out.println("typeOfvehicle "+car.typeofvehicle);
		System.out.println("brand " +car.brand);
		System.out.println("noOfWheels  "+car.noOfwheels);
		System.out.println("noofGear "+car.noofGear);
		System.out.println("speed "+car.speed);
		System.out.println("mileage "+car.mileage);
		
}

}
