package zyf.entity;

public class User {
	private String name;
	private String pwd;
	private String id ;
	private String age;
	private String des;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public User(String name, String pwd, String id, String age, String des) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.id = id;
		this.age = age;
		this.des = des;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", pwd=" + pwd + ", id=" + id + ", age="
				+ age + ", des=" + des + "]";
	}
	
	

}
