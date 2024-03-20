package Assignments;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Write a Java program to add two strings:
		 * String a = “Hello”;
		 * String b = “Naveen K”
		 */
		String a = "Hello";
		String b = "Naveen k";
		String c = a + " " + b;
		System.out.println(c);
		/**
		 * 2. Write a Java program to print the sum of two numbers.
		 * Test Data:
		 * 74 + 36 
		 */
		int num1 = 74;
		int num2 = 36;
		System.out.println(num1+num2);
		/**
		 * Write a Java program to print the division of two numbers.
		 * k = 50/3
		 */
		System.out.println(50/3);
		/**
		 * Write a Java program to compute the specified expressions and print the output. Go to the editor.
		 * Test Data:
		 * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
		 * Expected Output
		 * 2.138888888888889
		 */
		System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
		/**
		 * Try to concat "Hello Selenium" with a character 't'.
		 */
		System.out.println("Hello Selenium"+"t");
		/**
		 * Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : "Your Total  amount is: 3700".
		 */
		int var1 = 100;
		int var2 = 200;
		int var3 = 3400;
		System.out.println("Your Total  amount is: "+(var1+var2+var3));
		/**
		 * Print the ASCII value of the character 'h'.
		 */
		System.out.println((byte)'h');
		/**
		 * Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.
		 */
		System.out.println((char)((byte)'d'+3));
		/**
		 * Write a program to find the square of the number 3.9
		 */
		float a1 = 3.9f;
		System.out.println(a1*a1);
		System.out.println(Math.pow(a1, 2));
	}

}
