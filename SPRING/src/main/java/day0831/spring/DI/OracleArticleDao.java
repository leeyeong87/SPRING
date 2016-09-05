package day0831.spring.DI;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("oracle")
public class OracleArticleDao implements ArticleDao{
	
	@Override
	public void insert(Article article){
		System.out.println("OracleArticleDao.insert() ½ÇÇà");
	}
}
