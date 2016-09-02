package day0831.spring.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component("WriteArticleService")
public class WriteArticleServiceImpl implements WriteArticleService {

    private ArticleDao articleDao;
    
    @Required
    @Autowired
    @Qualifier("oracle")
    public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}
    
    public WriteArticleServiceImpl(){}

	public void write(Article article) {
        System.out.println("WriteArticleServiceImpl.write() 메서드 실행");
        articleDao.insert(article);
    }
    
    public WriteArticleServiceImpl(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }



}