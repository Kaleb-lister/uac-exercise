package exerciseUAC;

abstract public class Message{
	ILogin login;
	String sender;
	String recipient;
	String content;
	
	public Message(ILogin login, String sender, String recipient, String content) {
		this.login = login;
		this.sender = sender;
		this.recipient = recipient;
		this.content = content;
	}

	protected abstract void send(String string, String string2);
	
	
	
}
