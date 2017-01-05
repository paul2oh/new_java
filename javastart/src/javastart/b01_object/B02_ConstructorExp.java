package javastart.b01_object;

class CoffeeShop{
	String menu;
	int cnt;
	CoffeeShop(){
		menu="아메리카노";
		cnt=1;
	}
	CoffeeShop(String menu){
		this.menu=menu;
		cnt=1;

	}	
	CoffeeShop(String menu, int cnt){
		this.menu=menu;
		this.cnt=cnt;

	}
	void print(){
		System.out.println("어서오세요~~");
		System.out.println(menu+" "+cnt+ "잔 입니다.");		
	}
}
public class B02_ConstructorExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeShop c1 = new CoffeeShop();
		c1.print();
		CoffeeShop c2 = new CoffeeShop("카푸치노");
		c2.print();
		CoffeeShop c3 = new CoffeeShop("라떼",3);
		c3.print();
	}

}
