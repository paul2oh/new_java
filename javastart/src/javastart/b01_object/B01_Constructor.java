package javastart.b01_object;

class Student{
	// 메서드 오버로딩(overloading)
	//   생성자나 메서드 명이 같더라도 입력값의 type, 갯수, 순서만
	//   다르면 다른 메서드로 인식하여 선언이 가능하다.
	// 생성자를 여러개 쓰면..
	//   정의된 같은 변수나 메서드를 활용할 수 있어서,
	//   다른 객체를 선언하는 것보다 재사용면에서 효율적이다.
	// 일반 생성자는 return값이 없고, 전역변수의 초기 데이터를 설정할 때, 사용 된다.
	String name;
	int kor;
	Student(String s, int kor){
		name=s;
		this.kor=kor;
		/*
		System.out.println("입력값이 두개 있는 생성자 호출!");
		System.out.println("name:"+name);
		System.out.println("국어점수:"+kor);
		*/
	}
	Student(){
		// 초기로 null을 설정하고 싶지 않을 때..
		name="이름이 입력되지 않았습니다.";
		kor=59;
		/*
		System.out.println("입력값 없는 초기생성자 호출!");
		System.out.println("name:"+name);
		System.out.println("국어점:"+kor);
		*/
	}
	void print(){
		System.out.println("이름:"+name);
		System.out.println("국어점수:"+kor);
	}
}
public class B01_Constructor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 초기에 클래스에 생성자를 선언하지 않으면
		// 내부적으로 default 생성자로 입력값이 없는 생성자가
		// 호출되어 생성된다.
		// 사용자 정의 생성자가 만들어지는 순간,
		// 기존 default 생성자를 사라진다.
		// 같이 사용할려면, 정의하여야 한다.
		Student s1 =new Student();
		s1.print();
		Student s2 =new Student("하이맨",70);
		s2.print();
/*
1단계  생성자 활용하기.
CoffeeShop : menu(메뉴), cnt(주문수량)
내용 : 
이 커피샵에 가면, 일단, 어서오세요.. 주문 내용이 생성자를 통해서 호출되지 않으면.
아메리카노가 default로 한자 호출되어 처리된다.
1. default 생성자로 menu :아메리카노 한잔..
2. 입력값이 한개 있는 생성자 : 해당 메뉴를 입력받아  : @@@@ 한..
3. 입력값이 두개 있는 생생자 : 메뉴와 잔수를 입력받아 : @@@  @@ 잔 출력..


1) 
 * 
 * */		
	}

}
