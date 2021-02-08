package teja;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Assignment4Q6 {
    public static void main(String[] args) {
    	List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
    	Assignment4Q6 ab= new Assignment4Q6();
    	ab.convertToUpperCase(list);
        list.forEach(t->System.out.println(t));
    }
    public List<String> convertToUpperCase(List<String> list) {
        list.replaceAll(new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        });
        return list;
    }
}