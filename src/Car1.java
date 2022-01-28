
public class Car1 {
	
	String carName;
	int carSpeed;
	
	public Car1() {
		
	}
	
	public Car1(String cN, int cS) {
		carName = cN;
		carSpeed = cS;
	}

	public String getcarName() {
		return carName;
	}
	
	public int getcarSpeed() {
		return carSpeed;
	}
	
	public void setCar1(String cN, int cS) {
		cN=carName;
		cS=carSpeed;
	}
	public void speedUp(int speed) {
		carSpeed += speed;
	}
	public void speedDown(int speed) {
		carSpeed -= speed;
	
	}
}
