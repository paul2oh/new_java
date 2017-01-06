package javastart.b01_object;

/*
 * 객체 vs 객체 두번째 이야기
 * 1. 객체를 메서드를 통해서 넘기기..
 * 
 * Man
 * 		속성: Friend , 이름
 * 
 * Friend
 * 		속성: 이름, 나이
 * 
 * 2. 메서드를 통해서 객체 넘기기.
 *    public void setFriend(Friend f)
 *    메서드는 일반적으로 public 접근제어자로 모든 객체에 접근가능
 * 	  void : return 값이 없을때, 데이터 저장이나, 프로세서만 처리할 때 사용.
 * 		set대문자시작@@ : 저장하는 메서드를 쓸 때, 일반적인 형식 set 으로 시작하여
 * 						대문자로 시작하는 기능 내용을 선언한다.
 * 	  Friend f : 외부에서 객체가 들어올때, 저장하는 객체 단위, 지역변수로 사용한다.
 * 		this.f = f : 전역변수(this는 일반적으로 현재클래스의)에 지역변수를 할당처리하는 내용
 * 3. Main 메서드를 통해서 실제 객체 생성을 통한 전달..
 * 	  Man m01 = new	 Man();
 *    Friend f = new Friend();
 *    m01.setFriend(f); //실제 객체가 생성되고 , class에서 정의한 메서드에 맞는 type의 객체를 전달한다.
 */
// 하나의 파일에는 public class 는 하나만 만들어야 되기 때문에, 다른 클래스는 생략처리한다..
// 일반적으로 public으로 선언된 클래스명과 파일명이 동일 
class Man02{
	private String name;
	private Friend01 friend;
	public void setName(String name) {
		this.name = name;
	}
	public void setFriend(Friend01 friend) {
		this.friend = friend;
	}
	public void introMyFriend(){
		System.out.println("내이름은"+name+"입니다.");
		System.out.println("내 친구를 소개합니다.");
		friend.showAll();
	}
}
class Friend01{
	private String name;
	private int age;
	public Friend01(){}
	
	
	public Friend01(String name, int age) {
		super();//이 클래스를 상속한느 상위클래스를 말하며 일반적으로
				//모든 클래스의 최상위 클래스인 Object 클래스를 말한다.
				//Object클래스의 기본생성자();를 호출..
				//자동 소스 gen으로 생성됨..
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void showAll(){
		System.out.println("이름은"+name+"이며,나이는"+age+"살 입니다." );
	}
	
}
public class C03_Obj_SendObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Friend01 f = new Friend01("박친구",28);
			f.showAll();
			Man02 m = new Man02();
			m.setName("김길동");
			m.setFriend(f);//Man02객체에 setFriend를 통해 Friend01 객체를 할당..
			m.introMyFriend();
		/*
		 * 확인예제..
		 * BookStore
		 * 	전역변수 : 서점명, Book
		 * 	메서드 : 서점명을 저장하는 메서드
		 * 			Book을 저장하는 메서드
		 * 			출력메서드
		 * 			@@@ 서점에 가서,
		 * 			도서명, 가격, 갯수를 구매햐였다.
		 * Book	
		 *  전역변수 : 도서명, 가격, 갯수
		 *  메서드 : 출력메서드
		 *  		도서명, 가격,갯수를 구매하였다.
		 */
		
	}//main

}
