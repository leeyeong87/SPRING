package spring.DI.day0831;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainDI {
	
	public static void main(String[] args){
		ApplicationContext context =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		Foo f = context.getBean("foo1", Foo.class);
	}

}
