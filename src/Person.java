
public class Person {
	String name;
	int height;
	int weight;
	
	// �����ڰ� �Ѱ��� ������� ����Ʈ�����ڰ� ������
	
	
	// ������ �ۼ� ��Ģ
	// Ŭ������� ����
	// ��ȯŸ���� ����
	// ��������� ����Ʈ ������ �ʿ�
	public Person() {
		
	}
	// �����ε��� ������	
	public Person(String pName) {  //������ �̸��� ����, �Ű����� �ٸ�(����, Ÿ��, ����)
		name = pName;
	}
	// �����ε��� ������
	public Person(String pName, int pHeight, int pWeight) {
		name = pName;
		height = pHeight;
		weight = pWeight;
	}
	// �޼���
	public String getName() {
		return name;
	}
	
	// Ű�� �����Ը� ���� ������ �� �ִ� �޼��� �߰�
	public int getHeight( ) {
		return height;
	}
	public int getWeight( ) {
		return weight;
	}
	// ����, Ű, �����Ը� ������ �� �ִ� �޼��� �߰�
	public void setPerson(String pName, int pHeight, int pWeight) {
		name = pName;
		height = pHeight;
		weight = pWeight;
	}
}
