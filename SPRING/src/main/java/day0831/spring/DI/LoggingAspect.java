package day0831.spring.DI;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
@Component
@Aspect
public class LoggingAspect {
		private Log log = LogFactory.getLog(getClass());

		@Around("execution(* *..*Service.*(..))")
		public Object logging(ProceedingJoinPoint joinPoint) throws Throwable {
			log.info("기록 시작");
			StopWatch stopWatch = new StopWatch();
			try {
				stopWatch.start();
				Object retValue = joinPoint.proceed();
				return retValue;
			} catch (Throwable e) {
				throw e;
			} finally {
				stopWatch.stop();
				log.info("기록 종료");
				log.info(joinPoint.getSignature().getName() + "메서드 실행 시간 : "
					+ stopWatch.getTotalTimeMillis());
			}
		}
}
