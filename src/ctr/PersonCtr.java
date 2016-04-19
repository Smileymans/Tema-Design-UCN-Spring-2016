package ctr;
import java.util.*;
import model.*;


public class PersonCtr {	
	
	public Person createPerson(String name, String address, String postalCode, String city, String phone, String email)
	{
		Person p = new Person(name, address, postalCode, city, phone, email);
		PersonContainer.getInstance().addPerson(p);
		return p;	
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
	public List<Person> getAll(){
		return PersonContainer.getInstance().getAll();
	}
}
