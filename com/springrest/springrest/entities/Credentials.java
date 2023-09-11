package com.springrest.springrest.entities;

public class Credentials {
	private long id;
	private  String name;
	private String verbalpasscode;
	public Credentials() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Credentials(long id, String name, String verbalpasscode) {
		super();
		this.id = id;
		this.name = name;
		this.verbalpasscode = verbalpasscode;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVerbalpasscode() {
		return verbalpasscode;
	}
	public void setVerbalpasscode(String verbalpasscode) {
		this.verbalpasscode = verbalpasscode;
	}
	@Override
	public String toString() {
		return "Credentials [id=" + id + ", name=" + name + ", verbalpasscode=" + verbalpasscode + "]";
	}
	

}
