
public class Book {
	// ������� (�Ӽ�)
	private String bookName;
	private String author;
	// ������
	public Book() {
		
	}
	// �����ε��� ������	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}

	// �޼���
	// get, set ���ڿ� ��Ģ
	// get, set ������ ��������� ù���ڸ� �빮�ڷ� �ۼ��ؾ� ��
	// �ٸ� ���ڴ� �����ؾ� ��
	public String getBookName() {
		return bookName;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(getBookName() + " : " + getAuthor());
	}

	
	// �����ε��� �޼���
	// ������(���� ������) public static void main
	
}
