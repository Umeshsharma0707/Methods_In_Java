package methods;
import java.util.*;
public class Practice {

		public static void calculateFact(int n){
			double fact=1;
			if(n<0) {
				System.out.println("invalid number");
				return;
			}
			for(int i = n ; i>=1;i--) {
				fact = fact*i;
			}
			System.out.println((int)fact);
			
		}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n ");
		int n = sc.nextInt();
		
		calculateFact((int)n);
		
	}
}
