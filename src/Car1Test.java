
public class Car1Test {

	public static void main(String[] args) {
		// Car1 클래스 테스트
		
		Car1 c1 = new Car1();
		Car1 c2 = new Car1("제네시스", 150);
		Car1 c3 = new Car1("제네시스", 150);
		
		System.out.println(c2.getcarName());
		System.out.println(c2.getcarSpeed());
		System.out.println(c3.getcarName() + "의 속도는 " + c3.getcarSpeed() + "입니다.");
		
		c1.speedUp(50);
		System.out.println(c1.getcarSpeed()+c2.getcarSpeed());
		
		
		
	}

}