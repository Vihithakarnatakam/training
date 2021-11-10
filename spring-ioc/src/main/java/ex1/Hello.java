package ex1;

public class Hello {
private String message;
	
	//default constructor
	public Hello() {
	}
	
	//parameterized constructor
	public Hello(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
