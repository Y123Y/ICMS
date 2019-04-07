/* create by gz */
package com.ctgu.gz.icms.pojo;
import java.io.Serializable;

public class TbCourse_type implements Serializable {

	private int id;

	private String typename;

	public TbCourse_type() {}

	@Override
	public String toString(){
		return "TbCourse_type [ id=" + id + ",typename=" + typename + " ]";
	}
	public int getId() {
		return id;
	}

	public void setId( int id) {
		this.id = id;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename( String typename) {
		this.typename = typename;
	}

}