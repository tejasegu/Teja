import java.util.HashMap;
import java.util.Map;

public class Assignment3Q8a {
    public static void failFast(Map<String, String> cityCode){
    	for (String s : cityCode.keySet()) {
            System.out.println(cityCode.get(s));

            //gives the exception
            cityCode.put("Chandu","Principal");
    	}
    	
    }
    public static void main(String[] args) {
    	Map<String, String> a=new HashMap<String, String>();
    	a.put("teja", "stud");
    	a.put("uday", "stud");
    	a.put("rakesh", "lecturere");
    	failFast(a);
    }
}

