
public class StudentTest1 {

	public static void main(String[] args) {
		// Student Ŭ���� �׽�Ʈ
		System.out.println(Student.getSerialNum()); // ��ü������ ����
		
		Student st1 = new Student(); // ����Ʈ ������
		st1.setStudentName("ī����");
		// System.out.println(st1.studentName);  // public ��������̹Ƿ� ����
		// System.out.println(st1.getStudentName());  // public �޼����̹Ƿ� ����
		//st1.serialNum++;
		
		System.out.println(Student.getSerialNum()); // static ���� �б�
		System.out.println(st1.getStudentName() + " : " + st1.studentId);
		Student st2 = new Student();
		st2.setStudentName("����");
		System.out.println(st2.getSerialNum());
		System.out.println(st2.getStudentName() + " : " + st2.studentId);
		
		
		
	}

}
