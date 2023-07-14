package com.java.abstractdemo.entities;

public abstract class DbDataReader extends DataReader {	
	public DbDataReader() {}
	public DbDataReader(String dbPath) {		
		super(dbPath);
		System.out.println("DbDataReader ctor");
	}
	public void openConnection() {}
	public void closeConnection() {}
	/*@Override
	public String getData() {
		// fetch data from database using JDBC
		return "database data";
	}*/
}
