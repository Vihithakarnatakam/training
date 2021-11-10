package ex4;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MessageProcessor implements ApplicationContextAware {
	public MessageProcessor() {
		System.out.println("Message Processor Constructor");
	}
	private ApplicationContext ctx;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationcontext) throws BeansException {
		ctx = applicationcontext;
		
	}
	
	public void process(String type, String to, String msg ) {
		Message m = (Message) ctx.getBean(type);
		m.send(to, msg);
	}

}
