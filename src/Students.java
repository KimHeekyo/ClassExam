import java.util.*;
public class Students {
	// �������
	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList;
	
	// ������
	public Students() {
		
	}
	// �����ε��� ������
	public Students(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	// ������ ������ �߰��ϴ� �޼���, �л����� ���� ó��
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
	}
}
