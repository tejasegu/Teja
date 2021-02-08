package teja;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Assignment4Q8 {
	 static List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
	public static void main(String[] args) {
		
		 Consumer<List<Integer>> consumer = t -> {
	            t.forEach(a->System.out.println(a));
	        };
	        Thread t = new Thread(new Runnable() {
	        	 @Override
		            public void run() {
		                consumer.accept(list);
	            }
	        });
	        t.start();
		 
}
}
