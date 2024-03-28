package OOPInterface;

public class LoginPage extends Page{
	int timeout=5;
	public LoginPage() {
		System.out.println("LP -- constructor");
	}
	public LoginPage(int a) {
		System.out.println("Lp -- construction : "+a);
	}
	public LoginPage(int a, int b) {
		System.out.println("Lp -- construction : "+a + b);
	}
	@Override
	public void title() {
		System.out.println("LP -- title");
		
	}

	@Override
	public void url() {
		// TODO Auto-generated method stub
		System.out.println("LP --url");
	}
	public void getPageInfo() {
		System.out.println("");
	}
	public void doLogin(String un, String pwd) {
		System.out.println("User is logged with: "+ un + pwd);
	}

}
