
public class Animal_test {

	public static void main(String[] args) {
		// Animal 클래스 테스트
		
		Animal a1 = new Animal();
		System.out.println(a1.getName() + "의 몸무게는 " + a1.getWeight() + "이고, 속도는 " + a1.getSpeed() + "이다.");
		a1.setName("타노스");
		a1.setWeight(150);
		a1.setSpeed(20);
		System.out.println(a1.getName() + "의 몸무게는 " + a1.getWeight() + "이고, 속도는 " + a1.getSpeed() + "이다.");
		
		Animal a2 = new Animal("아이언맨");
		a2.setWeight(70);
		a2.setSpeed(200);
		System.out.println(a2.getName() + "의 몸무게는 " + a2.getWeight() + "이고, 속도는 " + a2.getSpeed() + "이다.");
		
		Animal a3 = new Animal("헐크");
		a3.setWeight(200);
		a3.setSpeed(5);
		a3.speedDown(100);
		System.out.println(a3.getName() + "의 몸무게는 " + a3.getWeight() + "이고, 속도는 " + a3.getSpeed() + "이다.");
		
		
		

	}

}
