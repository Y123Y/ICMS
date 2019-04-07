/* create by gz */
package com.gz.icms.pojo;
import java.io.Serializable;

public class TbTask_records implements Serializable {

	private int id;

	private int taskid;

	private String studentid;

	private java.sql.Timestamp finishedtime;

	public TbTask_records() {}

	@Override
	public String toString(){
		return "TbTask_records [ id=" + id + ",taskid=" + taskid + ",studentid=" + studentid + ",finishedtime=" + finishedtime + " ]";
	}
	public int getId() {
		return id;
	}

	public void setId( int id) {
		this.id = id;
	}

	public int getTaskid() {
		return taskid;
	}

	public void setTaskid( int taskid) {
		this.taskid = taskid;
	}

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid( String studentid) {
		this.studentid = studentid;
	}

	public java.sql.Timestamp getFinishedtime() {
		return finishedtime;
	}

	public void setFinishedtime( java.sql.Timestamp finishedtime) {
		this.finishedtime = finishedtime;
	}

}