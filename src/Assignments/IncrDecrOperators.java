package Assignments;

public class IncrDecrOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 11;
		i = i++ + ++i;
		System.out.println(i);//24
		
		int a=11, b=22, c;	
		c = a + b + a++ + b++ + ++a + ++b;//11+22+11+22+13+24	
		System.out.println("a="+a);//13
		System.out.println("b="+b);//24
		System.out.println("c="+c);//103
		
		int j=0;
		j = j++ - --j + ++j - j--;//0-0+1-1
		System.out.println(j);//0
		
		boolean b1 = true;
		//b1++; //Cannot assign increment operator to boolean type
		System.out.println(b1);
		
		int m=1, n=2, p=3;

		int m1 = m-- - n-- - p--;
		System.out.println("m="+m);//0
		System.out.println("n="+n);//1
		System.out.println("p="+p);//2
		System.out.println("m1="+m1);//-4
	}

}
