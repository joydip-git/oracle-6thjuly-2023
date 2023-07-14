package com.java.abstractdemo.entities;

public abstract class FileDataReader extends DataReader {
	public FileDataReader() {}
	public FileDataReader(String filePath) {
		super(filePath);
		System.out.println("FileDataReader ctor");
	}
	public void openFile() {}
	public void closeFile() {}
}
