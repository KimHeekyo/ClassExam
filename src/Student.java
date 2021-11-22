
public class Student {
	//멤버변수
	int studentId;
	String studentName;
	int grade;
	String address;
	//생성자
	//오버로딩된 생성자
	//메서드
	public void showStudentInfo( ) {
		System.out.println(studentName + "===" + address);
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
		return;
	}
	//오버로딩된 메서드
	//진입점(main)
	public static void main(String[] args) {  //진입점, 운영체제에서 프로그램 호출, Student
		//클래스명 변수명 = new 생성자
		Student st1 = new Student(); //객체생성
		st1.setStudentName("홍길동");
		
		System.out.println(st1.studentName); //멤버변수 직접 출력
		System.out.println(st1.getStudentName()); //메서드를 활용해서 출력
		
	}
	
}
