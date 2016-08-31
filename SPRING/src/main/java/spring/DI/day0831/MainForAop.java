package spring.DI.day0831;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainForAop {
	
	public static void main(String[] args){
		String[] configLocations = new String[] {
		"applicationContext.xml", "commonConcern.xml"
		};
		ApplicationContext context = new ClassPathXmlApplicationContext(
				configLocations);
		WriteArticleService articleService
		= context.getBean("writeArticleService", WriteArticleService.class);
		articleService.write(new Article());
	}

}
