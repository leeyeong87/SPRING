package spring.DI.day0831;

public class WriteArticleServiceImpl implements WriteArticleService {

    private ArticleDao articleDao;

    public void write(Article article) {
        System.out.println("WriteArticleServiceImpl.write() �޼��� ����");
        articleDao.insert(article);
    }
    
    public WriteArticleServiceImpl(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }



}