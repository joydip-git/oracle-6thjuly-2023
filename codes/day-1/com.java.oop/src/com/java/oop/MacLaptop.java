package com.java.oop;

public class MacLaptop {
	// instance data member
	private String modelName;
	private String serialNo;
	private float price;
	private int makeYear;
	private String color;
	private int size;
	private static String companyName;	

	static {
		companyName = "Apple Inc.";
		System.out.println("Setting value for companyName only once: " + companyName);
	}

	public MacLaptop() {
	}

	public MacLaptop(String modelName, String serialNo, float price, int makeYear, String color, int size) {
		this.modelName = modelName;
		this.color = color;
		this.serialNo = serialNo;
		this.price = price;
		this.makeYear = makeYear;
		this.size = size;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getMakeYear() {
		return makeYear;
	}

	public void setMakeYear(int makeYear) {
		this.makeYear = makeYear;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public static String getCompanyName() {
		return companyName;
	}

	public static void setCompanyName(String _companyName) {
		companyName = _companyName;
	}

	public String getInfo() {
		return companyName + ", " + this.modelName + ", " + this.serialNo + ", " + price + ", " + makeYear + ", "
				+ color + ", " + size;
	}
//	public static String sayHello() {
//		//return color;
//	}
}
