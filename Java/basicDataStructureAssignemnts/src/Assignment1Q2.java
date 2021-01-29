
class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min , int max){
         int[] arm = new int[max];
         for(int i=min, j=0;i<max;i++){
             if(isArmstrong(i)) {
                 arm[j] = i;
                 j++;
             }
         }
         return arm;
     }
     boolean isArmstrong(int num){
         int n = num;
         int rem,sum=0;
         while(n!=0){
             rem = n%10;
             sum += rem*rem*rem;
             n=n/10;
         }
         return sum == num;
     }

}
      
public class Assignment1Q2 {
	public static void main (String [] args) {

	 int min = 100;int max = 999;
	ArmstrongNumBetweenRange tej=new ArmstrongNumBetweenRange();
	int arr[]= tej.armstrongNumbersInRange(min, max);
	for(int i=0;arr[i]!=0;i++) {
		System.out.println(arr[i]);
	}
	}
}
