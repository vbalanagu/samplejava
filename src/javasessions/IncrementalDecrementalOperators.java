package javasessions;

public class IncrementalDecrementalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Post Increment
		int a = 1;
		int b = a++;
		
		System.out.println(a);//2
		System.out.println(b);//1
		
		int h = -99;
		int g = h++;
		System.out.println(h);//-98
		System.out.println(g);//-99
		
		int s = 5;
		System.out.println(s++);//5
		
		int t = 10;
		int f = t++;
		System.out.println(t);//11
		System.out.println(f);//10
		
		//2. Pre Increment
		int x = 1;
		System.out.println(x);
		int y = ++x;
		System.out.println(y);

		
		int i = 1;
		int j = ++i;
		System.out.println(i);
		System.out.println(j);
		
		int total = 10;
		System.out.println(++total);//11
		System.out.println(total);//11
	}

}
