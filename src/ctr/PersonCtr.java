package ctr;
import java.util.*;
import model.*;


public class PersonCtr {	

	public void createPerson(Person p)
	{
		PersonContainer.getInstance().addPerson(p);
		
	}

	public void updatePerson(String name, String address, String postalCode, String city, String phone, String email)
	{
		Person p = PersonContainer.getInstance().findPersonByPhone(phone);
		
		if(p != null){
	    p.setName(name);
		p.setAddress(address);
		p.setPostalCode(postalCode);
		p.setCity(city);
		p.setPhone(phone);
		p.setEmail(email);

		}
	}
}
