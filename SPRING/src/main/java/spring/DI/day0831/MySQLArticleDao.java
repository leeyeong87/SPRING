package spring.DI.day0831;

public class MySQLArticleDao implements ArticleDao{
	
	public void insert(Article article){
		System.out.println("MySQLArticleDao.insert() ½ÇÇà");
	}

}
