import java.util.ArrayList;

class Manager extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return salary+incentive;
    }
}

class Labour extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        return salary+overtime;
    }
}
public class Assignment2Q2 {
	static int salary = 10000;
    public int getSalary(int salary){
    	return salary;
    }
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
    int	sum=0;
    for(int i=0;i<employeeSalaries.size();i++) {
    	sum+=employeeSalaries.get(i);
    }
    return sum;
    	
    }
    public static void main(String[] args) {
    	Manager m=new Manager();
    	int sal=m.getSalary(salary);
    	Labour l=new Labour();
    	int lsal=l.getSalary(salary);
    	System.out.println("the salary of manger is "+sal);
    	System.out.println("the salary of labour is "+lsal);
    	ArrayList<Integer> employeeSalaries =new ArrayList<Integer>();
    	employeeSalaries.add(sal);
    	employeeSalaries.add(lsal);
    	Assignment2Q2 a=new Assignment2Q2();
    	System.out.println("total salaries are"+a.totalEmployeesSalary(employeeSalaries));
    }

}
