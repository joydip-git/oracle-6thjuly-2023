package com.java.interfacedemo.entities;

public class Logic implements IExtraLogic {
	@Override
	public boolean isEven(int num) {
		return num % 2 == 0;
	}

	@Override
	public boolean isOdd(int num) {
		return num % 2 != 0;
	}

	@Override
	public boolean isGreater(int num) {

		return num > 5;
	}
}
