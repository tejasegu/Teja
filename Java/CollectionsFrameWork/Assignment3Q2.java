import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;



public class Assignment3Q2 {
    public static void main(String[] args) {
    	Assignment3Q2 b= new Assignment3Q2();
    	Assignment3Q2 b1= new Assignment3Q2();
    	LinkedHashSet<String> a= new LinkedHashSet();   
    	HashSet<String> a1= new HashSet(); 
    	LinkedHashSet<String>d=b.ordered(a);
    	System.out.println("The acutal set is [A,B,D,C,F,E] and the Linkedhashset is :"+d);
    	HashSet<String>e=b1.unordered(a1);
    	System.out.println("The acutal set is [A,B,D,C,F,E] and the hashset is :"+e);
    }
    public static LinkedHashSet<String> ordered(LinkedHashSet<String> a){
    	a.add("A");
    	a.add("B");
    	a.add("D");
    	a.add("C");
    	a.add("F");
    	a.add("E");
    	
		return a;
    	
    }
    public static HashSet<String> unordered(HashSet<String>a1){
    	a1.add("A");
    	a1.add("B");
    	a1.add("D");
    	a1.add("C");
    	a1.add("F");
    	a1.add("E");
        	
    		return a1;
    }
}


