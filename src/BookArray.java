
public class BookArray {

	public static void main(String[] args) {
		// Book 배열 테스트
		Book[] library = new Book[5];	// Book 객체를 저장할 수 있는 배열객체 생성
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		library[0] = new Book("탑", "레넥톤");	// 객체생성하여 배열에 저장
		library[1] = new Book("정글", "니달리");
		library[2] = new Book("미드", "오리아나");
		library[3] = new Book("원딜", "아펠리오스");
		library[4] = new Book("서폿", "쓰레쉬");
		
		for (int i = 0; i < library.length; i ++) {
			library[i].showBookInfo();
		}
		for (int i = 0; i < library.length; i ++) {
			System.out.println(library[i]);
		}

	}

}
