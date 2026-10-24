import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {
	
	//Validation Test for known good contact
	@Test
	void testContact() {
		Contact contact = new Contact("00001", "Mike", "Catsoulis", "6094568756",
				"678 Ocean ave");
		
		assertEquals("00001", contact.getContactId());
		assertEquals("Mike", contact.getFirstName());
		assertEquals("Catsoulis", contact.getLastName());
		assertEquals("6094568756", contact.getPhone());
		assertEquals("678 Ocean ave", contact.getAddress());
	}
	
	@Test
	void testContactIdInvalid() {
		//Validation that a Contact greater than 10 characters throws error
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00000000001", "Mike", "Catsoulis", "6094568756", 
					"678 Ocean ave");
		});
	
		//Validation that a Contact cannot be null
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Mike", "Catsoulis", "6094568756",
					"678 Ocean ave");
		});
		
	}
	
	@Test
	void testFirstNameInvalid() {
		//Validation that a first name greater than 10 characters throws error
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00001", "Michaellong", "Catsoulis", "6094568756", 
					"678 Ocean ave");
		});
		
		//Validation that a first name cannot be null
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00001", null, "Catsoulis", "6094568756", 
					"678 Ocean ave");
		});

	}

	@Test
	void testLastNameInvalid() {
		//Validation that a last name greater than 10 characters throws error
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00001", "Mike", "Catsoulislong", "6094568756", 
					"678 Ocean ave");
		});

		//Validation that a last name cannot be null
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00001", "Mike", null, "6094568756", 
					"678 Ocean ave");
		});
	
	}
	
	@Test
	void testPhoneInvalid() {
		//Validation that a phone number than is not exactly 10 digits throws error
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00001", "Mike", "Catsoulis", "609468756", 
					"678 Ocean ave");
		});
		
		//Validation that a phone number only contains digits
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00001", "Mike", "Catsoulis", "609468D756", 
					"678 Ocean ave");
		});
		
		//Validation that a phone number is not null
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00001", "Mike", "Catsoulis", null, 
					"678 Ocean ave");
		});
	
	}
	
	@Test
	void testAddressInvalid() {
		//Validation that a address longer than 30 characters throws error
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00001", "Mike", "Catsoulis", "6094568756", 
					"678 Ocean ave longer than thirty characters");
		});
		
		//Validation that a address is not null
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00001", "Mike", "Catsoulis", "6094568756", 
					null);
		});
		
	}
	
	@Test
	void testInvalidUpdate(){
		
		//create new contact
		Contact contact = new Contact("00001", "Mike", "Catsoulis", "6094688756", 
				"678 Ocean ave");
		
		//Validation that first update name longer than 10 character throws error
		assertThrows(IllegalArgumentException.class, () -> {
			contact.setFirstName("MichaelLong");
		});
		
		//Validation that last update name longer than 10 character throws error
		assertThrows(IllegalArgumentException.class, () -> {
			contact.setLastName("CatsoulisLong");
		});
		
		//Validation that phone number update that is not exactly 10 digits throws error
		assertThrows(IllegalArgumentException.class, () -> {
			contact.setPhone("609468756");
		});
		
		//Validation that phone number update has only digits
		assertThrows(IllegalArgumentException.class, () -> {
			contact.setPhone("60946D8756");
		});
		
		//Validation that address update longer than 30 characters throws error
		assertThrows(IllegalArgumentException.class, () -> {
			contact.setAddress("678 Ocean ave longer than thirty characters");
		});
	}
	
}
		


