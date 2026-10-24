import java.util.HashMap;

public class ContactService {
	
	//instanciate Hash Map
	private HashMap<String, Contact> contacts = new HashMap<String, Contact>();
	
	//add contact with unique ID
	public void addContact(Contact contact) {
		if (contacts.containsKey(contact.getContactId())) {
			throw new IllegalArgumentException("Contact ID already exisit");
		}
		
		contacts.put(contact.getContactId(), contact);
		
	}
	// delete contact
	public void deleteContact(String contactId) {
		if (!contacts.containsKey(contactId)) {
			throw new IllegalArgumentException("Contact ID does not exisit");
		}
		
		contacts.remove(contactId);
	}
	
	//update fist name in the contact
	public void updateFirstName(String contactId, String firstName) {
		if (!contacts.containsKey(contactId)) {
			throw new IllegalArgumentException("Contact ID does not exisit");
		}
		
		contacts.get(contactId).setFirstName(firstName);
	}

	//update last name in the contact
	public void updateLastName(String contactId, String lastName) {
		if (!contacts.containsKey(contactId)) {
			throw new IllegalArgumentException("Contact ID does not exisit");
		}
		
		contacts.get(contactId).setLastName(lastName);
	}

	//update phone number in the contact
	public void updatePhone(String contactId, String phone) {
		if (!contacts.containsKey(contactId)) {
			throw new IllegalArgumentException("Contact ID does not exisit");
		}
		
		contacts.get(contactId).setPhone(phone);
	}
	
	//update address in the contact
	public void updateAddress(String contactId, String address) {
		if (!contacts.containsKey(contactId)) {
			throw new IllegalArgumentException("Contact ID does not exisit");
		}
		
		contacts.get(contactId).setAddress(address);
	}

}
