package day0831.spring.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainForAop {
	
	public static void main(String[] args){
		String[] configLocations = new String[] {"commonConcern.xml"};
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocations);
		WriteArticleService articleService
		= context.getBean("WriteArticleService", WriteArticleService.class);
		articleService.write(new Article());
	}

}
