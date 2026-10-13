package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import project.Contact;

public class ContactTest 
{
	
	
	@Test
	void testContactCreation()
	{
		Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St", "1234567890" );
		assertEquals("1234567890", contact.getId());
		assertEquals("John", contact.getFirstName());
		assertEquals("Doe", contact.getLastName());
		assertEquals("1234567890", contact.getPhone());
		assertEquals("123 Main St", contact.getAddress());
	}
	
	
	@Test
	void testIdTooLong()
	{
		assertThrows(IllegalArgumentException.class, () ->
        new Contact("John", "Doe", "1234567890", "123 Main St", "12345678901"));
	}
	
	@Test
	void testIdNull()
	{
		assertThrows(IllegalArgumentException.class, () ->
        new Contact("John", "Doe", "1234567890", "123 Main St", null));
	}
	
	
	
	@Test
	void testFirstNameTooLong()
	{
		assertThrows(IllegalArgumentException.class, () ->
        new Contact("JohnJohnJohn", "Doe", "1234567890", "123 Main St", "1234567890"));
	}
	
	@Test
	void testFirstNameNull()
	{
		assertThrows(IllegalArgumentException.class, () ->
        new Contact(null, "Doe", "1234567890", "123 Main St", "1234567890"));
	}
	
	
	
	@Test
	void testLastNameTooLong()
	{
	    assertThrows(IllegalArgumentException.class, () ->
        new Contact("John", "DoeDoeDoeDoe", "1234567890", "123 Main St", "1234567890"));
	}
	
	@Test
	void testLastNameNull()
	{
		 assertThrows(IllegalArgumentException.class, () ->
         new Contact("John", null, "1234567890", "123 Main St", "1234567890"));
	}
	
	
	
	@Test
	void testPhoneTooLong()
	{
		 assertThrows(IllegalArgumentException.class, () ->
         new Contact("John", "Doe", "12345678901", "123 Main St", "1234567890"));
	}
	
	@Test
	void testPhoneTooShort()
	{
		assertThrows(IllegalArgumentException.class, () ->
        new Contact("John", "Doe", "123456789", "123 Main St", "1234567890"));
	}
	
	@Test
	void testPhoneNull()
	{
		assertThrows(IllegalArgumentException.class, () ->
        new Contact("John", "Doe", null, "123 Main St", "1234567890"));
	}
	
	
	@Test
	void testAddressTooLong()
	{
		 assertThrows(IllegalArgumentException.class, () ->
         new Contact("John", "Doe", "1234567890", "1234567890123456789012345678901", "1234567890"));
	}
	
	@Test
	void testAddressNull()
	{
		 assertThrows(IllegalArgumentException.class, () ->
         new Contact("John", "Doe", "1234567890", null, "1234567890"));
	}


	// ---- Setter validation ----

	@Test
	void testSetFirstNameInvalidThrows()
	{
		Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St", "1234567890");
		assertThrows(IllegalArgumentException.class, () -> contact.setFirstName(null));
		assertThrows(IllegalArgumentException.class, () -> contact.setFirstName("FirstNameTooLong"));
	}

	@Test
	void testSetLastNameInvalidThrows()
	{
		Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St", "1234567890");
		assertThrows(IllegalArgumentException.class, () -> contact.setLastName(null));
		assertThrows(IllegalArgumentException.class, () -> contact.setLastName("LastNameTooLong"));
	}

	@Test
	void testSetPhoneInvalidThrows()
	{
		Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St", "1234567890");
		assertThrows(IllegalArgumentException.class, () -> contact.setPhone(null));
		assertThrows(IllegalArgumentException.class, () -> contact.setPhone("123456789"));
		assertThrows(IllegalArgumentException.class, () -> contact.setPhone("12345678901"));
	}

	@Test
	void testSetAddressInvalidThrows()
	{
		Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St", "1234567890");
		assertThrows(IllegalArgumentException.class, () -> contact.setAddress(null));
		assertThrows(IllegalArgumentException.class, () -> contact.setAddress("1234567890123456789012345678901"));
	}

}