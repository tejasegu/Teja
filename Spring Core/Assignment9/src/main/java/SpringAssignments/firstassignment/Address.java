package SpringAssignments.firstassignment;




import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class Address implements InitializingBean, 
DisposableBean {
	String street;
	String city;
	String state;
	int zip;
	String country;
	
	
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
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
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
	@Override
	public void destroy() throws Exception {
		System.out.println("ended the cycle ");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Statred the cyle");
		
	}


}
