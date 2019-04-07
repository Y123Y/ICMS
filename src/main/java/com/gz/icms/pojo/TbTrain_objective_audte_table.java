/* create by gz */
package com.ctgu.gz.icms.pojo;
import java.io.Serializable;

public class TbTrain_objective_audte_table implements Serializable {

	private int id;

	private String auditor;

	private int trainobjectiveid;

	private String outcome;

	private java.sql.Date time;

	public TbTrain_objective_audte_table() {}

	@Override
	public String toString(){
		return "TbTrain_objective_audte_table [ id=" + id + ",auditor=" + auditor + ",trainobjectiveid=" + trainobjectiveid + ",outcome=" + outcome + ",time=" + time + " ]";
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

	public int getTrainobjectiveid() {
		return trainobjectiveid;
	}

	public void setTrainobjectiveid( int trainobjectiveid) {
		this.trainobjectiveid = trainobjectiveid;
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