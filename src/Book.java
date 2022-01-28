
public class Book {
	// 멤버변수 (속성)
	private String bookName;
	private String author;
	// 생성자
	public Book() {
		
	}
	// 오버로딩된 생성자	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}

	// 메서드
	// get, set 문자열 규칙
	// get, set 다음에 멤버변수의 첫글자를 대문자로 작성해야 함
	// 다른 문자는 동일해야 함
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

	
	// 오버로딩된 메서드
	// 진입점(보통 사용안함) public static void main
	
}
