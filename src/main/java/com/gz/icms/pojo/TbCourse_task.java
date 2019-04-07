/* create by gz */
package com.ctgu.gz.icms.pojo;
import java.io.Serializable;

public class TbCourse_task implements Serializable {

	private int id;

	private int chapterid;

	private String content;

	private java.sql.Timestamp time;

	public TbCourse_task() {}

	@Override
	public String toString(){
		return "TbCourse_task [ id=" + id + ",chapterid=" + chapterid + ",content=" + content + ",time=" + time + " ]";
	}
	public int getId() {
		return id;
	}

	public void setId( int id) {
		this.id = id;
	}

	public int getChapterid() {
		return chapterid;
	}

	public void setChapterid( int chapterid) {
		this.chapterid = chapterid;
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