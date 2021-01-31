import java.util.ArrayList;

class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
    	return totalDeposits-creditLimit;
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
    	return totalDeposits+fixedDepositAmount ;
    }
}
public class Assignment2Q3 {
	public int totalCashInBank(ArrayList<Integer> cash){
	 int totalcash=0;
	 for(int i=0;i<cash.size();i++) {
		 totalcash+=cash.get(i);
	 }
	 return totalcash;
	}
    public int getCash(){
		return 0;
    }
    public static void main(String[] args) {
    	CurrentAccount c=new CurrentAccount();
    	int cbal=c.getCash();
    	System.out.println("the available cash in credit account is "+cbal);
    	SavingsAccount s=new SavingsAccount();
    	int sbal=s.getCash();
    	System.out.println("the available cash in savings account is "+sbal);
    	ArrayList<Integer> b=new ArrayList<Integer>();
    	b.add(cbal);
    	b.add(sbal);
    	Assignment2Q3 t= new Assignment2Q3();
      	System.out.println("the total available cash in bank is "+t.totalCashInBank(b));
    }

}
