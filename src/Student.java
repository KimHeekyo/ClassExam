
public class Student {
	//�������
	private static int serialNum = 1000; // �ν��Ͻ�(��ü) ������ ������, ��� ��ü���� ����
	public int studentId;
	private String studentName;
	public int grade;
	private String address;
	//������
	public Student() {
		serialNum = serialNum +1;	//Ŭ���� ����, �����ϸ� ������ ����
		studentId = serialNum;
	}
	//�����ε��� ������
	public Student(String studentName, String address) {
		this.studentName = studentName;
		this.address = address;
	}
	//�޼���
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
		System.out.println(getStudentName() + "�� �Ҽӱ׷��� " + getAddress());
	}
	
	//�����ε��� �޼���
	//������(main)
	
	/*
	public static void main(String[] args) {  //������, �ü������ ���α׷� ȣ��, Student
		//Ŭ������ ������ = new ������
		Student st1 = new Student(); //��ü����
		
	}
	*/
}
