
public class StudentArray {

	public static void main(String[] args) {
		// Student ��ü �迭 �׽�Ʈ
		
		Student[] stu = new Student[4];
		
		stu[0] = new Student("ī����", "������");
		stu[1] = new Student("����", "������");
		stu[2] = new Student("����", "������");
		stu[3] = new Student("�״�", "������");
		
		for (int i = 0; i < stu.length; i++) {
			stu[i].showstudentNameInfo();
		}
		

	}

}