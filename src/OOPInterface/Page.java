package OOPInterface;

public abstract class Page {
	
	static final int TIME_OUT=10;
	public Page() {
		System.out.println("Page -- default const");
	}
	public Page(int a) {
		System.out.println("Page -- construction : "+a);
	}
	public Page(int a, int b) {
		System.out.println("Page -- construction : "+a + b);
	}
	public abstract void title();
	public abstract void url();
	public final static void displayLogo() {
		System.out.println("Page -- display logo");
	}
	public void getPageinfo() {
		System.out.println("Page -- getPageInfo");
	}

}
