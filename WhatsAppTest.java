package com.xworkz.inheritance;

public class WhatsAppTest {

	public static void main(String[] args) {

		WhatsAppv002 whatsAppv002 = new WhatsAppv002();
		System.out.println(whatsAppv002.version);
		whatsAppv002.chat();

		WhatsAppv001 whatsAppv001 = new WhatsAppv001();
		System.out.println(whatsAppv001.version);

	}

}
