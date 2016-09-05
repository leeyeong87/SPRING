package day0902.spring.JDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context =
				new GenericXmlApplicationContext("jdbcEx.xml");

		jdbcDao2 dao = context.getBean("jdbcDao2",jdbcDao2.class);
		
		int x = dao.insertMem();
		System.out.println("x::"+x);
	
		List<User> mem = dao.selectAll();
				
		for(User user : mem){
			System.out.println(user);
			
		}
		
		User user = dao.selectid("java");
		System.out.println("user::"+user);
		
		System.out.println("Count::"+dao.countMem());
		System.out.println("END!!");
		
	}

	
}









