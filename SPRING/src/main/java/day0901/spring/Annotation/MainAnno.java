package day0901.spring.Annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
//빈으로 등록 안함
public class MainAnno {
	
	public static void main(String[] args){
		AbstractApplicationContext context
		= new GenericXmlApplicationContext("annoTest.xml");
		Bar bar = context.getBean("bar", Bar.class);
		bar.doBar();
		Foo foo = context.getBean("scottFoo",Foo.class);
		
		System.out.println(foo.getName());
				
		context.registerShutdownHook();
	}

}
