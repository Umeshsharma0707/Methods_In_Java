package methods;

public class var_args {
	// varargs in java
	public static int sum(int ...arr) {
		int	result = 0;
			for(int a : arr) {
				result+=a;		
			}
			return result;
	}
			 public static void main(String[] args) {
				System.out.println("welocome to java");
				System.out.println("total :"+ sum(5,4,3,2,1));
				System.out.println("total :"+sum(5,5,2,9,2));
				System.out.println("sum of nothing is :"+sum());
				System.out.println("sum of 1 is :"+sum(5,5,2,9,2));
				
			}
}
