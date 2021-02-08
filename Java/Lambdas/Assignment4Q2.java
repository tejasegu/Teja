package teja;

import java.util.ArrayList;

public class Assignment4Q2 {

    private int totalPrice;
    private String status;

    public Assignment4Q2(int totalPrice, String status) {
		super();
		this.totalPrice = totalPrice;
		this.status = status;
	}
	@Override
	public String toString() {
		return "[totalPrice=" + totalPrice + ", status=" + status + "]";
	}
	public static ArrayList<Assignment4Q2> listOfOrders(ArrayList<Assignment4Q2> orders) {
		ArrayList<Assignment4Q2> acceptedOrders = new ArrayList<>();
        orders.forEach((item -> {
            if(item.totalPrice > 10000 && (item.status.equals("ACCEPTED") || item.status.equals("COMPLETED"))){
                acceptedOrders.add(item);
            }
        }));
		return acceptedOrders;
    }
    public static void main(String[] args) {
    	Assignment4Q2 o1 = new Assignment4Q2(100020,"ACCEPTED");
    	Assignment4Q2 o2 = new Assignment4Q2(500000,"COMPLETED");
    	Assignment4Q2 o3 = new Assignment4Q2(3000,"ACCEPTED");
    	Assignment4Q2 o4 = new Assignment4Q2(120,"ACCEPTED");
    	Assignment4Q2 o5 = new Assignment4Q2(60000,"COMPLETED");
    	Assignment4Q2 o6 = new Assignment4Q2(1230,"REJECTED");
    	Assignment4Q2 o7 = new Assignment4Q2(10001,"ACCEPTED");
    	Assignment4Q2 o8 = new Assignment4Q2(112000,"PROCESSING");
    	Assignment4Q2 o9 = new Assignment4Q2(200000,"ACCEPTED");
    	Assignment4Q2 o10 = new Assignment4Q2(3153,"ACCEPTED");
    	ArrayList<Assignment4Q2> ords = new ArrayList<Assignment4Q2>();
    	ords.add(o1);
    	ords.add(o2);
    	ords.add(o3);
    	ords.add(o4);
    	ords.add(o5);
    	ords.add(o6);
    	ords.add(o7);
    	ords.add(o8);
    	ords.add(o9);
    	ords.add(o10);
    	ArrayList<Assignment4Q2> orders = listOfOrders(ords);
    	orders.forEach((p)->System.out.println(p));
    }
}


