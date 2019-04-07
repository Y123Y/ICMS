/* create by gz */
package com.ctgu.gz.icms.pojo;
import java.io.Serializable;

public class TbSpecialty implements Serializable {

	private int id;

	private String header;

	private String name;

	private String explain;

	public TbSpecialty() {}

	@Override
	public String toString(){
		return "TbSpecialty [ id=" + id + ",header=" + header + ",name=" + name + ",explain=" + explain + " ]";
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

	public String getName() {
		return name;
	}

	public void setName( String name) {
		this.name = name;
	}

	public String getExplain() {
		return explain;
	}

	public void setExplain( String explain) {
		this.explain = explain;
	}

}