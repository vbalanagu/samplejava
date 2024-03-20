package javasessions;

public class Registration {
	String name;
	String emailid;
	String phone;
	int age;
	String city;
	String dob;
	/*public Registration(String name, String emailId) {
		
	}*/
	public Registration(String name, String emailid) {
		this.name = name;
		this.emailid = emailid;
	}
	

	public Registration(String name, String emailid, String phone) {
		this.name = name;
		this.emailid = emailid;
		this.phone = phone;
	}
	


	public Registration(String name, String emailid, String phone, int age) {
		super();
		this.name = name;
		this.emailid = emailid;
		this.phone = phone;
		this.age = age;
	}


	public Registration(String name, String emailid, String phone, int age, String city, String dob) {
		super();
		this.name = name;
		this.emailid = emailid;
		this.phone = phone;
		this.age = age;
		this.city = city;
		this.dob = dob;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// Registration r1 = new Registration(); //This will not work if constructors are created by the user with atleast one argument
		Registration r1 = new Registration("navnee", "naveen@gmail.com");
		System.out.println("name: "+ r1.name+" and email id is: "+r1.emailid+ " and other vlaues are: "+ r1.city);
		
	}


}
