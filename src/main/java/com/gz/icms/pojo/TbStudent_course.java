/* create by gz */
package com.gz.icms.pojo;
import java.io.Serializable;

public class TbStudent_course implements Serializable {

	private int id;

	private String studentid;

	private int classid;

	public TbStudent_course() {}

	@Override
	public String toString(){
		return "TbStudent_course [ id=" + id + ",studentid=" + studentid + ",classid=" + classid + " ]";
	}
	public int getId() {
		return id;
	}

	public void setId( int id) {
		this.id = id;
	}

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid( String studentid) {
		this.studentid = studentid;
	}

	public int getClassid() {
		return classid;
	}

	public void setClassid( int classid) {
		this.classid = classid;
	}

}