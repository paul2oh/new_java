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
//		w01.name = "�����";
//		w01.age = 27;
//		
//		Man1 m01 = new Man1();
//		m01.name = "������";
//		m01.woman=w01;
//		
//		System.out.println(m01.woman.name);
		
		Baby b = new Baby();
		b.name = "�ֱ�";
		b.birth = "�� ��";
		
		Mother m = new Mother();
		m.b = b;
		m.name = "�ֹ�";
		
		System.out.println("�Ʊ��̸� : " + b.name);
		System.out.println("���� : " + b.birth );
		
		System.out.println("���� : " + m.name);
		System.out.println("������ ���� ���� : " + m.b.birth);

	}

}
