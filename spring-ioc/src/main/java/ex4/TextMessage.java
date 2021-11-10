package ex4;

public class TextMessage implements Message {
	
	public TextMessage() {
		System.out.println("Text Message Constructor");
	}
	public void send(String to, String msg) {
		System.out.println("SMS sent to " + "as" + msg);
		
	}

}
