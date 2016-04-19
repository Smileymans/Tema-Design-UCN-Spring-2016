package model;;

public class Person {

	private String name;
	private String address;
	private String postalCode;
	private String city;
	private String phone;
	private String email;
	
	public Person(String name, String address, String postalCode, String city, String phone, String email)
	{
		this.setName(name);
		this.setAddress(address);
		this.setPostalCode(postalCode);
		this.setCity(city);
		this.setPhone(phone);
		this.setEmail(email);
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
	
	public String toString(){
		return "name: " + name + ", address: " + ", postalCode: " + postalCode + ", city: " + city + ", phone: " + phone + ", email: " + email;
	}
	
}
