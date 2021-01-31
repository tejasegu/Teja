class SingletonInheritanceCheck{
	static SingletonInheritanceCheck el=new SingletonInheritanceCheck();
	private SingletonInheritanceCheck() {
}
	public static SingletonInheritanceCheck getobj() {
		return el;
		
	}
}
	
public class Assignment2Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonInheritanceCheck obj=SingletonInheritanceCheck.getobj();
		SingletonInheritanceCheck obj2=SingletonInheritanceCheck.getobj();
		System.out.println(obj);
		System.out.println(obj2);
	}

}
