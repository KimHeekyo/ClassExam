
public class Ex1126_2 {

	public static void main(String[] args) {
		// �ƽ�Ű�ڵ� �������(�迭�� ���� �����ϰ� ����� �迭�� ���)
		char[] alpha = new char[10];
		char ch = '0';  //����� ���۹���
		
		for (int i = 0; i < alpha.length; i++, ch ++) { // ����
			alpha[i] = ch;
		}
		
		for (int i = 0; i < alpha.length; i++) {
			System.out.println(alpha[i] + " : " + (int)alpha[i]);
		}
		
		
		
		/*
		System.out.println(ch);  // ���� ��µ�
		System.out.println((int)ch);  // ���� ��µ�
		ch++;
		System.out.println(ch);  // ���� ��µ�
		ch++;
		System.out.println(ch);  // ���� ��µ�
		*/
		
		
		/*
		for (int i = 0; i < 26; i++) {
			alpha[i] = 
		}
		*/
		
	}

}
