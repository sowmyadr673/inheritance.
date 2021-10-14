package com.xworkz.inheritance;

public class TestTV3 {

	// hybrid inheritance

	public static void main(String[] args) {

		TV2 tv3 = new TV2();
		System.out.println(tv3.Brand);

		TV1 tv1 = new TV1();
		System.out.println(tv1.Brand);
		tv1.switchon();

		TV tv = new TV();
		System.out.println(tv.Brand);
	}
}
