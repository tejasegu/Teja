import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

class SavingAccount implements Comparable<SavingAccount> {

    private double acc_balance;
    private int acc_ID;
    private String accountHolderName;
    private boolean isSalaryAccount;
	public SavingAccount(double acc_balance, int acc_ID, String accountHolderName, boolean isSalaryAccount) {
		super();
		this.acc_balance = acc_balance;
		this.acc_ID = acc_ID;
		this.accountHolderName = accountHolderName;
		this.isSalaryAccount = isSalaryAccount;
	}
	public double getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}
	public int getAcc_ID() {
		return acc_ID;
	}
	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	public void withdraw(int amount) {
    	if(this.acc_balance>=amount) {
    		this.acc_balance -= amount;
    	}
    }
    public void deposit(int amount) {
    	this.acc_balance += amount;
    }

	@Override
	public int compareTo(SavingAccount p) {
		if(acc_ID > p.acc_ID){
	        return 1;
	    }else {
	        return -1;
	    }
	    }
	}


class BankAccountList{

    private TreeSet<SavingAccount> savingAccounts = new TreeSet<SavingAccount>();

	 public boolean addSavingAccount(SavingAccount savingAccount){		 
	    	savingAccounts.add(savingAccount);
			return true;}
	 public List<Integer> displaySavingAccountIds() {
	    	List<Integer> ids = new ArrayList<>();
	    	for(SavingAccount s : savingAccounts) {
	    		ids.add(s.getAcc_ID());
	    		System.out.println(s.getAcc_ID());
	    	}
			return null;}
}

public class Assignment3Q9 {
    public static void main(String[] args) {
    	SavingAccount a1 = new SavingAccount(10000,1,"Teja",true);
    	SavingAccount a2 = new SavingAccount(10,3,"uday",true);
    	SavingAccount a3 = new SavingAccount(200000,4,"Segu",true);
    	SavingAccount a4 = new SavingAccount(13000,6,"siva",true);
    	SavingAccount a5 = new SavingAccount(150000,7,"venkat",true);
    	SavingAccount a6 = new SavingAccount(3000,2,"nagesh",true);
    	SavingAccount a7 = new SavingAccount(3000,15,"rag",true);
    	SavingAccount a8 = new SavingAccount(7000,14,"naga",true);
    	BankAccountList l = new BankAccountList();
    	l.addSavingAccount(a1);
    	l.addSavingAccount(a2);
    	l.addSavingAccount(a3);
    	l.addSavingAccount(a4);
    	l.addSavingAccount(a5);
    	l.addSavingAccount(a6);
    	l.addSavingAccount(a7);
    	l.addSavingAccount(a8);
    	 l.displaySavingAccountIds();
    	
    }
}

