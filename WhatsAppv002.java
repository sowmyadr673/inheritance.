package com.xworkz.inheritance;

public class WhatsAppv002 extends WhatsAppv001 {

	String version = "v002";

	public WhatsAppv002() {
		System.out.println("Version2 is created");
	}

	public void voiceCall() {
		System.out.println("user can enjoy video call");
	}

	public void setProfilePicture() {
		System.out.println("Profile picture Sync done");
	}

}
