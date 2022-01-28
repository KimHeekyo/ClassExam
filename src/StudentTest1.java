
public class StudentTest1 {

	public static void main(String[] args) {
		// Student 클래스 테스트
		System.out.println(Student.getSerialNum()); // 객체생성과 무관
		
		Student st1 = new Student(); // 디폴트 생성자
		st1.setStudentName("카리나");
		// System.out.println(st1.studentName);  // public 멤버변수이므로 가능
		// System.out.println(st1.getStudentName());  // public 메서드이므로 가능
		//st1.serialNum++;
		
		System.out.println(Student.getSerialNum()); // static 변수 읽기
		System.out.println(st1.getStudentName() + " : " + st1.studentId);
		Student st2 = new Student();
		st2.setStudentName("윈터");
		System.out.println(st2.getSerialNum());
		System.out.println(st2.getStudentName() + " : " + st2.studentId);
		
		
		
	}

}
