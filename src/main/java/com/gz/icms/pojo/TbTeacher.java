/* create by gz */
package com.ctgu.gz.icms.pojo;
import java.io.Serializable;

public class TbTeacher implements Serializable {

	private String id;

	private String name;

	private String password;

	private String email;

	private String academic;

	private String tell;

	public TbTeacher() {}

	@Override
	public String toString(){
		return "TbTeacher [ id=" + id + ",name=" + name + ",password=" + password + ",email=" + email + ",academic=" + academic + ",tell=" + tell + " ]";
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

	public String getEmail() {
		return email;
	}

	public void setEmail( String email) {
		this.email = email;
	}

	public String getAcademic() {
		return academic;
	}

	public void setAcademic( String academic) {
		this.academic = academic;
	}

	public String getTell() {
		return tell;
	}

	public void setTell( String tell) {
		this.tell = tell;
	}

}