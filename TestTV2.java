package com.xworkz.inheritance;

public class TestTV2 extends TV1 {

	// TestTV2 class extends already extended class TV1
//multilevel inheritance

	String Brand = "sony2";
	int screensize = 32;
	int resolution = 1325;

	public static void main(String[] args) {

		TestTV2 tv2 = new TestTV2();
		System.out.println(tv2.Brand);

		TV1 tv1 = new TV1();
		System.out.println(tv1.Brand);
		tv1.watch();
	}
}