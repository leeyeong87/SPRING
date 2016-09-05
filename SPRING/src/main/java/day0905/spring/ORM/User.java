package day0905.spring.ORM;

public class User {

	private String memberid;
	private String password;
	private String name;
	private String email;
	
	public User(){}
	public User(String id, String pwd,String name,String email){
		
		this.memberid = id;
		this.password = pwd;
		this.name = name;
		this.email = email;
	}
	
	
	public String getMemberid() {
		return memberid;
	}
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [memberid=" + memberid + ", password=" + password + ", name=" + name + ", email=" + email + "]";
	}
	
	
}















