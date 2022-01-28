
public class Animal {
	// 멤버변수
	String name;
	int weight;
	int speed;
	// 디폴트 생성자
	public Animal() {
		name = "동물";
		weight = 30;
		speed = 0;
	}
	public Animal(String aname) {
		name = aname;
		weight = 30;
		speed = 0;
	}
	public Animal(String aname, int aweight) {
		name = aname;
		weight = aweight;
		speed = 0;
	}
	
	//메서드
	public void setName(String aname) {
		name = aname;
	}
	public void setWeight(int aweight) {
		weight = aweight;
	}
	public void setSpeed(int aspeed) {
		speed = aspeed;
	}
	public String getName() {
		return name;
	}
	public int getWeight() {
		return weight;
	}
	public int getSpeed() {
		return speed;
	}
	
	public void speedUp() {
		if (speed + 10 > 100) { // 현재 속도에 추가될 속도를 덧셈해서 100보다 큰지 확인
			speed = 100;
		} else {
		speed += 10;
		}
	}

	public void speedUp(int aspeed) {
		if (speed + aspeed > 100) { // 현재 속도에 추가될 속도를 덧셈해서 100보다 큰지 확인
			speed = 100;
		} else {
		speed += aspeed;
		}
	}
	public void speedDown() {
		if (speed - 10 < 0) { // 현재 속도에 감소될 속도를 뺄셈해서 0보다 작은지 확인
			speed = 0;
		} else {
		speed -= 10;
		}
	}
	public void speedDown(int aspeed) {
		if (speed - aspeed < 0) { 
			speed = 0;
		} else {
		speed -= aspeed;
		}
	}
	
}
