package com.java.interfacedemo.entities;

public class Implementation implements Operations, Sample {
	public int add(int first, int second) {
		return first + second;
	}

	public int subtract(int first, int second) {
		return first - second;
	}

	@Override
	public void foo() {
		System.out.println("foo");
	}
}