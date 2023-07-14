package com.java.interfacedemo.ui;
import com.java.interfacedemo.entities.*;

public class UserInterface {
	public static void main() {
		Implementation implementation = new Implementation();
		System.out.println(implementation.subtract(12,3));
		
		//implicit invocation of interface method
		System.out.println(implementation.add(12,13));
		
		//explicit invocation of interface method
		//Operations implementation = new Implementation();
		//System.out.println(implementation.add(12,13));
		
	}
}
