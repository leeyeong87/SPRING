package day0831.spring.DI;

public class MySQLArticleDao implements ArticleDao{
	
	public void insert(Article article){
		System.out.println("MySQLArticleDao.insert() ½ÇÇà");
	}

}
