import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testAddContact() {
		ContactService service = new ContactService();
		
		//Create contact 1
		Contact contact1 = new Contact("00001", "Mike", "Catsoulis", "6094688756", 
				"678 Ocean ave");
		
		//Create contact 2
		Contact contact2 = new Contact("00001", "Laura", "Catsoulis", "6094688989", 
				"999 Ocean ave");
		
		service.addContact(contact1);
		
		//Validate try to add second contact with same contact ID throws error
		assertThrows(IllegalArgumentException.class, () -> {
			service.addContact(contact2);
		});
	}

	
	@Test
	void testDeleteContact() {
		ContactService service = new ContactService();
		
		//Create contact 1
		Contact contact1 = new Contact("00001", "Mike", "Catsoulis", "6094688756", 
				"678 Ocean ave");
			
		service.addContact(contact1);
		service.deleteContact("00001");
		
		//validate contact was deleted by create new contact with same contact ID
		Contact contact2 = new Contact("00001", "Laura", "Catsoulis", "6094688989", 
				"999 Ocean ave");
		
		assertDoesNotThrow(() -> {
			service.addContact(contact2);
		});
	}
	
	@Test
	void testUpdateFirstName () {
		ContactService service = new ContactService();
		
		//Create contact
		Contact contact = new Contact("00001", "Mike", "Catsoulis", "6094688756", 
				"678 Ocean ave");
		
		service.addContact(contact);
		
		service.updateFirstName("00001", "Michael");
		
		//Validation that first name has been update
		assertEquals("Michael", contact.getFirstName());
	}
	
	@Test
	void testUpdateLastName () {
		ContactService service = new ContactService();
		
		//Create contact
		Contact contact = new Contact("00001", "Mike", "Catsoulis", "6094688756", 
				"678 Ocean ave");
		
		service.addContact(contact);
		
		service.updateLastName("00001", "Romo");
		
		//Validation that last name has been update
		assertEquals("Romo", contact.getLastName());
	}
	
	@Test
	void testUpdatePhone () {
		ContactService service = new ContactService();
		
		//Create contact
		Contact contact = new Contact("00001", "Mike", "Catsoulis", "6094688756", 
				"678 Ocean ave");
		
		service.addContact(contact);
		
		service.updatePhone("00001", "7321234567");
		
		//Validation that phone number has been update
		assertEquals("7321234567", contact.getPhone());
	}
	
	@Test
	void testUpdateAddress () {
		ContactService service = new ContactService();
		
		//Create contact
		Contact contact = new Contact("00001", "Mike", "Catsoulis", "6094688756", 
				"678 Ocean ave");
		
		service.addContact(contact);
		
		service.updateAddress("00001", "444 Pickel way");
		
		//Validation that address has been update
		assertEquals("444 Pickel way", contact.getAddress());
	}
	
	@Test
	void testDeleteInvalidContact() {
		
		//Create new service
		ContactService service = new ContactService();
		
		//Validation that trying to delete a contact that does not exists throws error 
		assertThrows(IllegalArgumentException.class, () -> {
			service.deleteContact("Invalid");
		});
	}
	
	@Test
	void testUpdateInvalidContact() {
		
		//Create new service 
		ContactService service = new ContactService();
		
		//Validation that trying to update a contact first name that does not exist throws error
		assertThrows(IllegalArgumentException.class, () -> {
			service.updateFirstName("Invalid", "Tony");
		});
	}
	
}
