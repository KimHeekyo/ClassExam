
public abstract class Computer {	//추상 클래스
	public abstract void display();  //추상 메서드
	public abstract void typing(); //추상 메서드
	
	public void turnOn() {
		System.out.println("전원을 켠다.");
		
	}
	public void turnOff() {
		System.out.println("전원을 끈다.");
		
		
	}
}
