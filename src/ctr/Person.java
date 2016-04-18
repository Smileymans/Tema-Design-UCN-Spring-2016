package ctr;
import java.sql.Date;

public class Person {

	private String name;
	private String address;
	private String postalCode;
	private String city;
	private String phone;
	private String email;
	private Date createdDate;
	
	public Person(String name, String address, String postalCode, String city, String phone, String email, Date createdDate)
	{
		this.name = name;
		this.address = address;
		this.postalCode = postalCode;
		this.city = city;
		this.phone = phone;
		this.email = email;
		this.createdDate = createdDate;
	}
	
	public void CreatePerson(String name, String address, String postalCode, String city, String phone, String email)
	{
		
	}
}
