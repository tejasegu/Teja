abstract  class an{
	int a=1;
	//You can declare a class abstract without having any abstract method.
}
abstract class ab{
	abstract public int start();
	// If any class has any of its method abstract then you must declare entire class abstract.
	//Abstract class cannot be private.
    //Abstract class cannot be final.
}
abstract class ac extends ab{
	public int end() {
		return 0;
	}
	//When we extend an abstract class, we must either override all the abstract methods in sub class or declare subclass as abstract.
}

class ad extends ab{
	public int last() {
		return 10;
	}

	@Override
	public int start() {
		// TODO Auto-generated method stub
		return 5;
	}
	//When we extend an abstract class, we must either override all the abstract methods in sub class or declare subclass as abstract.

	
}
public class Assignment2Q4 {
	public static void main(String[] args) {
		//ac first =new ac();
		System.out.println("cannoy instantiate");
		//Abstract class cannot be instantiated.
		ad second= new ad();
		System.out.println(second.start());
		System.out.println(second.last());
	}

}
