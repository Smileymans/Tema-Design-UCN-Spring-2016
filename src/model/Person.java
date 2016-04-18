package model;
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
		this.setName(name);
		this.setAddress(address);
		this.setPostalCode(postalCode);
		this.setCity(city);
		this.setPhone(phone);
		this.setEmail(email);
		this.setCreatedDate(createdDate);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	
}
