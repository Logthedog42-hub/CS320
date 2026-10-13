//***********************
//The contact service shall be able to add contacts with a unique ID.
//The contact service shall be able to delete contacts per contact ID.
//The contact service shall be able to update contact fields per contact ID. The following fields are updatable:
//firstName
//lastName
//Number
//Address
//***********************

package project;

import java.util.HashMap;
import java.util.Map;

public class ContactService 
{
	private final Map<String, Contact> contacts = new HashMap<>();
	 
    public void addContact(Contact contact)
    {
        if (contact == null)
        {
            throw new IllegalArgumentException("Contact cannot be null");
        }
        if (contacts.containsKey(contact.getId()))
        {
            throw new IllegalArgumentException("Contact ID already exists");
        }
        contacts.put(contact.getId(), contact);
    }
 
    public void deleteContact(String id)
    {
        if (!contacts.containsKey(id))
        {
            throw new IllegalArgumentException("Contact ID not found");
        }
        contacts.remove(id);
    }
 
    public void updateFirstName(String id, String firstName)
    {
        Contact contact = getContactById(id);
        contact.setFirstName(firstName);
    }
 
    public void updateLastName(String id, String lastName)
    {
        Contact contact = getContactById(id);
        contact.setLastName(lastName);
    }
 
    public void updatePhone(String id, String phone)
    {
        Contact contact = getContactById(id);
        contact.setPhone(phone);
    }
 
    public void updateAddress(String id, String address)
    {
        Contact contact = getContactById(id);
        contact.setAddress(address);
    }
 
    private Contact getContactById(String id)
    {
        Contact contact = contacts.get(id);
        if (contact == null)
        {
            throw new IllegalArgumentException("Contact ID not found");
        }
        return contact;
    }
}
