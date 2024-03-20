package javasessions;

import java.util.Arrays;

public class ArrayTypes {

	public static void main(String[] args) {
		/** Arrays are non primitive data type
		 * For non primitive data types, the default value is null
		 * Limitations with Array:
		 * 1. size is fixed
		 * 2. Data type is fixed
		 * 
		 */
		int i[] = new int[4];
		System.out.println(i[0]);
		System.out.println(i[1]);
		//System.out.println(i[4]);//ArrayIndexOutofBoundException
		//System.out.println(i[-1]);//ArrayIndexOutofBoundException
		for(int j=0; j<i.length; j++) {
			System.out.println(i[j]);
		}
		System.out.println("..........Example of For each.......");
		for(int e : i) {
			System.out.println(e);
		}
		char check[] = new char[5];
		System.out.println("default value of char array is"+ Arrays.toString(check));
		System.out.println("..........Example of For each using char array.......");
		char ch[] = new char[]{'a', 'b'};
		for(char ch1 : ch) {
			System.out.println(ch1);
		}
		System.out.println("..........Example of For each using string array.......");
		String empNames[] = new String[] {"hello", "world"};
		for(String emp : empNames) {
			System.out.println(emp);
		}
		System.out.println("..........Example of For each using integer array.......");
		int num[] = new int[] {1,2, 3, 4};
		for(int eachnum : num) {
			System.out.println(eachnum);
		}
		System.out.println("..........Example of printing all elements using toString method.......");
		System.out.print(Arrays.toString(num));
		/**
		 * Default values of 
		 * int - default values are zero
		 * char - default values are blank
		 * string - default values are null
		 * Object - default values are null
		 */
		System.out.println("..........Example of printing all elements using for object type.......");
		Object obj[] = new Object[] {"Rama",1,'a', 4.5, 2.3};
		for(Object eachobj : obj) {
			System.out.println(eachobj);
		}
		System.out.println("All the elements of an object array are: "+ Arrays.toString(obj));
		
		int p[] = {1, 2, 3, 4}; //This type of declaration is called array literal
		System.out.println("lenth of the above array is : "+ p.length);
		//p[4] = 5; //This assignment give ArrayIndexOutofBound exception
		System.out.println("Elements of the above array are: "+ Arrays.toString(p)); //This method is useful to display the contents of the array 
	}
}
