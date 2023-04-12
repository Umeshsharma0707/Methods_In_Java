package methods;

public class Method_Overloading {
	public static void foo(int a) {
		System.out.println("good morning ");
	}
	public static void foo(int a, int b) {
		System.out.println("good morning "+a+" bro");
		System.out.println("good morning "+b+" bro");

	}
			public static void main(String[] args) {
				foo(10);
				foo(3000,40);
			}
}
