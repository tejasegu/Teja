package teja;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Traders {
    private String name;
    private String city;
	public Traders(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Traders [name=" + name + ", city=" + city + "]";
	}
    
}

class Transaction {
    private Traders trader;
    private int year;
    private int value;
	public Transaction(Traders trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public Traders getTrader() {
		return trader;
	}
	public void setTrader(Traders trader) {
		this.trader = trader;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Transaction [" + trader + ", year=" + year + ", value=" + value + "]";
	}
    
}
public class Assignment5Q4 {
    public static List<Transaction> sortTransactions(List <Transaction> transactions) {
    	return transactions.stream().filter(i->i.getYear()==2011).sorted((t1,t2)->t1.getValue()-t2.getValue()).collect(Collectors.toList());
    }

    public static List<Integer> transactionsValuesDelhi(List<Transaction> transactions) {
    	List<Transaction> a=new ArrayList<>();
    	List<Integer>aDelhi=new ArrayList<>();
    	a=transactions.stream().filter(i->i.getTrader().getCity().contentEquals("Delhi")).collect(Collectors.toList());
    	a.stream().forEach(i->aDelhi.add(i.getValue()));
    	return aDelhi;    }
    public static int highestTransaction(List<Transaction> transactions){
    	
    	 return transactions.stream().max(Comparator.comparing(Transaction::getValue)).get().getValue();
    }

    public static int smallestTransaction(List<Transaction> transactions){
    	 
		           return transactions.stream().min(Comparator.comparing(Transaction::getValue)).get().getValue();
			
    }

    public static void main(String[] args) {
    	Traders t1=new Traders("Teja", "Delhi");
    	Traders t2=new Traders("Uday", "Delhi");
    	Traders t3=new Traders("Venkat", "Pune");
    	Traders t4=new Traders("Siva", "Bza");
    	Traders t5=new Traders("Kiran", "Pune");
    	Transaction tt1=new Transaction(t1,2011,50000);
    	Transaction tt2=new Transaction(t1,2015,11000);
    	Transaction tt3=new Transaction(t3,2011,60000);
    	Transaction tt4=new Transaction(t2,2011,100000);
    	Transaction tt5=new Transaction(t4,2010,50000);
    	Transaction tt6=new Transaction(t5,2013,580000);
    	Transaction tt7=new Transaction(t4,2012,58000);
    	List<Transaction> ab=new ArrayList<Transaction>();
    	ab.add(tt1);
    	ab.add(tt2);
    	ab.add(tt3);
    	ab.add(tt4);
    	ab.add(tt7);
    	ab.add(tt5);
    	ab.add(tt6);
    	Assignment5Q4 ac=new Assignment5Q4();
    
    	System.out.println(ac.sortTransactions(ab));
    	System.out.println(ac.transactionsValuesDelhi(ab));
    	System.out.println(ac.highestTransaction(ab));
    	System.out.println(ac.smallestTransaction(ab));
    	
    }
}