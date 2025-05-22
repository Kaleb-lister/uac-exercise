package exerciseUAC;

public class OAuthLogin implements ILogin{
	String token;
	
	public OAuthLogin(String token) {
		this.token = token;
	}

	@Override
	public int authenticate(String username, String password) {
		if(password != this.token) return 0;
		return 1;
	}
}
