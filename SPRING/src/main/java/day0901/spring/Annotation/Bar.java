package day0901.spring.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Bar {
	
	private Foo foo;
	
	/*@Required//필수 속성*/
	/*@Resource//필요 자원 자동 연결*/
	/*
	@Autowired//같은타입 사용

	public void setFoo(Foo foo){
		this.foo = foo;
	}*/
	@Bean(name="scottFoo")
	public Foo activeFoo(){
		Foo foo = new Foo();
		foo.setName("scott");
		return foo;
	}
	
	@Autowired
	@Qualifier("action")
	public void setFoo(Foo foo){
		this.foo = foo;
	}
	
	public void doBar(){
		foo.doFoo();
	}

}
