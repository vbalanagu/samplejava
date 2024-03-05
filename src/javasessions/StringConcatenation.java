package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100;
		int b = 200;
		String x = "hello";
		String y = "world";
		
		System.out.println(a+b);//300
		System.out.println(x+y);//helloworld
		
		System.out.println(a+x);//100hello
		System.out.println(a+b+x+y);//300helloworld
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		
		
		char c1 = 'a';//97
		char c2 = 'b';//98
		System.out.println(c1+c2+x+y);//195helloworld
		System.out.println(c1+"");//a
		
		String t1 = "a";
		String t2 = "b";
		System.out.println(t1+t2);//ab
		
		System.out.println(c1+' '+c2);//97+98+32=227
		System.out.println(true+x);//truehello
	}

}
