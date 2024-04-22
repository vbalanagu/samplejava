package stringManipulation;

public class StringReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "this is my java code";
		String ss[] =  s.split(" ");
		String ss2 = "";
		for (String s1 : ss) {
			ss2= ss2+ReserverString.reverseString(s1)+ " ";
		}
		ss2.trim();
		System.out.println(ss2);
	}

}
