package com.xworkz.inheritance;

public class TestTV4 extends TV,TV1 { 
	
	//TV and TV1 are parent classes TestTV4 is the child class
	//java doesnot support multiple inheritance 

	public static void main(String[] args) {

		TV3 tv4 = new TV3();
		System.out.println(tv4.Brand);
}
}