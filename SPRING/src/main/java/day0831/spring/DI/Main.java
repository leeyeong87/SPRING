package day0831.spring.DI;

	import org.springframework.beans.factory.BeanFactory;
	import org.springframework.beans.factory.xml.XmlBeanFactory;
	import org.springframework.core.io.ClassPathResource;
	import org.springframework.core.io.Resource;

	public class Main {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("annoTest.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		WriteArticleService articleService = 
				(WriteArticleService) beanFactory.getBean("writeArticleService");
		articleService.write(new Article());
	}
}