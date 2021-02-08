package teja;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Trader {
    private String name;
    private String city;
	public Trader(String name, String city) {
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
		return "Trader [name=" + name + ", city=" + city + "]";
	}
    
}

public class Assignment5Q3 {
    public static List<String> printUniqueCities (List <Trader> traders) { 
    	List<String> cities = 
	            traders.stream()
                .map(t->t.getCity())
                .distinct()
                .collect(Collectors.toList());
      return cities;
    }

    public static List<Trader> tradersFromPuneSortByName(List<Trader> traders) {
    	List<Trader> ts = 
	            traders.stream()
	                        .filter(t -> t.getCity().equals("Pune"))
	                        .distinct()
	                        .sorted(Comparator.comparing(Trader::getName))
	                        .collect(Collectors.toList());
		return ts;
    }
    public static String allTrader3Names(List<Trader> traders) {
    	String trader1 =traders.stream()
        .map(t -> t.getName())
        .distinct()
        .sorted()
        .reduce("", (n1, n2) -> n1 + n2);

return trader1;
    }
    public static boolean areAnyTradersFromIndore(List<Trader> traders) {
    	 boolean ab =
		            traders.stream()
		            .anyMatch(t -> t.getCity().equals("Hyd"));
		        return ab;
    }
    public static void main(String[] args) {
    	Trader t1=new Trader("Teja", "Hyd");
    	Trader t2=new Trader("Uday", "Hyd");
    	Trader t3=new Trader("Venkat", "Pune");
    	Trader t4=new Trader("Siva", "Bza");
    	Trader t5=new Trader("Kiran", "Pune");
    	Trader t6=new Trader("Nag", "Bza");
    	Trader t7=new Trader("raj", "Pune");
    	List<Trader> traders= new ArrayList<Trader>();
    	traders.add(t1);
    	traders.add(t2);
    	traders.add(t3);
    	traders.add(t4);
    	traders.add(t5);
    	traders.add(t6);
    	traders.add(t7);
    	Assignment5Q3 ac=new Assignment5Q3();
    	System.out.println(ac.printUniqueCities(traders));
    	System.out.println(ac.tradersFromPuneSortByName(traders));
    	System.out.println(ac.allTrader3Names(traders));
    	System.out.println(ac.areAnyTradersFromIndore(traders));
    	
    	
    }
}
