package SpringAssignments.firstassignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Customer c1=(Customer) context.getBean("customer");
		c1.customerInfo();
		context.close();
    }
}
