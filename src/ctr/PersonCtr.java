package ctr;

import model.*;


public class PersonCtr {	

	public void CreatePerson(Person p)
	{
		PersonContainer.getInstance().addPerson(p);
		
	}

	public void UpdatePerson(String name, String address, String postalCode, String city, String phone, String email)
	{
		
	}
}
