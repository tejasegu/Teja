package teja;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Assignment4Q3 {
    static void modifyValue(){ 
    	int a=5;
    	Function<Integer, Integer> modified=t->a+10;
    	System.out.println(modified.apply(a));
    	}
   
   

    static void display() { 
    	Supplier<Integer> n= ()->20;
    	System.out.println(n.get());
    }
    public static void main(String[] args) {
    	Assignment4Q3 ab=new Assignment4Q3();
    	Assignment4Q3.modifyValue();
    	Assignment4Q3.display();
    	Product ac = new Product();
    	Consumer<Product> up=t->t.setA(2);
    	up.accept(ac);
    	Predicate<Integer> check=t->t==2;
    	System.out.println(check.test(ac.getA()));
    	
    	
    	
    	
}}
class Product {
	
	int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}	
	
}