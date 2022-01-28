
public class Student {
	//멤버변수
	private static int serialNum = 1000; // 인스턴스(객체) 생성과 무관함, 모든 객체에서 공용
	public int studentId;
	private String studentName;
	public int grade;
	private String address;
	//생성자
	public Student() {
		serialNum = serialNum +1;	//클래스 공통, 생성하면 무조건 증가
		studentId = serialNum;
	}
	//오버로딩된 생성자
	public Student(String studentName, String address) {
		this.studentName = studentName;
		this.address = address;
	}
	//메서드
	/*
	public void showStudentInfo( ) {
		System.out.println(studentName + "===" + address);
	}
	*/
	public String getStudentName() {
		return studentName;
	}
	public String getAddress() {
		return address;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
	
	public void showstudentNameInfo() {
		System.out.println(getStudentName() + "의 소속그룹은 " + getAddress());
	}
	
	//오버로딩된 메서드
	//진입점(main)
	
	/*
	public static void main(String[] args) {  //진입점, 운영체제에서 프로그램 호출, Student
		//클래스명 변수명 = new 생성자
		Student st1 = new Student(); //객체생성
		
	}
	*/
}
