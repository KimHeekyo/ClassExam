
public class Ex1123_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ù��° ��ü ���� �� �׽�Ʈ
		// �ν��Ͻ� �����ؾ� Ŭ���� ��� ����
		// Ŭ������ ������ = new ������
		// ����Ʈ �����ڴ� Ŭ������� �����ϸ� �Ű����� ����
		Ex1123_1 cal1 = new Ex1123_1();  //����Ʈ �����ڷ� �ν��Ͻ� ����(��ü ����)
		System.out.println(cal1.num1);
		System.out.println(cal1.num2);
		System.out.println(cal1.result);
		System.out.println(cal1.add(10, 20));
		int test = cal1.add(1, 2);  //����� test�� ��ȯ
		System.out.println(test);
		//���� �׽�Ʈ
		System.out.println(cal1.product(5, 10));
		
		System.out.println(cal1.num1);
		System.out.println(cal1.num2);
		System.out.println(cal1.result);
		
		// �ι�° ��ü ���� �� �׽�Ʈ
		Ex1123_1 cal2 = new Ex1123_1(3, 5); // ��ü ����(�ν��Ͻ� ����)
		System.out.println(cal2.add());
		System.out.println(cal2.subtract());
		System.out.println(cal2.product());
		System.out.println(cal2.divide());
		System.out.println(cal2.add(6, 7));
		
		// ����° ��ü ���� �� �׽�Ʈ
		Ex1123_1 cal3 = new Ex1123_1(10, 5);
		// 10 + 5 = 15�� ���
		System.out.println(cal3.getNum1() + " + " + cal3.getNum2() + " = " + cal3.add());
		
		// �׹�° ��ü ���� �� �׽�Ʈ
		// ����Ʈ �����ڷ� ���� �� �Ű�����(9, 10) �߰��ϰ� ���� ��� �׽�Ʈ
		// ��Ʈ: get, set
		Ex1123_1 cal4 = new Ex1123_1();
		cal4.setNum1(9);
		cal4.setNum2(10);
		System.out.println(cal4.getNum1() + " * " + cal4.getNum2() + " = " + cal4.product());
		
				
	}

}
