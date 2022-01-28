import java.util.*;
class Animals {

   public void move() {
      System.out.println("������ �����Դϴ�.");
   }
}

class Human extends Animals {
   public void move() {    // �޼��� �������̵�(Overriding)
      System.out.println("����� �����Դϴ�.");
   }
   public void readBook() {
	   System.out.println("å�� �д´�.");
   }
}
class Tiger extends Animals {
   public void move() {    // �޼��� �������̵�(Overriding)
      System.out.println("ȣ���̰� �����Դϴ�.");
   }
   public void hunting() {
	   System.out.println("ȣ���̰� ����� �Ѵ�.");
   }
}
class Eagle extends Animals {
   public void move() {    // �޼��� �������̵�(Overriding)
      System.out.println("�������� �����Դϴ�.");
   }
   public void flying() {
	   System.out.println("�������� ���ư���.");
   }
}

public class AnimalsTest {	// ���ϸ�� ������ Ŭ������ public �ʿ� (�� 1��)
   public static void main(String[] args) {
	   AnimalsTest aTest = new AnimalsTest();
	   
	   Animals[] animalArr = new Animals[10];	// �迭��ü ����
	   
	   for (int i = 0; i < 3; i++) {
		   animalArr[i] = new Human();
	   }
	   for (int i = 3; i < 5; i++) {
		   animalArr[i] = new Tiger();
	   }
	   for (int i = 5; i < 10; i++) {
		   animalArr[i] = new Eagle();
	   }
	   // move �޼��� ȣ��
	   for (int i = 0; i < animalArr.length; i++) {
		   animalArr[i].move();
	   }
	   
	   /*
	   for (int i = 0; i < 10; i++) {
		   aTest.moveAnimal(animalArr[i]);
	   }
	   */
	   //---------------------------------------------------------------------------------
	   ArrayList<Animals> aniList = new ArrayList<Animals>();
	   aniList.add(new Human());	// ��ü �����ϸ鼭 �迭�� �߰�
	   aniList.add(new Tiger());
	   aniList.add(new Eagle());
	   for ( Animals item : aniList) {
		   item.move();		// �������� ���� ������ �޼��� ȣ��
	   }
	   for (int i = 0; i < aniList.size(); i++) {
		   Animals item = aniList.get(i);
		   if (item instanceof Human) {
			   Human h = (Human)item;  // �ٿ�ĳ����
			   h.readBook();  // �ٿ�ĳ���� �Ǿ����Ƿ� ������ �޼��� ��� ����
		   } else if (item instanceof Tiger) {
			   Tiger t = (Tiger)item;
			   t.hunting();
		   } else if (item instanceof Eagle) {
			   Eagle e = (Eagle)item;
			   e.flying();
		   } else {
			   System.out.println("�� �� ���� �����Դϴ�.");
		   }
	   }
	   
	   
	   //---------------------------------------------------------------------------------
	   
   }
   
   public void moveAnimal(Animals animal) {
	   animal.move();   // ������, ������ �ٸ� ���� ����	   
   }
}