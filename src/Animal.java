
public class Animal {
	// �������
	String name;
	int weight;
	int speed;
	// ����Ʈ ������
	public Animal() {
		name = "����";
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
	
	//�޼���
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
		if (speed + 10 > 100) { // ���� �ӵ��� �߰��� �ӵ��� �����ؼ� 100���� ū�� Ȯ��
			speed = 100;
		} else {
		speed += 10;
		}
	}

	public void speedUp(int aspeed) {
		if (speed + aspeed > 100) { // ���� �ӵ��� �߰��� �ӵ��� �����ؼ� 100���� ū�� Ȯ��
			speed = 100;
		} else {
		speed += aspeed;
		}
	}
	public void speedDown() {
		if (speed - 10 < 0) { // ���� �ӵ��� ���ҵ� �ӵ��� �����ؼ� 0���� ������ Ȯ��
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
