//********************
//REQUIREMENTS
//The contact object shall have a required unique contact ID string that cannot be longer than 10 characters. The contact ID shall not be null and shall not be updatable.
//The contact object shall have a required firstName String field that cannot be longer than 10 characters. The firstName field shall not be null.
//The contact object shall have a required lastName String field that cannot be longer than 10 characters. The lastName field shall not be null.
//The contact object shall have a required phone String field that must be exactly 10 digits. The phone field shall not be null.
//The contact object shall have a required address field that must be no longer than 30 characters. The address field shall not be null.
//********************

package project;

public class Contact {
	private String id;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public Contact(String firstName, String lastName, String phone, String address, String id)
	{
		if( id == null || id.length() > 10)
		{
			throw new IllegalArgumentException("Invalid id");
		}
		
		if( firstName == null || firstName.length() > 10)
		{
			throw new IllegalArgumentException("Invalid first name");
		}
		
		if( lastName == null || lastName.length() > 10)
		{
			throw new IllegalArgumentException("Invalid last name");
		}
		
		if (phone == null || phone.length() != 10)
		{
			throw new IllegalArgumentException("Invalid phone number");
		}
		
		if (address == null || address.length() > 30)
		{
			throw new IllegalArgumentException("Invalid address");
		}
		
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public String getId()
	{
		return id;
	}
	
	
	
	 
    public void setFirstName(String firstName)
    {
        if (firstName == null || firstName.length() > 10)
        {
            throw new IllegalArgumentException("Invalid first name");
        }
        this.firstName = firstName;
    }
 
    public void setLastName(String lastName)
    {
        if (lastName == null || lastName.length() > 10)
        {
            throw new IllegalArgumentException("Invalid last name");
        }
        this.lastName = lastName;
    }
 
    public void setPhone(String phone)
    {
        if (phone == null || phone.length() != 10)
        {
            throw new IllegalArgumentException("Invalid phone number");
        }
        this.phone = phone;
    }
 
    public void setAddress(String address)
    {
        if (address == null || address.length() > 30)
        {
            throw new IllegalArgumentException("Invalid address");
        }
        this.address = address;
    }

}
