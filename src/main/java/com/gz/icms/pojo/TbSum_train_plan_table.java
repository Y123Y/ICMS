/* create by gz */
package com.ctgu.gz.icms.pojo;
import java.io.Serializable;

public class TbSum_train_plan_table implements Serializable {

	private int id;

	private String header;

	private String auditor;

	private int trainobjectiveid;

	private java.sql.Date maketime;

	public TbSum_train_plan_table() {}

	@Override
	public String toString(){
		return "TbSum_train_plan_table [ id=" + id + ",header=" + header + ",auditor=" + auditor + ",trainobjectiveid=" + trainobjectiveid + ",maketime=" + maketime + " ]";
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

	public String getAuditor() {
		return auditor;
	}

	public void setAuditor( String auditor) {
		this.auditor = auditor;
	}

	public int getTrainobjectiveid() {
		return trainobjectiveid;
	}

	public void setTrainobjectiveid( int trainobjectiveid) {
		this.trainobjectiveid = trainobjectiveid;
	}

	public java.sql.Date getMaketime() {
		return maketime;
	}

	public void setMaketime( java.sql.Date maketime) {
		this.maketime = maketime;
	}

}