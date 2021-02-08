package teja;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Assignment4Q5 {
    

    public static void main(String[] args) {
    	List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
    	System.out.println(Assignment4Q5.processWords(list));
    }

    public static String processWords(List<String> list) {
    	StringBuilder latest = new StringBuilder();
        Consumer<List<String>> consumer = t -> {
            t.forEach(a -> latest.append(a.charAt(0)));
        };
        consumer.accept(list);
        return latest.toString();
    }
}

