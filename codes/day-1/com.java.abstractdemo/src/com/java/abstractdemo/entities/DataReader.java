package com.java.abstractdemo.entities;

public abstract class DataReader {
	private String path;
	
	public DataReader() {}
	public DataReader(String path) {
		this.path = path;
		System.out.println("DataReader ctor");
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	public abstract String getData();
	//public abstract String getValue();
	//public abstract String setValue(String value);
	
}
