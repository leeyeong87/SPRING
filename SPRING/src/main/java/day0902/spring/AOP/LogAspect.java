package day0902.spring.AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
	
	@Pointcut("execution(public * day0902.spring.AOP.GreetingServiceImpl.say*(..))")
	public void publicMethod(){}
	
	@Before("publicMethod()")
	public void beforeLogging(){
		System.out.println("**�޼��� ȣ�� ��**");
	}
	@AfterReturning(pointcut="publicMethod()", returning="returnValue")
	public void afterLogging(Object returnValue){
		System.out.println("**�޼��� ȣ�� ��**");
	}
	@AfterThrowing(pointcut="publicMethod()", throwing="ex")
	public void throwingLogging(Exception ex){
		System.out.println("**���� �߻� : "+ex.getMessage()+"**");
	}
	@After("execution(* *(..))")
	public void alwayLogging(){
		System.out.println("**�׻� ����**");
	}

}
