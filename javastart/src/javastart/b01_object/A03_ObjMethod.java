package javastart.b01_object;

class Man{
	String name;
	int age;
	void printAll(){
		System.out.print("이름은 "+name);
		System.out.println(", 나이는 "+age+"살!! ");
	}
}
/*
1단계..
Hope  //새해 희망..객체 class
 변수
   문자열(String) hope01 // 첫번째 희망
   문자열(String) hope02 // 두번째 희망
   문자열(String) hope03 // 세번째 희망
   숫자(int) newYear     //  새해년도
   문자열(String) orgRnd //  새해띠?
   
메서드showMyHope()  
	@@@ 년도 @@@ 띠 새해에 나의 희망사항
	1. @@@@
	2. @@@@
	3. @@@@
 * 
 * */
class Hope{
	String hope01;
	String hope02;
	String hope03;
	int newYear;
	String orgRnd;
	void showMyHope(){
		System.out.println(newYear+" 년도 "+orgRnd+" 띠 새해에 나의 희망사항");
		System.out.println("1. "+hope01);
		System.out.println("2. "+hope02);
		System.out.println("3. "+hope03);
	}
	
}

public class A03_ObjMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man m1 = new Man();
		m1.name="이경규";
		m1.age=52;
		m1.printAll();
		Hope p1 = new Hope();
		p1.hope01="평안";
		p1.hope02="지혜";
		p1.hope03="목표";
		p1.newYear=2017;
		p1.orgRnd="닭";
		p1.showMyHope();
		
	}

}
