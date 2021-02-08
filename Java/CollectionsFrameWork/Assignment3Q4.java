import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class DateClass {
    private int date;
    private int month;
    private int year;
    
	public DateClass(int date, int month, int year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + date;
		result = prime * result + month;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DateClass other = (DateClass) obj;
		if (date != other.date)
			return false;
		if (month != other.month)
			return false;
		return true;
	}
	@Override
    public String toString() {
        return  " Date of Birth is "+ date+"/" +month+"/" +year;
    }
	
    
}

public class Assignment3Q4 {

    public  String getEmployee(HashMap<DateClass, String> dob,String employeeName){
    	  for(Map.Entry e: dob.entrySet()){
              if(e.getValue() == employeeName){
            	  System.out.println("the dta of selected employee is :"+e.getKey().toString() + ": "+ e.getValue() );
              }
              
     
    	  }
      return null;
    }
    	
    public static void main(String[] args) {
    	  Assignment3Q4 a = new Assignment3Q4();


          DateClass a1 = new DateClass(26,02,2000);
          DateClass a2 = new DateClass(26,02,1999);
          DateClass a3 = new DateClass(9,9,2001);
          DateClass a4 = new DateClass(10,11,2002);
          HashMap<DateClass, String> map = new HashMap<>();
          map.put(a1, "Teja");
          map.put(a2, "venkat");
          map.put(a3, "siva");
          map.put(a4, "uday");
          System.out.println("The list of employees are");
          Iterator hmIterator = map.entrySet().iterator();
      	while (hmIterator.hasNext()) { 
              Map.Entry mapElement = (Map.Entry)hmIterator.next();  
              System.out.println(mapElement.getKey() + " : " + mapElement.getValue()); 
      	}
      	
          System.out.println(a.getEmployee(map, "siva"));
    	
    }
}