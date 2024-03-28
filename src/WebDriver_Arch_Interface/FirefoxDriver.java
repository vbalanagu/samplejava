package WebDriver_Arch_Interface;

public class FirefoxDriver implements WebDriver{
	public FirefoxDriver() {
		System.out.println("Firefox is launched");
	}
	@Override
	public void findElement(String name) {
		// TODO Auto-generated method stub
		System.out.println("finding elements with name" +name);
	}

	@Override
	public void fineElements(String name) {
		// TODO Auto-generated method stub
		System.out.println("finding elements with name" +name);
	}

	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		System.out.println(url);
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Amazon";
	}

	@Override
	public void click(String element) {
		// TODO Auto-generated method stub
		System.out.println("Clickon element"+element);
	}

	@Override
	public void sendKeys(String element, String value) {
		// TODO Auto-generated method stub
		System.out.println("senekys element"+element + value);
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Closing the browser");
	}


}
