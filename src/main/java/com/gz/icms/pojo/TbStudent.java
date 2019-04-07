/* create by gz */
package com.gz.icms.pojo;
import java.io.Serializable;

public class TbStudent implements Serializable {

	private String id;

	private String name;

	private String password;

	private int age;

	private String sex;

	private String tell;

	private String major;

	private String academic;

	public TbStudent() {}

	@Override
	public String toString(){
		return "TbStudent [ id=" + id + ",name=" + name + ",password=" + password + ",age=" + age + ",sex=" + sex + ",tell=" + tell + ",major=" + major + ",academic=" + academic + " ]";
	}
	public String getId() {
		return id;
	}

	public void setId( String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName( String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword( String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge( int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex( String sex) {
		this.sex = sex;
	}

	public String getTell() {
		return tell;
	}

	public void setTell( String tell) {
		this.tell = tell;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor( String major) {
		this.major = major;
	}

	public String getAcademic() {
		return academic;
	}

	public void setAcademic( String academic) {
		this.academic = academic;
	}

}