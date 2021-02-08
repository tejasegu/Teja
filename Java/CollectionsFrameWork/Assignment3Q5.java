import java.util.HashMap;
import java.util.Map;

class Employee {
    private String name;
    private int id;
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }
	@Override
	public String toString() {
		return "[name=" + name + ", id=" + id + "]";
	}
    
    
}

public class Assignment3Q5 {
    public static void main(String[] args) {
    	 Employee a = new Employee("Teja",1);
         Employee b = new Employee("Uday",2);
         Map<Integer,Employee> map = new HashMap<>();
         
             System.out.println(map.put(1, a));
             map.put(2, b);
             System.out.println(map.get(2));
         }
     }


