package constructorConcept;

import java.util.Arrays;

public class TestCutomer {
	public static void main(String[] args) {
		String d[] = {"macbook pro", "iphone 14", "Keyboard"};
		Customer c1 = new Customer("tom", 21, d);
		System.out.println("Devices are: "+Arrays.toString(c1.getDevicesInfo()));
		System.out.println("Number of devices are: "+ c1.getDevicesCount());
		// Browser b1 = new Browser(); //This constructor cannot be called because of the private constructor
		
	}

}
