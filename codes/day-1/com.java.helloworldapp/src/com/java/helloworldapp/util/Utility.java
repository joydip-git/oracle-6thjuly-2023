package com.java.helloworldapp.util;

public class Utility {
	public int a;
	public int m;
	String data;
	public Utility() {
		//a = 0;
		//m = 0;
		data = "my data";
	}
	public Utility(int x, int y) {
		a = x;
		m = y;
	}
	public String getMessage(String name) {
		return "Hello "+name;
	}
}
