
public class Car1Test {

	public static void main(String[] args) {
		// Car1 Ŭ���� �׽�Ʈ
		
		Car1 c1 = new Car1();
		Car1 c2 = new Car1("���׽ý�", 150);
		Car1 c3 = new Car1("���׽ý�", 150);
		
		System.out.println(c2.getcarName());
		System.out.println(c2.getcarSpeed());
		System.out.println(c3.getcarName() + "�� �ӵ��� " + c3.getcarSpeed() + "�Դϴ�.");
		
		c1.speedUp(50);
		System.out.println(c1.getcarSpeed()+c2.getcarSpeed());
		
		
		
	}

}