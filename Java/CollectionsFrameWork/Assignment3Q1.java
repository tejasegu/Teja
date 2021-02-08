import java.util.TreeSet;

class Person implements  Comparable<Person>{
    private String name;
    private int height;
    private double weight;
    
	public Person(String name, int height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public int compareTo(Person p) {
	if(weight > p.weight){
        return 1;
    }else if(weight < p.weight){
        return -1;
    }else{
        if(height > p.height){
            return 1;
        }else if(height< p.height){
            return -1;
        }else {
            return 0;
        }
    }
}
   
}

public class Assignment3Q1 {
    public static void main(String[] args) {
    	TreeSet<Person> a=new TreeSet<>();
    	Person b=new Person("Teja",5,10);
    	Person c=new Person("venkat",6,10);
    	Person d=new Person("Tunik",4,9);
    	Person e=new Person("Ankit",6,8);
    	a.add(b);
    	a.add(c);
    	a.add(d);
    	a.add(e);
    	 for(Person p: a){
             System.out.println("Name:"+p.getName()+" weight: "+ p.getWeight()+" Height :"+ p.getHeight() );
         }
}
}

