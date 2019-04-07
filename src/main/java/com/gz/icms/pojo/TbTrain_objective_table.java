/* create by gz */
package com.ctgu.gz.icms.pojo;
import java.io.Serializable;

public class TbTrain_objective_table implements Serializable {

	private int id;

	private String header;

	private int specialtyid;

	private String content;

	private String version;

	private String auditor;

	public TbTrain_objective_table() {}

	@Override
	public String toString(){
		return "TbTrain_objective_table [ id=" + id + ",header=" + header + ",specialtyid=" + specialtyid + ",content=" + content + ",version=" + version + ",auditor=" + auditor + " ]";
	}
	public int getId() {
		return id;
	}

	public void setId( int id) {
		this.id = id;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader( String header) {
		this.header = header;
	}

	public int getSpecialtyid() {
		return specialtyid;
	}

	public void setSpecialtyid( int specialtyid) {
		this.specialtyid = specialtyid;
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

	public String getAuditor() {
		return auditor;
	}

	public void setAuditor( String auditor) {
		this.auditor = auditor;
	}

}