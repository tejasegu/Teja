import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assignment3Q3 {
    public static List<Integer> traverseReverse(ArrayList<Integer> a){
    	a.add(1);
    	a.add(2);
    	a.add(3);
    	a.add(4);
    	a.add(5);
    	ListIterator<Integer> a1=a.listIterator(a.size());
    	while(a1.hasPrevious()) {
    		System.out.println(a1.previous());
    	}
    	return a;
    }
    public static void main(String[] args) {
    	Assignment3Q3 a= new Assignment3Q3();
    	ArrayList<Integer> b=new ArrayList<>();
    	List<Integer> d=a.traverseReverse(b);
    	System.out.println("The original list order is "+d);
    	
    }
}

