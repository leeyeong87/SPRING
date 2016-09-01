package day0831.spring.DI;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainDI {
	
	public static void main(String[] args){
		AbstractApplicationContext context =
				//new GenericXmlApplicationContext("applicationContext.xml");
				new GenericXmlApplicationContext("DIex.xml");
		
		Foo f = context.getBean("foo", Foo.class);
		f.doFoo();
		context.registerShutdownHook();
		
/*		Foo f1 = (Foo)context.getBean("foo");
							//id/name		
		f.doFoo();
		System.out.println(f==f1);
		f.setI(100);
		System.out.println(f1.i);//singleton일때 : 100
*/	}						   	//prototype일때 : 10

}
