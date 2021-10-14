package com.xworkz.inheritance;

public class TestTV {
//single inheritance

	public static void main(String[] args) {

		TV1 tv1 = new TV1();
		System.out.println(tv1.Brand);
		tv1.switchon();

		TV tv = new TV();
		System.out.println(tv.Brand);
	}

}
