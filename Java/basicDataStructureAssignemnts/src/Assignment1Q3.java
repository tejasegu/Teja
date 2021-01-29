import java.util.Scanner;

class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
    	return (principalAmount*time*interestRate)/100;
    
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
    	interestRate=(interestRate/100)+1;
    	return (principalAmount*(Math.pow(interestRate,time)))-principalAmount;
    }
}
public class Assignment1Q3 {
	public static void main (String args[]) {
		Scanner ss=new Scanner(System.in);
		double principalAmount, interestRate;
		int time;
		System.out.println("enter the principalAmount");
		principalAmount=ss.nextDouble();
		System.out.println("enter the interestRate");
		interestRate=ss.nextDouble();
		System.out.println("enter the time");
		time=ss.nextInt();
		SiCi tej=new SiCi();
		System.out.println("simple interest is ::"+tej.simpleInterest(principalAmount, time, interestRate));
		System.out.println("compond interest is ::"+tej.compoundInterest(principalAmount, time, interestRate));
		ss.close();
		
	}
}
