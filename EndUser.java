package com.xworkz.inheritance;

public class EndUser {
	
	public static void displayInfo(PhonePayv001 objs[]) {
		System.out.println("Phonepay Information");
		for (int i = 0; i < objs.length; i++) {
			System.out.println(objs[i].name);
			System.out.println(objs[i].version);
			System.out.println(objs[i].releaseyear);
			System.out.println(" ");
		}

	}

	public static void main(String[] args) {
		PhonePayv001 py1 = new PhonePayv001("Phone pay", "V001", 2016);

		PhonePayv001 py2 = new PhonePayv001("Phone pay", "V001", 2017);
		PhonePayv001 py3 = new PhonePayv001("Phone pay", "V001", 2018);
		PhonePayv001 py4 = new PhonePayv001("Phone pay", "V001", 2019);

		PhonePayv001 objs[] = { py1, py2, py3,py4 };
		EndUser.displayInfo(objs);

	}

}
