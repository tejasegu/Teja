package SpringAssignments.firstassignment;

public class Address {
	String street;
	String city;
	String state;
	String zip;
	String country;
	public Address() {
	}

	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String toString() {
		return "[street=" + street + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", zipcode=" + zip + "]";
	}
	

}
