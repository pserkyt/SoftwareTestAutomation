// Name: ContactTest.java
// Author: Cameron Winningham
// Date: 1/24/2021
// Course ID: CS-320 - Software Test Automation & QA
// Description: JUnit tests for Contact class

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import projectone.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("1", "Cam", "Winning", "8885551234", "123 Abc Blvd");
		assertTrue(contact.getId().equals("1"));
		assertTrue(contact.getFirstName().equals("Cam"));
		assertTrue(contact.getLastName().equals("Winning"));
		assertTrue(contact.getPhone().equals("8885551234"));
		assertTrue(contact.getAddress().equals("123 Abc Blvd"));
	}
	
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678901", "1", "0", "8885551234", "0");
		});
	}
	
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "12345678901", "0", "8885551234", "0");
		});
	}
	
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "0", "12345678901", "8885551234", "0");
		});
	}
	
	@Test
	void testContactPhoneNotLengthTen() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "0", "0", "1", "0");
		});
	}
	
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "0", "1", "8885551234", "1234567890123456789012345678901");
		});
	}

}
