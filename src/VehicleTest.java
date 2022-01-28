import java.util.*;
public class VehicleTest {
	
	public static void main(String[] args) {
		ArrayList<Vehicle>vList = new ArrayList<Vehicle>(); //각종 객체를 저장할 배열
		Vehicle v1 = new Sedan("티코");
		Vehicle v2 = new SUV("코나");
		Vehicle v3 = new Truck("봉고");
		Vehicle v4 = new Sedan("마티즈");
		Vehicle v5 = new Truck("봉고2");
		vList.add(v1);
		vList.add(v2);
		vList.add(v3);
		vList.add(v4);
		vList.add(v5);
		//아래와 같이 생성후 추가해도됨
		//vList.add(new Sedan()); // 6라인 또는 9라인과 동일
		for(Vehicle  v :vList  ) { //향상된 for 구문
			v.move();//각각의 객체에 맞게 호출됨(다형성)
			
		}
	}
}
