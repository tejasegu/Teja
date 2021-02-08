package SpringAssignments.firstassignment;

public class Customer {
int customerid;
String customername;
long custnum;
Address add;
public int getCustomerid() {
	return customerid;
}
public void setCustomerid(int customerid) {
	this.customerid = customerid;
}
public String getCustomername() {
	return customername;
}
public void setCustomername(String customername) {
	this.customername = customername;
}
public long getCustnum() {
	return custnum;
}
public void setCustnum(long custnum) {
	this.custnum = custnum;
}
public Address getAdd() {
	return add;
}
public void setAdd(Address add) {
	this.add = add;
}
public void customerInfo() {
	System.out.println("customer Id: "+customerid+"\nCustomerName: "+customername+"\nCustomerContact: "+custnum
			+"\ncustomerAddress: "+add);
}
}
