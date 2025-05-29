package exerciseUAC;

public class BasicLogin implements ILogin{
	String name;
	String pass;
 	
	

	public BasicLogin(String userName, String password) {
		name = userName;
		pass = password;
	}
	

	@Override
	public int authenticate(Credentials credentials) {
		if(credentials.name != this.name) return 0;
		if(credentials.key != this.pass) return 0;
		return 1;
	}
	
}
