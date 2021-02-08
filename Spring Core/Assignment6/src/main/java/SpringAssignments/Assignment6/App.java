package SpringAssignments.Assignment6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	context.scan("SpringAssignments.Assignment6");
	context.refresh();
	Dbdetails dbdet = context.getBean(Dbdetails.class);

	dbdet.printDBConfigs();
	context.close();
    }
}
