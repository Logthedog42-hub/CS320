package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import project.Contact;
import project.ContactService;

public class ContactServiceTest 
{
	 private ContactService service;
	 
	    @BeforeEach
	    void setUp()
	    {
	        service = new ContactService();
	    }
	 
	  
	 
	    @Test
	    void testAddContact()
	    {
	        Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St", "1234567890");
	        service.addContact(contact);
	        service.updateFirstName("1234567890", "Jane");
	        assertEquals("Jane", contact.getFirstName());
	    }
	 
	    @Test
	    void testAddDuplicateContactThrows()
	    {
	        Contact contact1 = new Contact("John", "Doe", "1234567890", "123 Main St", "1234567890");
	        Contact contact2 = new Contact("Jane", "Smith", "0987654321", "456 Oak St", "1234567890");
	        service.addContact(contact1);
	        assertThrows(IllegalArgumentException.class, () -> service.addContact(contact2));
	    }
	 
	 
	    @Test
	    void testDeleteContact()
	    {
	        Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St", "1234567890");
	        service.addContact(contact);
	        service.deleteContact("1234567890");
	        assertThrows(IllegalArgumentException.class, () -> service.deleteContact("1234567890"));
	    }
	 
	    @Test
	    void testDeleteNonexistentContactThrows()
	    {
	        assertThrows(IllegalArgumentException.class, () -> service.deleteContact("9999999999"));
	    }
	 
	 
	    @Test
	    void testUpdateFirstName()
	    {
	        Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St", "1234567890");
	        service.addContact(contact);
	        service.updateFirstName("1234567890", "Jane");
	        assertEquals("Jane", contact.getFirstName());
	    }
	 
	    @Test
	    void testUpdateLastName()
	    {
	        Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St", "1234567890");
	        service.addContact(contact);
	        service.updateLastName("1234567890", "Smith");
	        assertEquals("Smith", contact.getLastName());
	    }
	 
	    @Test
	    void testUpdatePhone()
	    {
	        Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St", "1234567890");
	        service.addContact(contact);
	        service.updatePhone("1234567890", "0987654321");
	        assertEquals("0987654321", contact.getPhone());
	    }
	 
	    @Test
	    void testUpdateAddress()
	    {
	        Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St", "1234567890");
	        service.addContact(contact);
	        service.updateAddress("1234567890", "456 Oak St");
	        assertEquals("456 Oak St", contact.getAddress());
	    }
	 
	    @Test
	    void testUpdateNonexistentContactThrows()
	    {
	        assertThrows(IllegalArgumentException.class,
	            () -> service.updateFirstName("9999999999", "Jane"));
	    }
}
