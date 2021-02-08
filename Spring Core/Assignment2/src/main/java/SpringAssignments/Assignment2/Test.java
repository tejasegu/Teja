package SpringAssignments.Assignment2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	Question a=(Question) context.getBean("question");
	a.disp();
}
}