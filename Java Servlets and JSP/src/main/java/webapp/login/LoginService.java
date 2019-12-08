package webapp.login;

public class LoginService {
	
	public boolean isValidUser(String username, String password){
		if(username.equals("Vidit") && password.equals("vidit")){
			return true;
		}
		return false;
	}

}
