package day0901.spring.Annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.stereotype.Component;
/*@Component*/
public class Foo {
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void doFoo(){
		System.out.println("Foo.doFoo");
	}
	
	@PostConstruct//檬扁拳贸府
	public void start(){
		System.out.println("Foo.start");
	}
	
	@PreDestroy//家戈贸府
	public void stop(){
		System.out.println("Foo.stop");
	}

}
