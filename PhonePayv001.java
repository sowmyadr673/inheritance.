package com.xworkz.inheritance;

public class PhonePayv001 {
	String name;
	String version;
	int releaseyear;

	public PhonePayv001(String name, String version, int releaseyear) {
		this.name = name;
		this.version = version;
		this.releaseyear = releaseyear;
	}

	public void login() {
		System.out.println("Phonepay login successful");
	}

	public void logout() {
		System.out.println("Phonepay logout successful");
	}

	public void scanandpay() {
		System.out.println("scanned successfully");
	}
}
