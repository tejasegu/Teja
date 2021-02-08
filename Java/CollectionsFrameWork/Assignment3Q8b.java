import java.util.concurrent.CopyOnWriteArrayList;

public class Assignment3Q8b {
    public static CopyOnWriteArrayList<Integer> failFast(CopyOnWriteArrayList<Integer> list){
    	for(Integer a:list)
    	{
    		System.out.println(a);
    		if(a==20) {
    		list.add(30);
    		}
    	}
		return list;
		
    }
    public static void main(String args[]) {
    	CopyOnWriteArrayList<Integer> a= new CopyOnWriteArrayList<Integer>();
    	a.add(10);
    	a.add(20);
    	a.add(50);
    	a.add(40);
    	failFast(a);
    	System.out.println("after iteration"+a);
    }
}


