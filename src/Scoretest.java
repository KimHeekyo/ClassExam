
public class Scoretest {

	public static void main(String[] args) {
		// Score Ŭ���� �׽�Ʈ
		
		Score s1 = new Score();
		System.out.println(s1.getName() + "�� ���������� " + s1.getKorscore() + "���̰�, ���������� " + s1.getEngscore() + "���̰�, ���������� " + s1.getMathscore() + "�� �Դϴ�.");
		System.out.println(s1.getName() + "�� �� ������ " + s1.getTotal() + "�� �Դϴ�.");
		System.out.println(s1.getName() + "�� ��������� " + s1.getAvg() + "�� �Դϴ�.");
		
		s1.setName("����");
		s1.setKorscore(100);
		s1.setEngscore(100);
		s1.setMathscore(100);
		System.out.println(s1.getName() + "�� ���������� " + s1.getKorscore() + "���̰�, ���������� " + s1.getEngscore() + "���̰�, ���������� " + s1.getMathscore() + "�� �Դϴ�.");
		System.out.println(s1.getName() + "�� �� ������ " + s1.getTotal() + "�� �Դϴ�.");
		System.out.println(s1.getName() + "�� ��������� " + s1.getAvg() + "�� �Դϴ�.");
		
		Score s2 = new Score("�Ͽ���", 91, 95, 99);
		System.out.println(s2.getName() + "�� ���������� " + s2.getKorscore() + "���̰�, ���������� " + s2.getEngscore() + "���̰�, ���������� " + s2.getMathscore() + "�� �Դϴ�.");
		System.out.println(s2.getName() + "�� �� ������ " + s2.getTotal() + "�� �Դϴ�.");
		System.out.println(s2.getName() + "�� ��������� " + s2.getAvg() + "�� �Դϴ�.");
		
		s2.setEngscore(100);
		System.out.println(s2.getName() + "�� ���������� " + s2.getKorscore() + "���̰�, ���������� " + s2.getEngscore() + "���̰�, ���������� " + s2.getMathscore() + "�� �Դϴ�.");
		System.out.println(s2.getName() + "�� �� ������ " + s2.getTotal() + "�� �Դϴ�.");
		System.out.println(s2.getName() + "�� ��������� " + s2.getAvg() + "�� �Դϴ�.");

	}

}