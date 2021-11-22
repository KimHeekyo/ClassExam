
public class Car {
	String carName;
	int carSpeed;
	
	public String carName() {
		return carName;
	}
	
	public void setcarName(String name) {
		carName = name;
		return;
	}
	
	public void setcarSpeed(int speed) {
		carSpeed = speed;
		return;
	}
	
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setcarName("페라리");
		Car car2 = new Car();
		car2.setcarSpeed(500);
		
		System.out.println(car1.carName);
		System.out.println(car2.carSpeed);
		System.out.println(car1.carName + "의 최대속도는 " + car2.carSpeed + "입니다.");
	}
	
	
}