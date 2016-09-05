package day0902.spring.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetinTest {
	
	public static void main(String[] args){
		ApplicationContext ctx =
				new ClassPathXmlApplicationContext("AOP.xml");
		GreetingService bean = (GreetingService) ctx.getBean("greetingTarget");
		
		try {
			bean.sayHello("고길동");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bean.sayGoodbye("고희동");
	}

}
