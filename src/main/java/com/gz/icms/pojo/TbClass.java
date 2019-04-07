/* create by gz */
package com.gz.icms.pojo;
import java.io.Serializable;

public class TbClass implements Serializable {

	private int id;

	private String name;

	private String teacherid;

	private int courseid;

	public TbClass() {}

	@Override
	public String toString(){
		return "TbClass [ id=" + id + ",name=" + name + ",teacherid=" + teacherid + ",courseid=" + courseid + " ]";
	}
	public int getId() {
		return id;
	}

	public void setId( int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName( String name) {
		this.name = name;
	}

	public String getTeacherid() {
		return teacherid;
	}

	public void setTeacherid( String teacherid) {
		this.teacherid = teacherid;
	}

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid( int courseid) {
		this.courseid = courseid;
	}

}