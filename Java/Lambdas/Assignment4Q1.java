package teja;

import java.util.Scanner;

public class Assignment4Q1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		Assignment4Q1 ab= new Assignment4Q1();
		System.out.println(ab.addition(a, b));
		System.out.println(ab.division(a, b));
		System.out.println(ab.multiplication(a, b));
		System.out.println(ab.subtraction(a, b));
scan.close();
		

	}
	     public double addition(int num1,int num2) {
		 MathOperation addition=(int a, int b)->{return (a+b);};
		 return addition.operation(num1,num2);
	     }
		 
	
	    public double subtraction(int num1,int num2){
	    	  MathOperation subraction=(int a,int b)->{return a-b;};
	    	return subraction.operation(num1, num2);
	    	}
	    public double multiplication(int num1,int num2){
	    	  MathOperation multiplaction=(int a,int b)->{return a*b;};
			return multiplaction.operation(num1, num2);
			}
	    public double division(int num1,int num2){
	    	  MathOperation division=(int a,int b)->{double result=(double)a/(double)b;return result;};
			return division.operation(num1, num2);
			}
	       

}
@FunctionalInterface
interface MathOperation {
    double operation(int a,int b);
 }	
