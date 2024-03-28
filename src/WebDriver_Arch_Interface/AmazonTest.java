package WebDriver_Arch_Interface;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserName = "chrome";
		WebDriver driver = null;
		switch(browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "Safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("Please pass the right browser");
			break;
		}
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		String title = driver.getTitle();
		System.out.println("Page title: "+ title);
		
		if(title.equals("amazon")) {
			System.out.println("title is correct");
		} else {
			System.out.println("Title is incorrect");
		}
	}

}
