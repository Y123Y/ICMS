/* create by gz */
package com.ctgu.gz.icms.pojo;
import java.io.Serializable;

public class TbTrain_plan_detial_table implements Serializable {

	private int id;

	private String coursename;

	private String credit;

	private String term;

	private String version;

	private int trainplanid;

	public TbTrain_plan_detial_table() {}

	@Override
	public String toString(){
		return "TbTrain_plan_detial_table [ id=" + id + ",coursename=" + coursename + ",credit=" + credit + ",term=" + term + ",version=" + version + ",trainplanid=" + trainplanid + " ]";
	}
	public int getId() {
		return id;
	}

	public void setId( int id) {
		this.id = id;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename( String coursename) {
		this.coursename = coursename;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit( String credit) {
		this.credit = credit;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm( String term) {
		this.term = term;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion( String version) {
		this.version = version;
	}

	public int getTrainplanid() {
		return trainplanid;
	}

	public void setTrainplanid( int trainplanid) {
		this.trainplanid = trainplanid;
	}

}