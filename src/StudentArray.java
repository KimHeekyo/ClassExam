
public class StudentArray {

	public static void main(String[] args) {
		// Student 객체 배열 테스트
		
		Student[] stu = new Student[4];
		
		stu[0] = new Student("카리나", "에스파");
		stu[1] = new Student("윈터", "에스파");
		stu[2] = new Student("지젤", "에스파");
		stu[3] = new Student("닝닝", "에스파");
		
		for (int i = 0; i < stu.length; i++) {
			stu[i].showstudentNameInfo();
		}
		

	}

}