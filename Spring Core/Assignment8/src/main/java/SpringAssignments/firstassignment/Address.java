package SpringAssignments.firstassignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Address {
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
	public void init()throws Exception{
		System.out.println("In Init method");	
	}
	public void destroy()throws Exception{
		System.out.println("In destroy method");
	}
	@PostConstruct
	public void myinit(){
		System.out.println("In myinit method");
	}
	@PreDestroy
	public void mydestroy()throws Exception{
		System.out.println("In mydestroy method");
	}

}
