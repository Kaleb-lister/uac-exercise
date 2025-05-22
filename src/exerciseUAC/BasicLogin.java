package exerciseUAC;

public class BasicLogin implements ILogin{
	
	String name;
	String password;
	
	public BasicLogin(String name, String password) {
		this.name = name;
		this.password = password;
	}

	@Override
	public int authenticate(String username, String password) {
		if(username != this.name) return 0;
		if(password != this.password) return 0;
		return 1;
	}
	
}
