
public class Practice1130_1 {

	public static void main(String[] args) {
		// ����
	      Book[] bookArr1 = new Book[3];   //Book ��ü�� ������ �迭 ���� ����
	      Book[] bookArr2 = new Book[3];   //Book ��ü�� ������ �迭 ���� ����
	      bookArr1[0] = new Book("�¹���", "������");
	      bookArr1[1] = new Book("���̾�", "�츣���켼");
	      bookArr1[2] = new Book("��Ի���ΰ�", "���ù�");
	      
	      String[] strArr = {"�ڹ�", "�ȵ���̵�", "C", "�ڹٽ�ũ��Ʈ", "���̽�"};
	      
	      for (int i = 0; i < bookArr2.length; i++) {
	         bookArr2[i] = new Book();  //�ϴ� ����Ʈ �����ڷ� �����ص�
	      }
	      for (int i = 0; i < bookArr1.length; i++) {   //���� �迭 ���̸�ŭ ����(����)
	          bookArr2[i].setBookName(bookArr1[i].getBookName());
	          bookArr2[i].setAuthor(bookArr1[i].getAuthor());
	      }
	      System.out.println("=============����=============");
	      for (int i = 0; i < bookArr1.length; i++) {   //����
	         bookArr1[i].showBookInfo();
	      }
	      System.out.println("=============�纻=============");
	      for (int i = 0; i < bookArr2.length; i++) {   //�纻
	         bookArr2[i].showBookInfo();
	      }
	      
	      bookArr2[2].setBookName("�ڹ����α׷���");
	      bookArr2[2].setAuthor("ȫ�浿");
	      
	      System.out.println("=============����=============");
	      for (int i = 0; i < bookArr1.length; i++) {   //����
	         bookArr1[i].showBookInfo();
	      }
	      System.out.println("=============�纻=============");
	      for (int i = 0; i < bookArr2.length; i++) {   //�纻
	         bookArr2[i].showBookInfo();
	      }
	      
	      bookArr1[1].setBookName("�ڹ�");
	      bookArr1[1].setAuthor("���");
	      
	      System.out.println("=============����=============");
	      for (int i = 0; i < bookArr1.length; i++) {   //����
	         bookArr1[i].showBookInfo();
	      }
	      System.out.println("=============�纻=============");
	      for (int i = 0; i < bookArr2.length; i++) {   //�纻
	         bookArr2[i].showBookInfo();
	      }
	      
	      for ( String lang   : strArr   ) {	// lang=�������� �ƹ����Գ� �ᵵ ��
	    	  System.out.print(lang + " ");
	      }
	      System.out.println();
	      for (int i = 0; i < strArr.length; i++) {
	    	  System.out.print(strArr[i] + " ");
	      }
	}
	

}
