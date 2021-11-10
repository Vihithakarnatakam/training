package ex3;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyLife {
	@Test
	public void testLife() {
	//	ApplicationContext appCtx = new ClassPathXmlApplicationContext("ex3ctx.xml");
		ConfigurableApplicationContext appCtx1 = new ClassPathXmlApplicationContext("ex3ctx.xml");
		appCtx1.getBean(MyLife.class);
		
		appCtx1.close();
	}

}
