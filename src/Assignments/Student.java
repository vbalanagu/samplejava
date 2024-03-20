package Assignments;

public class Student {
	String name;
	int age;
	private static int studentCount=0;
	public Student() {
		studentCount++;
	}
	public static int getStudentCount() {
		return studentCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.name = "Arya";
		s1.age=20;
		Student s2 = new Student();
		s2.name = "Priya";
		s2.age=19;
		System.out.println("Student Name: "+s1.name+" and age: "+s1.age);
		System.out.println("Student Name: "+s2.name+" and age: "+s2.age);
		System.out.println("Number of Students are: "+Student.getStudentCount());
		s2.age=20;
		System.out.println("Student Name: "+s2.name+" and age: "+s2.age);
		System.out.println("Number of Students are: "+Student.getStudentCount());
		Student s3 = new Student();
		System.out.println("Number of Students are: "+Student.getStudentCount());	
		s3.name = "heidi";
		s3.age=25;
		System.out.println("Student Name: "+s3.name+" and age: "+s3.age);
		System.out.println("Number of Students are: "+Student.getStudentCount());
		
	}

}
