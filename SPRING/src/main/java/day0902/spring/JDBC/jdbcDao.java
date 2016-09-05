package day0902.spring.JDBC;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class jdbcDao {

	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<User> selectAll() {
		String sql = "select * from member";
		UserRowMapper mapper = new UserRowMapper();
		List<User> member = jdbcTemplate.query(sql, mapper);
		return member;
	}
	
	public int insertMem() throws DataAccessException{ 
		String sql = "insert into member values(?,?,?,?)";
		int x = jdbcTemplate.update(sql, new Object[]{"java", "java1", "java2", "java3"} );
		return x;
	}
	
	public User selectid(String id){ 
		UserRowMapper mapper = new UserRowMapper();
		String sql = "select * from member where memberId=?";
		String[] value = { id };
		User user = jdbcTemplate.queryForObject(sql, value, mapper);
			/*UserRowMapper mapper = new UserRowMapper();
			String sql = "select * from member where memberId=?";
			String[] value = { id };
			User user = jdbcTemplate.queryForObject(sql, new Object[]{"java"}, mapper);*/
		return user;
	}
	
	public int countMem(){ 
		String sql = "select count(*) from member";
		int x =  jdbcTemplate.queryForObject(sql, Integer.class);
		return x;		
	}

}
