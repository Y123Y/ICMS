/* create by gz */
package com.gz.icms.pojo;
import java.io.Serializable;

public class TbPerfession_certify_table implements Serializable {

	private int id;

	private String content;

	private String version;

	private String specialtyname;

	public TbPerfession_certify_table() {}

	@Override
	public String toString(){
		return "TbPerfession_certify_table [ id=" + id + ",content=" + content + ",version=" + version + ",specialtyname=" + specialtyname + " ]";
	}
	public int getId() {
		return id;
	}

	public void setId( int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent( String content) {
		this.content = content;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion( String version) {
		this.version = version;
	}

	public String getSpecialtyname() {
		return specialtyname;
	}

	public void setSpecialtyname( String specialtyname) {
		this.specialtyname = specialtyname;
	}

}