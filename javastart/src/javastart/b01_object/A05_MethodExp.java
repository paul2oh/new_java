package javastart.b01_object;

class BookStore{
	String bname;//도서명
	int price; // 가격
	int cnt; // 갯수
	int tot; // 계
	int buyBook(String bname, int price, int cnt){
		this.bname = bname;
		this.price=price;
		this.cnt=cnt;
		tot =price*cnt;
		return tot;
	}
	void showCalcu(String bname, int price, int cnt){
		// 데이터 호출을 통해서 전역변수활용..
		buyBook(bname, price,cnt);
		System.out.println(bname+"  단가 "+price+"  "+cnt+"권  총 : "+tot);
		/*
		System.out.println(bname+"  단가 "+price+"  "+cnt+"권  총 : "+
		buyBook(bname, price,cnt));
		*/
	}
	
}
public class A05_MethodExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookStore bs = new BookStore();
		bs.showCalcu("java입문", 25000, 2);
	}

}
