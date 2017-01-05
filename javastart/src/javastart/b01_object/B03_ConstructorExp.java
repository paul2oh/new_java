package javastart.b01_object;

class CoffeeShop2{
	String menu;
	int cnt;
	int price;
	int tot;
	int discnt;
	CoffeeShop2(){
		menu="아메리카노";
		cnt=1;
		System.out.println("어서오세요~~");

	}
	CoffeeShop2(String menu){
		this();// 클래스명과 같은 생성자 중, 입력값이 없는 생성자 호출.
		this.menu=menu;
	}	
	CoffeeShop2(String menu, int cnt){
		this(menu);// 클래스명과 같은 생성자 중, 입력값이 하나 있는 생성자 호출.
		this.cnt=cnt;
	}
	int calcu(){
		if(menu.equals("아메리카노")){
			price=3000;
		}else if(menu.equals("카푸치노")){
			price=4000;
		}else if(menu.equals("라떼")){
			price=4500;
		}
			
		tot=price*cnt;
		return tot;
	}
	void dis10(){
		calcu();
		tot=tot-(int)(tot*0.1);
		discnt=10;
		prn();
		
	}
	void dis20(){
		calcu();
		tot=tot-(int)(tot*0.2);
		discnt=20;
		prn();
	}
	void dis30(){
		calcu();
		discnt=30;
		tot=tot-(int)(tot*0.3);
		prn();
	}
	void prn(){
		System.out.println(menu+", "+price+", "+ cnt+"잔" + " 할인 "+discnt+"% 계산금액:"+tot+"원"); 
				
	}
}
public class B03_ConstructorExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeShop2 c1 = new CoffeeShop2();
		c1.dis10();
		CoffeeShop2 c2 = new CoffeeShop2("카푸치노");
		c2.dis20();
		CoffeeShop2 c3 = new CoffeeShop2("라떼",3);
		c3.dis30();		
	}

}
