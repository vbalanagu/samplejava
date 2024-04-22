package stringManipulation;

public class StringCapitalLetter {
	public static void main(String[] args) {
		String s = "this is my java code";//This Is My Java Code
		
		String ss[] = s.split(" ");
		String str = "";
		for(String e: ss) {
			str = str + e.replace(String.valueOf(e.charAt(0)),String.valueOf(e.charAt(0)).toUpperCase()) + " ";
		}
		str.trim();
		System.out.println(str);
	}
}
