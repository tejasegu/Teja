import java.util.Scanner;

class Login{
    String userId = "Ajay",password = "password";
    public String loginUser(String user, String pass) {
    	if(user.equals(userId) && pass.equals(password)) {
    		return "1";
    	}
    	else {
    		return "2";
    		}   	
    }

}
public class Assignment1Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=3;
		while(a>0) {
		System.out.println("enter userId");
		String user=s.nextLine();
		System.out.println("enter password");
		String pass=s.nextLine();
		Login tej=new Login();
		String result= tej.loginUser(user, pass);
		if(result=="1") {
			System.out.println("welcome "+user);
			break;
		}
		else {
			System.out.println("entered wrong credentials try again");
			a--;
		}
		if(a==0) {
        System.out.println("contact admin");
	}}
		s.close();
}}
