
public class Scoretest {

	public static void main(String[] args) {
		// Score 클래스 테스트
		
		Score s1 = new Score();
		System.out.println(s1.getName() + "의 국어점수는 " + s1.getKorscore() + "점이고, 영어점수는 " + s1.getEngscore() + "점이고, 수학점수는 " + s1.getMathscore() + "점 입니다.");
		System.out.println(s1.getName() + "의 총 점수는 " + s1.getTotal() + "점 입니다.");
		System.out.println(s1.getName() + "의 평균점수는 " + s1.getAvg() + "점 입니다.");
		
		s1.setName("김희교");
		s1.setKorscore(100);
		s1.setEngscore(100);
		s1.setMathscore(100);
		System.out.println(s1.getName() + "의 국어점수는 " + s1.getKorscore() + "점이고, 영어점수는 " + s1.getEngscore() + "점이고, 수학점수는 " + s1.getMathscore() + "점 입니다.");
		System.out.println(s1.getName() + "의 총 점수는 " + s1.getTotal() + "점 입니다.");
		System.out.println(s1.getName() + "의 평균점수는 " + s1.getAvg() + "점 입니다.");
		
		Score s2 = new Score("하연수", 91, 95, 99);
		System.out.println(s2.getName() + "의 국어점수는 " + s2.getKorscore() + "점이고, 영어점수는 " + s2.getEngscore() + "점이고, 수학점수는 " + s2.getMathscore() + "점 입니다.");
		System.out.println(s2.getName() + "의 총 점수는 " + s2.getTotal() + "점 입니다.");
		System.out.println(s2.getName() + "의 평균점수는 " + s2.getAvg() + "점 입니다.");
		
		s2.setEngscore(100);
		System.out.println(s2.getName() + "의 국어점수는 " + s2.getKorscore() + "점이고, 영어점수는 " + s2.getEngscore() + "점이고, 수학점수는 " + s2.getMathscore() + "점 입니다.");
		System.out.println(s2.getName() + "의 총 점수는 " + s2.getTotal() + "점 입니다.");
		System.out.println(s2.getName() + "의 평균점수는 " + s2.getAvg() + "점 입니다.");

	}

}