package javasessions;

public class LoopsConcept {
	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			System.out.println(i);//123.....10
			//i++;
			//++i;
			i = i+1;
		}

		for(char ch='a'; ch<='z'; ch++) {
			System.out.println(ch+"="+(int)ch); //print a-z
		}
		for(int ch1=65; ch1<=122; ch1++) {
			System.out.println((char)ch1+"="+ch1); //print A-z
		}
		for(;;) {
			System.out.println("hello"); //generates infinite loop without break statement
			break;
		}
		int i1=10;
		while(i1>=1 ) {
			System.out.println(i1);
			i1--;
		}
		/*
		 * Use cases of While:
		 * 1. web pagination
		 * 2. wait for page to load
		 * 3. wait for an element
		 * 4. webtable pagination
		 * 5. carousel handling
		 * 6. page scrolling: linkedin
		 */
		/*
		 * Use cases of for loop:
		 * 1. month drop down: 1 to 12
		 * 2. two radio button, 5 check boxes
		 * 3. Week drop down
		 */
		System.out.println("Example of do while loop");
		int p1=1;
		do {
			System.out.println(p1);
			p1++;
		} while(p1<10);
	}
}
