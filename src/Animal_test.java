
public class Animal_test {

	public static void main(String[] args) {
		// Animal Ŭ���� �׽�Ʈ
		
		Animal a1 = new Animal();
		System.out.println(a1.getName() + "�� �����Դ� " + a1.getWeight() + "�̰�, �ӵ��� " + a1.getSpeed() + "�̴�.");
		a1.setName("Ÿ�뽺");
		a1.setWeight(150);
		a1.setSpeed(20);
		System.out.println(a1.getName() + "�� �����Դ� " + a1.getWeight() + "�̰�, �ӵ��� " + a1.getSpeed() + "�̴�.");
		
		Animal a2 = new Animal("���̾��");
		a2.setWeight(70);
		a2.setSpeed(200);
		System.out.println(a2.getName() + "�� �����Դ� " + a2.getWeight() + "�̰�, �ӵ��� " + a2.getSpeed() + "�̴�.");
		
		Animal a3 = new Animal("��ũ");
		a3.setWeight(200);
		a3.setSpeed(5);
		a3.speedDown(100);
		System.out.println(a3.getName() + "�� �����Դ� " + a3.getWeight() + "�̰�, �ӵ��� " + a3.getSpeed() + "�̴�.");
		
		
		

	}

}
