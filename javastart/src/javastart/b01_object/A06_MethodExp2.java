package javastart.b01_object;

class BookStore2{
	String bname;//도서명
	int price; // 가격
	int cnt; // 갯수
	int tot; // 계
	String multiShow=""; // 전체출력내용
	int sum; // 합계
	void buyBook(String bname, int price, int cnt){
		this.bname = bname;
		this.price=price;
		this.cnt=cnt;
		tot =price*cnt;
		// 전체 총계 값을 누적..
		sum+=tot;
		// 단위 출력할 내용도 누적..
		multiShow+=bname+"\t"+price+"\t"+cnt+"\t"+tot+"\n";
	}
	void end(){
		System.out.println("\t도서 구매 내역");
		System.out.println(multiShow);
		System.out.println("계\t"+sum);
		sum=0;
		multiShow="";
	}
	
}
public class A06_MethodExp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookStore2 bs2 = new BookStore2();
		bs2.buyBook("java", 25000, 2);
		bs2.buyBook("jsp", 33000, 1); 
		bs2.end();
	}

}
