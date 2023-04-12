package methods;
class Smartphone implements Inter1,Inter2 {

	@Override
	public void gps() {
		System.out.println("finding Location....");
	}

	@Override
	public void camera() {
		System.out.println("starting camera");
		System.out.println("taking picture");
		System.out.println("image saved in Gallary");
		
	}

	@Override
	public void mediaPlayer() {
		System.out.println("mediaplayer starting ");
		System.out.println("playing song...");
		System.out.println("sing Name: Rubicon Drill");
		
	}

	@Override
	public void cellPhone(int number) {
		System.out.println("calling " + number);
		
	}

	@Override
	public void camera2() {
		System.out.println("taking picture");
		System.out.println("image saved in Gallary");
	}
	
}
class Cellphone1 implements Inter1 
{

	@Override
	public void gps() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mediaPlayer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cellPhone(int number) {
				
	}
	
}
public class Polymorphism {
			 public static void main(String[] args) {
				 Inter1 cam1 = new Smartphone();
				 cam1.cellPhone(15341541);
				Inter2 cam2 = new Smartphone();
				 
				cam2.camera2();
				((Smartphone) cam2).mediaPlayer();
				
				Smartphone smartp = new Smartphone();
				smartp.gps();
			}
}
