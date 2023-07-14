package com.java.abstractdemo.entities;

public final class TextFileReader extends FileDataReader {

	public TextFileReader() {}
	public TextFileReader(String textFilePath) {
		super(textFilePath);
		System.out.println("TextFileDataReader ctor");
	}
	
	@Override
	public String getData() {
		// fetch data from text file using java.io classes
		return "text file data";
	}
}
