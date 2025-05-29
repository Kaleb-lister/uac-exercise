package exerciseUAC;

public class EmailMessage extends Message{

	public EmailMessage(ILogin login, String sender, String recipient, String content) {
		super(login, sender, recipient, content);
	}

	@Override
	protected void send(String userName, String password) {
		Credentials credentials = new Credentials(userName, password);
		if(login.authenticate(credentials) == 0) {
			System.out.println("Email authentication failed for user: " + userName);
			return;
		}
		System.out.println("Email send from " + sender + " to " + recipient + ": " + content);
	}
}
