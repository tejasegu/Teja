
import java.util.Scanner;

abstract class DesertItem {

    abstract public int getCost(int item);
}
class Candy extends DesertItem {
    public static int addCandies(int candies){
    	return candies;
    }
	@Override
	public  int getCost(int candies) {
    	int dollar=60;
    	return dollar*candies;
	}
}
class Cookie extends DesertItem {
    public static int addCookies(int cookies){
    	return cookies;
    }

	@Override
	public int getCost(int cookies) {
    	int euro=70;
    	return euro*cookies;
	}
}
class IceCream extends DesertItem {
    public static int addIceCreams(int icecreams){
    	return icecreams;
    }

	@Override
	public int getCost(int icecreams) {
    	int cost=65;
    	return cost*icecreams;
	}
}
public class Assignment2Q7 {
	static int candies=0;
	static int cookies=0;
	static int icecreams=0;
	static int total=0;
	Scanner scan=new Scanner(System.in);
	Candy candy=new Candy();
	Cookie cookie=new Cookie();
	IceCream icecream=new IceCream();
    public static void main(String[] args) {
    	System.out.println("welcome to the shop");
    	Assignment2Q7 a=new Assignment2Q7();
    	a.selectRoles();
    	
    }
    private void selectRoles(){
    	System.out.println("Please select your role \n 1.Owner\n 2.Customer");
    	Scanner scan=new Scanner(System.in);
    	int a=scan.nextInt();
    	if(a==1)
    	{
    		String role="Owner";
    		roles(role);
    	}
    	else if(a==2)
    	{
    		String role="Customer";
    		roles(role);
    	}
    	else {
    		System.out.println("please enter a valid user");
    		selectRoles();
    	}
    	
    }
    private void roles(String role){
    	if(role.equals("Owner")) {
    		addItems();
    	}
    	else {
    		placeOrder();
    	}
    }
    private void addItems() {
    	System.out.println("the avialble stock is\n1.Candies "+candies+"\n2.Cookies"+cookies+"\n3.IceCreams"+icecreams);
    	System.out.println("Enter the item number to add and 4 to previpous menu and 5 to exit");
    	int d=scan.nextInt();
    		addItemsOperation(d);
    }
    private void addItemsOperation(int choice) {
    	switch(choice) {
    	case 1:
    		System.out.println("Enter the  number of item to add");
    		int Candies=scan.nextInt();
    		candies=Candies;
    		Candy.addCandies(candies);
    		System.out.println("added Candies");
    		addItems();
    		break;
    	case 2 :
    		System.out.println("Enter the  number of item to add");
    		int Cookies=scan.nextInt();
    		cookies=Cookies;
    		Cookie.addCookies(cookies);
    		System.out.println("added Cookies");
    		addItems();
    		break;
    	case 3:
    		System.out.println("Enter the  number of item to add");
    		int Icecream=scan.nextInt();
    		icecreams=Icecream;
    		IceCream.addIceCreams(icecreams);
    		System.out.println("added icecreams");
    		addItems();
    		break;
    	case 4:
    		 selectRoles();
    		 
    	case 5:
    		System.exit(0);
    	default:
    		System.out.println("please enter the correct option");
    		addItems();
    	}
    		
    }
    private void placeOrder() {
    	if(candies!=0 || cookies!=0 || icecreams!=0 || candies+cookies+icecreams!=0) {
    		System.out.println("The cost of the avilable items and quantity are are\n1.Candies-Rupees60 Quantity-"+candies+"\n2.Cookies-Rupees70 Quantity-"+cookies+" \n3.IceCreams-Rupees65 Quantity-"+icecreams);
    		System.out.println("please enter the item number to add the item and 4 to get the bill amount");
    		int e=scan.nextInt();
    		placeOrderOperation(e);
    	}
    	else
    	{
    		System.out.println("please ask the owner to add the items to list");
    	}
    }
    private void placeOrderOperation(int choice) {
    	switch(choice) {
    	case 1:
    		System.out.println("enter the number of items");
    		int cand=scan.nextInt();
    		if(cand<candies) {
    			candies=candies-cand;
    		total+=candy.getCost(cand);
    		placeOrder();		
    		}
    		else {
    			System.out.println("please enter the valid amount");
    			placeOrder();	
    		}
    	
    	case 2:
    		System.out.println("enter the number of items");
    		int cook=scan.nextInt();
    		if(cook<cookies) {
    			cookies=cookies-cook;
    		 total+=cookie.getCost(cook);
    		placeOrder();		
    		}
    		else {
    			System.out.println("please enter the valid amount");
    			placeOrder();	
    		}
    	case 3:
    		System.out.println("enter the number of items");
    		int ice=scan.nextInt();
    		if(ice<icecreams) {
    			icecreams=icecreams-ice;
    	    total+=icecream.getCost(ice);
    		placeOrder();		
    		}
    		else {
    			System.out.println("please enter the valid amount");
    			placeOrder();	
    		}
    	case 4:
    	    System.out.println("Total bill amount including taxes is= Rupees"+total);
    	    System.out.println("thank you for shopping");
    		System.exit(0);   
    	}	
    	scan.close();
    	
    }
}

