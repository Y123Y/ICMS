/* create by gz */
package com.ctgu.gz.icms.pojo;
import java.io.Serializable;

public class TbTrain_plan_audte_table implements Serializable {

	private int id;

	private String auditor;

	private int trainplanid;

	private String outcome;

	private java.sql.Date time;

	public TbTrain_plan_audte_table() {}

	@Override
	public String toString(){
		return "TbTrain_plan_audte_table [ id=" + id + ",auditor=" + auditor + ",trainplanid=" + trainplanid + ",outcome=" + outcome + ",time=" + time + " ]";
	}
	public int getId() {
		return id;
	}

	public void setId( int id) {
		this.id = id;
	}

	public String getAuditor() {
		return auditor;
	}

	public void setAuditor( String auditor) {
		this.auditor = auditor;
	}

	public int getTrainplanid() {
		return trainplanid;
	}

	public void setTrainplanid( int trainplanid) {
		this.trainplanid = trainplanid;
	}

	public String getOutcome() {
		return outcome;
	}

	public void setOutcome( String outcome) {
		this.outcome = outcome;
	}

	public java.sql.Date getTime() {
		return time;
	}

	public void setTime( java.sql.Date time) {
		this.time = time;
	}

}