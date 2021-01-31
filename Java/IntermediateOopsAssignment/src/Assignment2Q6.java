abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
    	return "im in filepersistance";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
    	return "im in databasepersistance";
    }
}

public class Assignment2Q6 {
    public static void main(String[] args) {
    	Persistence ab=new FilePersistence();
    	String c=ab.persist();
    	System.out.println(c);
    }
}