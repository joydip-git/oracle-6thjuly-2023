package com.java.abstractdemo.ui;

import com.java.abstractdemo.entities.*;

public class UserInterface {
	public static void main(String[] args) {
		// OracleDbDataReader dbReader = new OracleDbDataReader();
		//DbDataReader dbReader = new OracleDbDataReader();
		DataReader dbReader = new OracleDbDataReader("name=ot;username=ot;password=Orcl2022");
		System.out.println(dbReader.getPath());
		System.out.println(dbReader.getData());
		
		//TextFileReader fileReader = new TextFileReader();
		//FileDataReader fileReader = new TextFileReader();
		DataReader fileReader = new TextFileReader("C:\\data.txt");
		System.out.println(fileReader.getPath());
		System.out.println(fileReader.getData());
	}
}
