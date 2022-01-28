
public class Practice1130_1 {

	public static void main(String[] args) {
		// 연습
	      Book[] bookArr1 = new Book[3];   //Book 객체를 저장할 배열 변수 선언
	      Book[] bookArr2 = new Book[3];   //Book 객체를 저장할 배열 변수 선언
	      bookArr1[0] = new Book("태백산맥", "조정래");
	      bookArr1[1] = new Book("데미안", "헤르만헤세");
	      bookArr1[2] = new Book("어떻게살것인가", "유시민");
	      
	      String[] strArr = {"자바", "안드로이드", "C", "자바스크립트", "파이썬"};
	      
	      for (int i = 0; i < bookArr2.length; i++) {
	         bookArr2[i] = new Book();  //일단 디폴트 생성자로 생성해둠
	      }
	      for (int i = 0; i < bookArr1.length; i++) {   //원본 배열 길이만큼 배정(저장)
	          bookArr2[i].setBookName(bookArr1[i].getBookName());
	          bookArr2[i].setAuthor(bookArr1[i].getAuthor());
	      }
	      System.out.println("=============원본=============");
	      for (int i = 0; i < bookArr1.length; i++) {   //원본
	         bookArr1[i].showBookInfo();
	      }
	      System.out.println("=============사본=============");
	      for (int i = 0; i < bookArr2.length; i++) {   //사본
	         bookArr2[i].showBookInfo();
	      }
	      
	      bookArr2[2].setBookName("자바프로그래밍");
	      bookArr2[2].setAuthor("홍길동");
	      
	      System.out.println("=============원본=============");
	      for (int i = 0; i < bookArr1.length; i++) {   //원본
	         bookArr1[i].showBookInfo();
	      }
	      System.out.println("=============사본=============");
	      for (int i = 0; i < bookArr2.length; i++) {   //사본
	         bookArr2[i].showBookInfo();
	      }
	      
	      bookArr1[1].setBookName("자바");
	      bookArr1[1].setAuthor("김삿갓");
	      
	      System.out.println("=============원본=============");
	      for (int i = 0; i < bookArr1.length; i++) {   //원본
	         bookArr1[i].showBookInfo();
	      }
	      System.out.println("=============사본=============");
	      for (int i = 0; i < bookArr2.length; i++) {   //사본
	         bookArr2[i].showBookInfo();
	      }
	      
	      for ( String lang   : strArr   ) {	// lang=지역변수 아무렇게나 써도 됨
	    	  System.out.print(lang + " ");
	      }
	      System.out.println();
	      for (int i = 0; i < strArr.length; i++) {
	    	  System.out.print(strArr[i] + " ");
	      }
	}
	

}
