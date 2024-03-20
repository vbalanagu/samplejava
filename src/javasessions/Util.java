package javasessions;

public class Util {

	String name;
	int age;
	static final String compName = "Google"; //static keyword is used to maintain same value across all the objects and they are saved in CMA
	public void getInfo() { 
		System.out.println("get info");
	}
	public static void sendMail() {
		System.out.println("send mail");
	}
	public static void sendMail(int a) { //Method overloading is possible for static methods as well
		System.out.println("send mail: "+ a);
	}
	public static void main(String[] args) { //void keyword is used with main method because it is the main method/first point of entry and it cannot return anything.
		// TODO Auto-generated method stub
		Util u = new Util();
		u.name = "Ekta";
		u.age=35;
		u.getInfo(); //getInfo() method is can only be used used with Objects
		System.out.println(Util.compName); //static keywords can only be used with either class name or directly.
		Util.sendMail(); //static variables or methods can only be called either used Class name or directly.
		sendMail();
		Util.sendMail(10);
		sendMail(11);
		
	}

}
