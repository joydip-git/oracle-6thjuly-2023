package com.java.abstractdemo.entities;

public final class OracleDbDataReader extends DbDataReader{
	public OracleDbDataReader() {}
	public OracleDbDataReader(String orclDbPath) {
		super(orclDbPath);
		System.out.println("OrcaleDbDataReader ctor");
	}
	@Override
	public String getData() {
		return "oracle db data";
	}
}
