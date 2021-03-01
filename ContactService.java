// Name: ContactService.java
// Author: Cameron Winningham
// Date: 1/24/2021
// Course ID: CS-320 - Software Test Automation & QA
// Description: ContactService class to manage contacts

package projectone;

import java.util.Vector;

public class ContactService {
	private Vector<Contact> contacts; // Vector of contacts.
	private int unique = 0; // Unique ID integer.

	// Constructor:
	public ContactService() {
		contacts = new Vector<Contact>(); // Initialize the contact vector.
	}

	// Add a contact to the contact vector:
	public int add(String first, String last, String phone, String address) {
		// Create a fresh new contact:
		Contact contact = new Contact(Integer.toString(unique), first, last, phone, address);

		// Add to vector and increment ID count:
		contacts.add(contact);
		unique++;

		return unique-1;
	}

	// Delete a contact from the contact vector:
	public boolean delete(int id) {
		// Iterate through the contacts vector:
		for (int i = 0; i < contacts.size(); ++i) {
			// Found the correct ID?
			if (contacts.elementAt(i).getId().equals(Integer.toString(id))) {
				// Remove it:
				contacts.remove(id);
				return true;
			}
		}

		// Could not find contact with that ID:
		return false;
	}

	// Set a contact's first name:
	public boolean setFirstName(int id, String first) {
		// Iterate through the contacts vector:
		for (int i = 0; i < contacts.size(); ++i) {
			// Found the correct ID?
			if (contacts.elementAt(i).getId().equals(Integer.toString(id))) {
				// Set the first name:
				contacts.get(i).setFirstName(first);
				return true;
			}
		}

		return false;
	}

	// Set a contact's last name:
	public boolean setLastName(int id, String last) {
		// Iterate through the contacts vector:
		for (int i = 0; i < contacts.size(); ++i) {
			// Found the correct ID?
			if (contacts.elementAt(i).getId().equals(Integer.toString(id))) {
				// Set the last name:
				contacts.get(i).setLastName(last);
				return true;
			}
		}

		return false;
	}

	// Set a contact's phone:
	public boolean setPhone(int id, String phone) {
		// Iterate through the contacts vector:
		for (int i = 0; i < contacts.size(); ++i) {
			// Found the correct ID?
			if (contacts.elementAt(i).getId().equals(Integer.toString(id))) {
				// Set the phone:
				contacts.get(i).setPhone(phone);
				return true;
			}
		}

		return false;
	}

	// Set a contact's address:
	public boolean setAddress(int id, String address) {
		// Iterate through the contacts vector:
		for (int i = 0; i < contacts.size(); ++i) {
			// Found the correct ID?
			if (contacts.elementAt(i).getId().equals(Integer.toString(id))) {
				// Set the address:
				contacts.get(i).setAddress(address);
				return true;
			}
		}

		return false;
	}

	public Contact getContact(int id) {
		// Iterate through the contacts vector:
		for (int i = 0; i < contacts.size(); ++i) {
			Contact contact = contacts.elementAt(i);
			// Found the correct ID?
			if (contact.getId().equals(Integer.toString(id))) {
				return contact;
			}
		}
		
		return null;
	}

	// Returns total contacts in contact vector:
	public int getTotalContacts() {
		return contacts.size();
	}

}
