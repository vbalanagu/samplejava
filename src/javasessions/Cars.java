package javasessions;

public class Cars {
	int price;
	String color;
	String brand;
	String licenseNumber; //Though license is a number, since no mathematical operations can be performed on this variable, use it as string
	static final int wheels = 4; //Static variables are declared only in classes and Common Memory Allocation is used as memory for Static varialble 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars c1 = new Cars();
		c1.brand = "Honda";
		c1.price = 1200;
		c1.color = "red";
		
		Cars c2 = new Cars();
		c2.brand = "Toyota";
		c2.price = 1300;
		c2.color = "white";
		
		System.out.println("Car brand: "+ c1.brand+ " price is: "+ c1.price+ " Color is: "+ c1.color);
		//Static variables are called using either class name or direct calling
		System.out.println("Number of wheels: "+ wheels);
		System.out.println("Car brand: "+ c2.brand+ " price is: "+ c2.price+ " Color is: "+ c2.color);
		System.out.println("Number of wheels: "+ Cars.wheels);
		// Cars.wheels = 5; wheels cannot be updated because the "final" keyword assigned in the class declaration
		System.out.println("Car brand: "+ c2.brand+ " price is: "+ c2.price+ " Color is: "+ c2.color + "Wheels: "+ Cars.wheels);
		final int days = 7;
		// days = 10; cannot change value for a variable when a value  
		int Salary = days * 45;
		System.out.println("Salary is: "+ Salary);
		
		new Cars(); //an object can be declared without name and they are called no reference objects;
		Cars c4 = new Cars();
		c4 = null; // Null object stored in heap memory
		
		System.gc(); 
		//The above call doesn't give any guarantee that garbage collector is called to free up memory. Java does automatic memory management; JVM checks for
		//memory in heap and instructs garbage collector to free up no reference objects and null objects
		//Garbage collector acts only on Heap memory
		
		//Garbage collector cannot free up CMA(Common Memory Allocation)
		
	}

}
