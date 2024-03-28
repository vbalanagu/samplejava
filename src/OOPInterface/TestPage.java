package OOPInterface;

public class TestPage extends LoginPage{
	public static void main(String[] args) {
		LoginPage lp = new LoginPage(5);
		System.out.println(lp.timeout);
		lp.title();
		lp.url();
		Page.displayLogo();
		LoginPage.displayLogo();
		lp.doLogin("admin", "admin");
		Page p = new LoginPage();
		p.title();
		p.url();
		p.getPageinfo();
		Page.displayLogo();
	}

}
