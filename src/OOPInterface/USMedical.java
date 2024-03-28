package OOPInterface;

public interface USMedical extends who{
	//interface variables are static and final by default
	
	int MIN_Fee=10;
	//interface methods can not have method body
	//abstract method: no method body

	public void physioServices();
	public void physioServices(int a);
	public void oncologyservices();
	public void dentalServices();
	public void emergencyServices();
	
	default void xyz() {
		System.out.println("hello");
	}
	public static void anc() {
		System.out.println("abc");
	}

}
