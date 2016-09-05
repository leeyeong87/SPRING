package day0905.spring.ORM;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import day0905.spring.ORM.User;

public class MemberDAO extends SqlSessionDaoSupport{
	
/*	SqlSession session;
	
	public void setSession(SqlSession session){
		this.session = session;
	}
	
	public List<User> selectAllMem(){
		return session.selectList("myMem.selectAll");
	}
	
	public int selectAllCount(){
		int x = session.selectOne("myMem.selectCount");
		return x;
	}
	
	public User selectAllId(){
		User user = session.selectOne("myMem.selectId","java");
		return user;
	}*/
	SqlSession session;
	
	public void setSession(SqlSession session){
		this.session = session;
	}
	
	public List<User> selectAllMem(){
		return getSqlSession().selectList("myMem.selectAll");
	}
	
	public int selectAllCount(){
		int x = getSqlSession().selectOne("myMem.selectCount");
		return x;
	}
	
	public User selectAllId(){
		User user = getSqlSession().selectOne("myMem.selectId","java");
		return user;
	}
	
}
