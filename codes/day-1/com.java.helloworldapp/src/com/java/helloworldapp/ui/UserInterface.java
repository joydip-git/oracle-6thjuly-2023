package com.java.helloworldapp.ui;
import com.java.helloworldapp.util.Utility;

public class UserInterface {
 
	public static void main(String[] args) {
		// => reference type variable
		Utility utilityObj = null;
		utilityObj = new Utility(10,20);
		//utilityObj.a = 11;
		//utilityObj.Utility();
		String message = utilityObj.getMessage("Joydip");
		System.out.println(message);
		//x=> value type variable
		int x = 10;
	}
}
