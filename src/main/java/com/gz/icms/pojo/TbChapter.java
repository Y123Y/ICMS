/* create by gz */
package com.ctgu.gz.icms.pojo;
import java.io.Serializable;

public class TbChapter implements Serializable {

	private int id;

	private int classid;

	private String title;

	private String content;

	private java.sql.Timestamp time;

	public TbChapter() {}

	@Override
	public String toString(){
		return "TbChapter [ id=" + id + ",classid=" + classid + ",title=" + title + ",content=" + content + ",time=" + time + " ]";
	}
	public int getId() {
		return id;
	}

	public void setId( int id) {
		this.id = id;
	}

	public int getClassid() {
		return classid;
	}

	public void setClassid( int classid) {
		this.classid = classid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle( String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent( String content) {
		this.content = content;
	}

	public java.sql.Timestamp getTime() {
		return time;
	}

	public void setTime( java.sql.Timestamp time) {
		this.time = time;
	}

}