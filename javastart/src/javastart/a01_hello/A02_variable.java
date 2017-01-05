package javastart.a01_hello;

public class A02_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
변수 : 특정한 데이터에 따라서 결과물이 다르게 처리될 때,
     사용하는 데이터형태..
     크게 문자열을 저장하는 데이터 : String, char : 글자한자
       숫자를 저장하는 데이터 : int, double
 * */
/*
프로그램 예제..
입력한 이름과 나이를 아래 형식으로 출력하세요..
==========
이름 : @@@@
나이 : @@@@
==========
 * 
 * */		
// 변수는 type선언 이 변수의 이름을 정하며,
// 특정data를 할당한다.
// type이 지정되면 할당할 수 있는 데이터만 넣어야 된다.
// 변수는 변경이 가능하고, 재활용을 할 수 있다.		
		String name="홍길동";
		int age=24;

		
		System.out.println("==========");
		System.out.println("이름 : "+name+"");
		System.out.println("나이 : "+age);
		System.out.println("==========");
		name="신길동";
		System.out.println("이름 : "+name+"");
/*
확인예제..
변수를 활용하여, 
사는 곳, 이름, 졸업연도를 아래 형식으로 출력하세요..

------------
내가 사는 곳은 @@@@@ 이며,
이름은 @@@ 입니다.
최종학력 졸업연도가 @@@ 년도 입니다.
------------  
 * */
		String address="서울 강남";
		// 동일한 이름의 변수는 같은 프로그램 내에서 선언하지 못한다.
		// String name ==> String name01
		String name01="마길동";
		int graYear=2016;
		System.out.println("------------");
		System.out.println("내가 사는 곳은 "+address+" 이며,");
		System.out.println("이름은 "+name01+" 입니다.");
		System.out.println("최종학력 졸업연도가 "+graYear+" 년도 입니다.");
		System.out.println("------------");		
	}

}
