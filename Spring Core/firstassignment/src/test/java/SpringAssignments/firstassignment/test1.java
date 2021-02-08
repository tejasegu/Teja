package SpringAssignments.firstassignment;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class test1 {
	@Autowired
	Customer cus=new Customer();
	@Autowired
	Address add=new Address();
	

	@Test
	void test() {
		cus.setCustomerid(1);
		assertEquals(1,cus.customerid,"Customer Id is Displayed");
	}
	@Test
	void test1() {
		cus.setCustomername("Teja");
		assertEquals("Teja", cus.customername);
	}
	@Test
	void test2() {
		cus.setCustnum(222);
		assertEquals(222, cus.custnum);
	}
	@Test
	void test3() {
		add.setCity("a");
		add.setCountry("b");
		add.setStreet("abc");
		add.setState("ac");
		add.setZip(534260);
		cus.setAdd(add);
		assertEquals("[street=abc, city=a, state=ac, country=b, zipcode=534260]", cus.getAdd());
	}
	

}
