
public class PersonTest {

	public static void main(String[] args) {
		// Person Ŭ���� �׽�Ʈ
		// �����ε��� �����ڰ� ���� ��� ����Ʈ �����ڵ� �����ؾ� ��(������ ��)
		Person hu1 = new Person();  //����Ʈ ������
		Person hu2 = new Person("ȫ�浿"); //�Ű����� 1�� ������

		System.out.println(hu2.getName());
		
		// �߰��� �޼��� ��� �׽�Ʈ
		Person hu3 = new Person("����", 181, 70);
		System.out.println("���� : " + hu3.getName() + ", Ű : " + hu3.getHeight() + ", ������ : " + hu3.getWeight());
		hu3.setPerson("����", 191, 80);
		System.out.println("���� : " + hu3.getName() + ", Ű : " + hu3.getHeight() + ", ������ : " + hu3.getWeight());

		hu1.setPerson("������", 150, 98); //��ü ����
		System.out.println("���� : " + hu1.getName() + ", Ű : " + hu1.getHeight() + ", ������ : " + hu1.getWeight());
	}

}
