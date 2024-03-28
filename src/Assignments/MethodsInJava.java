package Assignments;

import java.util.Arrays;

public class MethodsInJava {

	public static void printHello() {
		System.out.println("Hello world");
	}
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	public static boolean compare(String s1, String s2) {
		if (s1 == null && s2 == null) {
			return true;
		} else if (s1 == null || s2 == null) {
			return false;
		}
		return  s1.equals(s2);
	}
	public static double calcAverage(double[] array1) {
		double val1 = 0.0;
		/*for (int i=0; i<array1.length; i++) {
			val1 = val1+ array1[i];
		}
		val1 = val1 / array1.length;
		return val1;*/
		for (double e : array1) {
			val1 += e;
		}
		return val1/array1.length;
	}
	public static String contactStrings(String[] str) {
		String str1 = "";
		for( String s1:  str) {
			str1 += s1;
		}
		return str1;
	}
	public static int[] reverseOrder(int array1[]) {
		int len = array1.length;
		int finalarray1[] = new int[len];
		for(int i=0; i<len; i++) {
			finalarray1[len-1-i] = array1[i];
		}
		return finalarray1;
	}
	public static void printArrayfactor(int factor, int a1[]) {
		for (int e: a1) {
			System.out.print(e * factor + " ");
		}
		System.out.println();
	}
	public static void printReverse(String[] s1) {
		for (String s: s1) {
			StringBuilder s2 = new StringBuilder();
			s2.append(s);
			System.out.print(s2.reverse()+ " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printHello();
		System.out.println("Addition of 4 and 3 results into: "+add(4, 3));
		System.out.println("Compare strings hello and Hello: "+compare(null, "ahem"));
		double d[] = {1.2,1.3,1.4,1.5};
		double avg = calcAverage(d);
		System.out.println(avg);
		String s[] = {"Final", "result", "is", "concatenation", "of all these"};
		System.out.println(contactStrings(s));
		int rev1[] = new int[] {5, 7, 11, 4, 3};
		System.out.println("Reverse order is: "+ Arrays.toString(reverseOrder(rev1)));
		printArrayfactor(5, rev1);
		printReverse(s);
	}

}
