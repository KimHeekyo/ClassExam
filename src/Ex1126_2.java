
public class Ex1126_2 {

	public static void main(String[] args) {
		// 아스키코드 연속출력(배열에 먼저 저장하고 저장된 배열을 출력)
		char[] alpha = new char[10];
		char ch = '0';  //저장용 시작문자
		
		for (int i = 0; i < alpha.length; i++, ch ++) { // 저장
			alpha[i] = ch;
		}
		
		for (int i = 0; i < alpha.length; i++) {
			System.out.println(alpha[i] + " : " + (int)alpha[i]);
		}
		
		
		
		/*
		System.out.println(ch);  // 문자 출력됨
		System.out.println((int)ch);  // 문자 출력됨
		ch++;
		System.out.println(ch);  // 문자 출력됨
		ch++;
		System.out.println(ch);  // 문자 출력됨
		*/
		
		
		/*
		for (int i = 0; i < 26; i++) {
			alpha[i] = 
		}
		*/
		
	}

}
