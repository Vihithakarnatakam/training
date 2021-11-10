package ex5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hi")
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

@Value("Hello Spring")
	public void setMessage(String message) {
		this.message = message;
	}

}
