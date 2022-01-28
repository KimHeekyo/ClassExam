import java.util.*;
public class Students {
	// 멤버변수
	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList;
	
	// 생성자
	public Students() {
		
	}
	// 오버로딩된 생성자
	public Students(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	// 과목명과 점수를 추가하는 메서드, 학생마다 각각 처리
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
	}
}
