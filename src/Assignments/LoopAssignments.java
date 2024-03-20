package Assignments;

public class LoopAssignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * WAP to print following output:
		 I am Batman﻿
		 I am Batman﻿
		 I am Batman﻿
		 I am Batman
		 I am Batman
		 */
		for(int i = 0; i <= 5; i++) {
			System.out.println("I am Batman");
		}
		/**
		 * WAP to print following output:
		 I am Batman﻿ 1
		 I am Batman﻿ 2
		 I am Batman﻿ 3
		 I am Batman 4
		 ...
		 I am Batman 10
		 */
		for(int i = 1; i <= 10; i++) {
			System.out.println("I am Batman "+i);
		}
		/**
		 * WAP to print 10 to 1 using for, while and do-while loop
		 */
		System.out.println("----For loop----");
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		System.out.println("----While loop----");
		int i=10;
		while(i>=1) {
			System.out.println(i--);
		}
		System.out.println("----Do While loop----");
		i=10;
		do {
			System.out.println(i--);
		} while(i>=1);
		
		/**
		 * Write a program in Java to print "Hello World" ten times using while loop
		 */
		System.out.println("----Print Hello world using while loop ----");
		i=10;
		while(i-- >= 1) {
			System.out.println("Hello World");
		}
		/**
		 * Write a program in Java to print all the multiplication of 5 from 1 to 100 using while /for/do-while loop
		 */
		System.out.println("5 table");
		for(i=1; i <=100; i++) {
			System.out.println("5 * "+i+" = "+5*i);
		}
		/**
		 * Print all odd and even numbers between 1 to 100
		 */
		System.out.println("List of even numbers between 1 to 100 are: ");
		for (i=1; i<=100; i++) {
			if(i%2 == 0) {
			System.out.print(i+", ");
			}
		}
		System.out.println("List of odd numbers between 1 to 100 are: ");
		for (i=1; i<=100; i++) {
			if(i%2 != 0) {
			System.out.print(i+", ");
			}
		}
		/**
		 * Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.
		 */
		System.out.println("Char - ASCII value");
		for(int c1=48;c1<=122;c1++) {
			
				System.out.println((char)c1+" - "+c1);
			
		}
	}

}
