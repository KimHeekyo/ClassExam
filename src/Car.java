
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
		car1.setcarName("���");
		Car car2 = new Car();
		car2.setcarSpeed(500);
		
		System.out.println(car1.carName);
		System.out.println(car2.carSpeed);
		System.out.println(car1.carName + "�� �ִ�ӵ��� " + car2.carSpeed + "�Դϴ�.");
	}
	
	
}