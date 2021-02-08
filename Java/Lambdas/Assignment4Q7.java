package teja;

import java.util.HashMap;

public class Assignment4Q7 {
    public static void main(String[] args) {
    	HashMap<String, Integer> map =new HashMap<String, Integer>();
    	map.put("a", 1);
    	map.put("b", 2);
    	map.put("c", 3);
    	Assignment4Q7 ab=new Assignment4Q7();
    	
    	System.out.println(ab.convertKeyValueToString(map));
    }
    public String convertKeyValueToString(HashMap<String, Integer> map) {
    	StringBuilder latest = new StringBuilder();
        map.forEach((a,b) -> latest.append(a).append(b));
        return latest.toString();
    }
}