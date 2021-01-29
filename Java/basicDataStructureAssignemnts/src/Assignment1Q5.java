import java.util.Scanner;

class TaxAmount{
    public double calculateTaxAmount(int ctc){
    	double taxamount=0;
    	if (ctc>0 && ctc<=180000)
    	{
    		taxamount=0;
    	}
    	else if (ctc>181000 && ctc<=300000)
    	{
    		taxamount=0.1;
    	}
    	else if (ctc> 300000 && ctc<=500000)
    	{
    		taxamount=0.2;
    	}
    	else if (ctc>500000 && ctc<=1000000)
    	{
    		taxamount=0.3;
    	}
    	double totaltax=taxamount*ctc;
    	return totaltax;
    }
}
public class Assignment1Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the ctc inbetween 0 and 10,00,000");
		int ctc=s.nextInt();
		
		TaxAmount tej= new TaxAmount();
		System.out.println("the total tax amount is :"+tej.calculateTaxAmount(ctc));
		s.close();

	}

}
