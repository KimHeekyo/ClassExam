public class Truck extends Vehicle {
	public Truck(String carName) {
		this.carName = carName;
	}
	public void move() {
		System.out.println(carName+":운반을 한다.");
	}
	
}
