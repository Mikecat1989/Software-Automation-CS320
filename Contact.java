
public class Contact {
	
	private final String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	//Create the public Contact
	public Contact(String contactId, String firstName, String lastName, String phone,
			String address) {
		
	
	//ConactId validation check not null not greater then 10 characters
	if (contactId == null || contactId.length() > 10) {
		throw new IllegalArgumentException("Contact ID not valid");
	}
	this.contactId = contactId;
	
	//firstName validation check not null not greater then 10 characters
	if (firstName == null || firstName.length() > 10) {
		throw new IllegalArgumentException("First Name not valid");
	}
	this.firstName = firstName;
	
	//lastName validation check not null not greater then 10 characters
	if (lastName == null || lastName.length() > 10) {
		throw new IllegalArgumentException("Last Name not valid");
	}
	this.lastName = lastName;
	
	//phone validation check not null and exactly then 10 digits no characters
	if (phone == null || !phone.matches("\\d{10}")) {
		throw new IllegalArgumentException("Phone not valid");
	}
	this.phone = phone;
	
	//address validation check not null not greater then 30 characters
	if (address == null || address.length() > 30) {
		throw new IllegalArgumentException("Address not valid");
	}
	this.address = address;
	}
	
	//Get the contact ID
	public String getContactId() {
		return contactId;
	}
	
	//Get first name
	public String getFirstName() {
		return firstName;
	}
	
	//Get last name
	public String getLastName() {
		return lastName;
	}
	
	//Get the phone number
	public String getPhone() {
		return phone;
	}
	
	//Get the address
	public String getAddress() {
		return address;
	}
	
	//set first name
	public void setFirstName(String firstName) {
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("First name not valid");
		}
		this.firstName = firstName;
	}
	
	//set last name
	public void setLastName(String lastName) {
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("last name not valid");
		}
		this.lastName = lastName;
	}
	
	//set phone
	public void setPhone(String phone) {
		if (phone == null || !phone.matches("\\d{10}")) {
			throw new IllegalArgumentException("Phone number not valid");
		}
		this.phone = phone;
	}
	
	//set address
	public void setAddress(String address) {
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Address not valid");
		}
		this.address = address;
	}
	
	
}
