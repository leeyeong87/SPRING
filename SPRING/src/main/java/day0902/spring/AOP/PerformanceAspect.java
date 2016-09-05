package day0902.spring.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceAspect {
	@Pointcut("execution(public * day0902.spring.AOP..*sayHello*(..))")
	public void setPointCut(){}
	
	
	@Around("setPointCut()")
	public Object timeCheck(ProceedingJoinPoint joinPoint) throws Throwable{
		Signature s = joinPoint.getSignature();
		String methodName = s.getName();
		long startTime = System.nanoTime();
		System.out.println("[Log]METHOD before : "+methodName+"time check start");
		Object obj = null;
		
		try{
			obj = joinPoint.proceed();
		}catch(Exception e){
			System.out.println("[Log]METHOD error : "+methodName);
		}
		
		long endTime = System.nanoTime();
		System.out.println("[Log]METHOD after : "+methodName+"time check end");
		System.out.println("[Log]"+methodName+"Processing time is "+(endTime-startTime)+"ns");
		return obj;
	}

}
