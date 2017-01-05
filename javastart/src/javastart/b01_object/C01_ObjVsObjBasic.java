package javastart.b01_object;

class Woman1{
	String name;
	int age;
	
	Woman1(){
		System.out.println("default!");
	}
}

class Man1{
	String name;
	Woman1 woman;
}

class Baby{
	String name;
	String birth;
}

class Mother{
	Baby b;
	String name;
}

public class C01_ObjVsObjBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Woman1 w01 = new Woman1();
//		w01.name = "김고은";
//		w01.age = 27;
//		
//		Man1 m01 = new Man1();
//		m01.name = "김재진";
//		m01.woman=w01;
//		
//		System.out.println(m01.woman.name);
		
		Baby b = new Baby();
		b.name = "애기";
		b.birth = "그 때";
		
		Mother m = new Mother();
		m.b = b;
		m.name = "애미";
		
		System.out.println("아기이름 : " + b.name);
		System.out.println("생일 : " + b.birth );
		
		System.out.println("엄마 : " + m.name);
		System.out.println("엄마의 애의 생일 : " + m.b.birth);

	}

}
