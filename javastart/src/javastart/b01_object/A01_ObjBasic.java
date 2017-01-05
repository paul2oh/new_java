package javastart.b01_object;

// Person이라는 틀을 만든다.
class Person{
	String name;
	int age; //나이..
	
}
// ex) Product 물건명 데이터를 선언한 후에 main에서 호출하세요.
class Product{
	String pname;
	int pcnt;//물건의 갯수
	int pprice;//물건의 단가
	int sum; //물건의 계(갯수*단가)
}
/*
 * 물건 3개에 데이터를 할당하고,
 * 아래 형식으로 출력하세요.
 *    현재고 리스트
 NO  물건명  단가  갯수  계
 1   @@@@    3000    2   6000
 2   @@@     4000    3  12000
 3   @@@@    5000    1   5000
 * */
public class A01_ObjBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 만들어진 틀에서 Person 실제 메모리에 올리게 처리..	
		Person p1 = new Person();
		p1.name="홍길동";
		p1.age=20;
		Person p2 = new Person();
		p2.name="김길동";
		p2.age=27;
		System.out.println("이름1"+p1.name+":"+p1.age+"살");
		System.out.println("이름2"+p2.name+":"+p2.age+"살");
		Product prod1 = new Product();
		prod1.pname="사과";
		Product prod2 = new Product();
		prod2.pname="바나나";
		System.out.println("물건1:"+prod1.pname);
		System.out.println("물건2:"+prod2.pname);
	}

}
