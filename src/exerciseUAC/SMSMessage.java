package exerciseUAC;

public class SMSMessage extends Message{
	
	public SMSMessage(ILogin login, String sender, String recipient, String content) {
		super(login, sender, recipient, content);
	}
	
	@Override
	protected void send(String userName, String token) {
		Credentials credentials = new Credentials(userName, token);
		if(login.authenticate(credentials) == 0) {
			System.out.println("SMS authentication failed for user: " + userName);
			return;
		}
		System.out.println("SMS sent from " + sender +" to " + recipient + ": "+ content);
	}

	
	
}
