

public class Main {
	
	public static void main(String[] args) {
		
		IDandPassword idandPasswords = new IDandPassword();
		
		
		LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());
		
	}

}
