/* create by gz */
package com.gz.icms.pojo;
import java.io.Serializable;

public class TbResource implements Serializable {

	private int id;

	private int chapterid;

	private String description;

	private String path;

	public TbResource() {}

	@Override
	public String toString(){
		return "TbResource [ id=" + id + ",chapterid=" + chapterid + ",description=" + description + ",path=" + path + " ]";
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

	public String getDescription() {
		return description;
	}

	public void setDescription( String description) {
		this.description = description;
	}

	public String getPath() {
		return path;
	}

	public void setPath( String path) {
		this.path = path;
	}

}