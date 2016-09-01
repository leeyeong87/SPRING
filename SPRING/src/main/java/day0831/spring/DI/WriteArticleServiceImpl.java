package day0831.spring.DI;

public class WriteArticleServiceImpl implements WriteArticleService {

    private ArticleDao articleDao;

    public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}
    
    public WriteArticleServiceImpl(){}

	public void write(Article article) {
        System.out.println("WriteArticleServiceImpl.write() �޼��� ����");
        articleDao.insert(article);
    }
    
    public WriteArticleServiceImpl(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }



}