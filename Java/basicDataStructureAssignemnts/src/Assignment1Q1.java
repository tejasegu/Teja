import java.util.Scanner;

class ArmstrongOrNot {
    public boolean armstrongCheck(int num)
	{
    	int c=0,b,d=num;
    	while(num>0)
		{
			b=num%10;
			num=num/10;
			c=c+(b*b*b);
		}
		if (c==d)
		{
		   return true;
		}
		else
		{
			return false;
		}
}
}
public class Assignment1Q1 {

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number to check it is armstrong or not: \n");
		int n = scan.nextInt();
		ArmstrongOrNot tej = new ArmstrongOrNot();
		boolean result = tej.armstrongCheck(n);
		if(result==true)
		{
			System.out.println("the number is armstrong");
		}
		else if (result==false)
		{
			System.out.println("the number is not armstrong");
		}
		scan.close();
	}
}