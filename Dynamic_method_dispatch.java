package methods;
class one{
		public void greet() {
			// TODO Auto-generated method stub
			System.out.println("good morning");
		}
		public void name() {
			System.out.println("Name class One :Umesh");
		}
}
class two extends one{
	public void name() {
		//super.name();  // can call both name methods from both classes
		System.out.println("Name class two :Mahesh");
	}
	public void greetings() {
		System.out.println("Namaste");
	}
}
public class Dynamic_method_dispatch {
			 public static void main(String[] args) {
				one obj = new two();      // parent class reference can be equal to child class 
				 // child class reference cannot be equal to parent class 
				//obj.name();
				obj.name();  // calls name method from class two
				//two obj2 = new two();
				//obj2.name();
			}
}
