
public class BookArray {

	public static void main(String[] args) {
		// Book �迭 �׽�Ʈ
		Book[] library = new Book[5];	// Book ��ü�� ������ �� �ִ� �迭��ü ����
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		library[0] = new Book("ž", "������");	// ��ü�����Ͽ� �迭�� ����
		library[1] = new Book("����", "�ϴ޸�");
		library[2] = new Book("�̵�", "�����Ƴ�");
		library[3] = new Book("����", "���縮����");
		library[4] = new Book("����", "������");
		
		for (int i = 0; i < library.length; i ++) {
			library[i].showBookInfo();
		}
		for (int i = 0; i < library.length; i ++) {
			System.out.println(library[i]);
		}

	}

}
