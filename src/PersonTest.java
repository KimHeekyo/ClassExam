
public class PersonTest {

	public static void main(String[] args) {
		// Person 클래스 테스트
		// 오버로딩된 생성자가 있을 경우 디폴트 생성자도 구현해야 함(내용없어도 됨)
		Person hu1 = new Person();  //디폴트 생성자
		Person hu2 = new Person("홍길동"); //매개변수 1개 생성자

		System.out.println(hu2.getName());
		
		// 추가된 메서드 기능 테스트
		Person hu3 = new Person("김희교", 181, 70);
		System.out.println("성명 : " + hu3.getName() + ", 키 : " + hu3.getHeight() + ", 몸무게 : " + hu3.getWeight());
		hu3.setPerson("김희교", 191, 80);
		System.out.println("성명 : " + hu3.getName() + ", 키 : " + hu3.getHeight() + ", 몸무게 : " + hu3.getWeight());

		hu1.setPerson("김재훈", 150, 98); //객체 수정
		System.out.println("성명 : " + hu1.getName() + ", 키 : " + hu1.getHeight() + ", 몸무게 : " + hu1.getWeight());
	}

}
