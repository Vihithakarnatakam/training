package ex8;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessage {
	
	@Test
	public void testSend() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ex4ctx.xml");
		
		MessageProcessor mp = (MessageProcessor) ctx.getBean("mp");
		
		mp.process("sms", "43859450", "How are you");
		mp.process("email", "vihitha5777@gmail.com", "Whatsup");
	}

}
