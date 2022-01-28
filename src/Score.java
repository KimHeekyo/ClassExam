
public class Score {
	String name;
	int korscore;
	int engscore;
	int mathscore;
	
	public Score() {
		name = "홍길동";
		korscore = 70;
		engscore = 70;
		mathscore = 70;
	}
	public Score(String sname, int kor, int eng, int math) {
		name = sname;
		korscore = kor;
		engscore = eng;
		mathscore = math;
	}
	public void setName(String sname) {
		name = sname;
	}
	public void setKorscore(int kor) {
		korscore = kor;
	}
	public void setEngscore(int eng) {
		engscore = eng;
	}
	public void setMathscore(int math) {
		mathscore = math;
	}
	public String getName() {
		return name;
	}
	public int getKorscore() {
		return korscore;
	}
	public int getEngscore() {
		return engscore;
	}
	public int getMathscore() {
		return mathscore;
	}
	public int getTotal() {
		return korscore+engscore+mathscore;
	}
	public double getAvg() {
		return getTotal() / 3.0; // 앞이나 뒤에 (double) 또는 실수형
	}
	
}