package javasessions;

public class ClaasesAndObjects {
	String name;
	int age;
	double Salary;
	boolean isPerm;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Classes are blueprint/Category/template for all the objects
		//objects are actual entity created from the classes
		ClaasesAndObjects obj1 = new ClaasesAndObjects();
		obj1.name = "Harry";
		obj1.age = 32;
		obj1.Salary = 12.53;
		obj1.isPerm = false;
		System.out.println(obj1.name + " " + obj1.age + " " + obj1.Salary + " " + obj1.isPerm);
		ClaasesAndObjects obj2 = new ClaasesAndObjects();
		System.out.println(obj2.name + " " + obj2.age + " " + obj2.Salary + " " + obj2.isPerm);
		//Output is: null 0 0.0 false
		//Strings are non primitive and their default value is null
		
		//no reference objects
		new ClaasesAndObjects().name = "Ekta";
		
		//null reference objects
		ClaasesAndObjects obj3 = new ClaasesAndObjects();
		obj3.name = "OBJ3";
		obj3 = null;
		//obj3.age = 67; //This statement will return NPE

	}

}
