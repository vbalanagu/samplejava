package SuperKeyword;

public class pageClass {
	String name;
	String title;
	public pageClass() {
		this("loginpage", "title");
		System.out.println("Default const.");
	}	
	public pageClass(String name) {
		this();
		// this("abc", "sdf");
		System.out.println("Single param cosnst.");
		System.out.println(name);
	}
	public pageClass(String name, String title) {
		// this();
		System.out.println("param cosnst.");
		System.out.println(name);
		System.out.println(title);
	}

}
/**this use cases
1. To initialize instance variables with local variables in constructor
2. used with getter and setter
3. builder pattern: method returns this
4. constructor calling within the same class
**/
/**
 * Super keyword is used to access parent class constructor 
 */
