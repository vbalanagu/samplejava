package constructorConcept;

public class DataConvert {

	public static void main(String[] args) {
		String x = "200";
		System.out.println(x+20);
		
		//String to int: using Wrapper class: Integer
		
		System.out.println(Integer.parseInt(x)+20);
		String t = "200A";
		t=t.replaceAll(".$", "");
		System.out.println(Integer.parseInt(t)+20);
		
		String execute = "true";
		boolean flag = Boolean.parseBoolean(execute);
		if(flag) {
			System.out.println("Run my test cases");
		} else {
			System.out.println("exit");
		}
		
		int p = 200;
		System.out.println(p+200);
		String pr = String.valueOf(p);
		System.out.println(pr+200);//200200

	}

}
