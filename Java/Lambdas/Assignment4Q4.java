package teja;

import java.util.ArrayList;

public class Assignment4Q4 {
    public ArrayList<String> removeOddLength(ArrayList<String> employeeList){
    	employeeList.removeIf(t->t.length()%2!=0);
		return employeeList;
    }
    public static void main(String[] args) {
    	ArrayList<String> a=new ArrayList<String>();
    	a.add("Teja");
    	a.add("Uday");
    	a.add("try");
    	Assignment4Q4 ab= new Assignment4Q4();
    	ab.removeOddLength(a);
    	a.forEach((t)->System.out.println(t));
    	
    }
}
