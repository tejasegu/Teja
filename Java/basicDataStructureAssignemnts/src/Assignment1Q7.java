import java.util.Scanner;

class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue){
    	for (int element : arr) {
    		if(element==toCheckValue) {
    			return true;
    		}
    	}
		return false;
    }
}
public class Assignment1Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter a number to check ");
		 int toCheckValue =s.nextInt();
		 SearchArray tej=new SearchArray();
		 if(tej.searchArray(arr, toCheckValue)==true)
		 {
			 System.out.println("the given number "+toCheckValue+" is present in the array");
		 }
		 else
		 {
			 System.out.println("the given number "+toCheckValue+" is not present in the array");
		 }
		 s.close();

	}

}
