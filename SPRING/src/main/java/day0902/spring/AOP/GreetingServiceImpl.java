package day0902.spring.AOP;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("greetingTarget")
public class GreetingServiceImpl implements GreetingService{
	
	private String greeting;
	@Value("abc")
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	//�ٽɷ���
	public void sayHello(String name) throws Exception{
		System.out.println("sayHello : "+greeting+":"+name);
		throw new Exception("���� ���� �߻�");
	}
	//�ٽɷ���
	public void sayGoodbye(String name){
		System.out.println("sayGoodbye : "+greeting+":"+name);
	}	

}
