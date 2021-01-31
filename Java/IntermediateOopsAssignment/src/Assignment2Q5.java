class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
    	return "this is rectangle";
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() {
    	return "this is line5";
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
    	return "this is cube";
    }
}
abstract class Shape5 {
    abstract public String draw();
}
public class Assignment2Q5 {
	 public static void main(String[] args) {
		 Rectangle5 a=new  Rectangle5();
		 Line5 b=new Line5();
		 Cube5 c=new Cube5();
		 System.out.println(a.draw());
		 System.out.println(b.draw());
		 System.out.println(c.draw());
		 
	 }

}
