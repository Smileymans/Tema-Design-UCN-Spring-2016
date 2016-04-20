package ctr;
import model.*;
import java.util.*;
import ui.*;

public class PersonCtr {
	/** 
	@param name is the name of the new person created.
	@param address is the address of the new person created.
	@param postalcode is the postalcode of the city where the new person live.
	@param city is the city where the person is living in.
	@param phone is the phonenumber of the person who is created.
	@param email is the emailaddress of the person who is created.
	*/

	public Person createPerson(String name, String address, String postalCode, String city, String phone, String email)
	{
		Person p = new Person(name, address, postalCode, city, phone, email);
		PersonContainer.getInstance().addPerson(p);
		return p;	
	}

	public void updatePerson(String currentNumber, String name, String address, String postalCode, String city, String phone, String email)
	{
		Person p = PersonContainer.getInstance().findPersonByPhone(currentNumber);
		
		if(p != null){
			
		String currentName = p.getName();
		if(!currentName.equals(name)){
	    p.setName(name);
		}
		String currentAddress = p.getAddress();
		if(!currentAddress.equals(address)){
		p.setAddress(address);
		}
		String currentPostalCode = p.getPostalCode();
		if(!currentPostalCode.equals(postalCode)){
		p.setPostalCode(postalCode);
		}
		String currentCity = p.getCity();
		if(!currentCity.equals(city)){
		p.setCity(city);
		}
		String currentPhone = p.getPhone();
		if(!currentPhone.equals(phone)){
		p.setPhone(phone);
		}
		String currentEmail = p.getEmail();
		if(!currentEmail.equals(email))
		p.setEmail(email);
		}
		
	}
	public List<Person> getAll(){
		return PersonContainer.getInstance().getAll();
	}
	public Person findPerson(String phone){
		Person p = PersonContainer.getInstance().findPersonByPhone(phone);
		return p;
	}
	public void deletePerson(String phone){
		PersonContainer.getInstance().removePerson(PersonContainer.getInstance().findPersonByPhone(phone));
		
	}
}
