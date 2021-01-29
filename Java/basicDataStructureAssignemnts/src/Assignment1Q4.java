import java.util.Scanner;

class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
    	String c="";
    	if (subject1Marks>60 || subject2Marks>60 || subject3Marks>60  ) {
    		 c+=  "failed\n";
    	}
    	else if (subject1Marks+subject2Marks+subject3Marks<60) {
    		c+=  "failed\n";
    	}
    	else if(subject1Marks+subject2Marks+subject3Marks>60) {
    		 c+= "passed\n";
    		if(subject1Marks+subject2Marks>60 || subject2Marks+subject3Marks>60 || subject1Marks+subject3Marks>60) {
       		 c+= "promoted\n";
       		
        	 }
       	}
    	 
   
    	return c;
    }
}
public class Assignment1Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double subject1Marks,subject2Marks,subject3Marks;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the threesubject marks\n");
		subject1Marks=s.nextDouble();
		subject2Marks=s.nextDouble();
		subject3Marks=s.nextDouble();
		s.close();
		ResultDeclaration tej=new ResultDeclaration();
		System.out.println(tej.declareResults(subject1Marks, subject2Marks, subject3Marks));

	}

}
