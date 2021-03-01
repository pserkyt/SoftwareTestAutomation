// Name: Contact.java
// Author: Cameron Winningham
// Date: 1/24/2021
// Course ID: CS-320 - Software Test Automation & QA
// Description: Contact class implementation

package projectone;

public class Contact {
	private String id;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;

	public Contact(String id, String first, String last, String phone, String address) {
		// id cannot be null or longer than 10 characters:
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid id");
		}

		// firstName cannot be null or longer than 10 characters:
		if (first == null || first.length() > 10) {
			throw new IllegalArgumentException("Invalid firstName");
		}

		// lastName cannot be null or longer than 10 characters:
		if (last == null || last.length() > 10) {
			throw new IllegalArgumentException("Invalid lastName");
		}

		// phone cannot be null and must be exactly 10 characters long:
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone");
		}

		// address cannot be null or longer than 30 characters:
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}

		// Set the values:
		this.id = id;
		this.firstName = first;
		this.lastName = last;
		this.phone = phone;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
