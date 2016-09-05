package day0905.spring.ORM;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import day0905.spring.ORM.User;

public class Main {
	
	public static void main(String[] args){
		ApplicationContext context = 
				new GenericXmlApplicationContext("mybatis.xml");
		
		MemberDAO dao = context.getBean("dao",MemberDAO.class);
		List<User> mem = dao.selectAllMem();
		
		for(User user : mem){
			System.out.println(user);
		}
		System.out.println("Count:"+dao.selectAllCount());
		User user = dao.selectAllId();
		System.out.println(user);
		System.out.println("END!!");
		
	}

}
