package exerciseUAC;

public class OAuthLogin implements ILogin{
	String token;

	public OAuthLogin(String token) {
		super();
		this.token = token;
	}


	@Override
	public int authenticate(Credentials credentials) {
		if(credentials.key != this.token) return 0;
		return 1;
	}



}
