import java.util.HashMap;

public class IDandPassword {
	
	HashMap<String, String> logininfo = new HashMap<String, String>();
	
	IDandPassword(){
		
		logininfo.put("Bro", "pizza");
		logininfo.put("sabiq", "PASSWORD");
		logininfo.put("Hashil", "abc123");
		
	}
	
	protected HashMap getLoginInfo(){
		return logininfo;
	}
	
}
