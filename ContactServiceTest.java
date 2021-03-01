// Name: ContactServiceTest.java
// Author: Cameron Winningham
// Date: 1/24/2021
// Course ID: CS-320 - Software Test Automation & QA
// Description: JUnit tests for ContactService class

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import projectone.Contact;
import projectone.ContactService;

class ContactServiceTest {

	@Test
	void testContactServiceAdd() {
		ContactService service = new ContactService();
		service.add("1", "0", "8885551234", "1");
		assertTrue(service.getTotalContacts() == 1);
	}
	
	@Test
	void testContactServiceMultipleAdd() {
		ContactService service = new ContactService();
		service.add("1", "0", "8885551234", "1");
		service.add("0", "1", "8885551234", "0");
		assertTrue(service.getTotalContacts() == 2);
	}
	
	@Test
	void testContactServiceGetContact() {
		ContactService service = new ContactService();
		int id = service.add("GetMe", "0", "8885551234", "1");
		Contact contact = service.getContact(id);
		assertTrue(contact.getId().equals(Integer.toString(id)));
		assertTrue(contact.getFirstName().equals("GetMe"));
	}
	
	@Test
	void testContactServiceUpdateFirstName() {
		ContactService service = new ContactService();
		int id = service.add("1", "0", "8885551234", "1");
		service.setFirstName(id, "Test");
		Contact contact = service.getContact(id);
		assertTrue(contact.getFirstName().equals("Test"));
	}
	
	@Test
	void testContactServiceDeleteContact() {
		ContactService service = new ContactService();
		int id = service.add("1", "0", "8885551234", "1");
		assertTrue(service.getTotalContacts() == 1);
		service.delete(id);
		assertTrue(service.getTotalContacts() == 0);
	}

}
