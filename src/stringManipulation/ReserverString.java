package stringManipulation;

public class ReserverString {
	public static String reverseString(String s) {
		if (s == null ) {
			return null;
		}
		if(s.isBlank() || s.isEmpty()) {
			return s;
		}
		int len = s.length();
		if(len == 1) {
			return s;
		}
		String rev = "";
		for(int i = len-1; i>=0; i--) {
			rev = rev+s.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
