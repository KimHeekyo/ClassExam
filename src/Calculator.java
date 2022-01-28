
public class Calculator implements Calc{
	//Calc 인터페이스의 모든 메서드를 반드시 구현해야함
	public int add(int num1, int num2) {
		return num1+num2;
	}
	public int substract(int num1, int num2) {
		return num1-num2;
	}
	public int times(int num1, int num2) {
		return num1*num2;
	}
	public int divide(int num1, int num2) {
		if(num2 != 0)
			return num1/num2;
		 else 
			 return Calc.ERROR;
		
	}

}
