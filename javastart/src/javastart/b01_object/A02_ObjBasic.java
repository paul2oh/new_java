package javastart.b01_object;

import java.util.Scanner;

class Prod{
	String name;
	int price;
	int cnt;
	int tot;
}
public class A02_ObjBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1단계
		 * 물건 3개에 데이터를 할당하고,
		 * 아래 형식으로 출력하세요.
		 *    현재고 리스트
		 NO  물건명  단가  갯수  계
		 1   @@@@    3000    2   6000
		 2   @@@     4000    3  12000
		 3   @@@@    5000    1   5000
		 */
		Prod p1 = new Prod();
		Prod p2 = new Prod();
		Prod p3 = new Prod();
		p1.name="사과";	p1.price=3000; p1.cnt=3;
		p2.name="오렌지";	p2.price=5000; p2.cnt=2;
		p3.name="딸기";	p3.price=8000; p3.cnt=1;
		int cnt=1;
		System.out.println("현재고 리스트");
		System.out.println("NO\t물건명\t단가\t갯수\t계");
		System.out.println((cnt++)+"\t"+p1.name+"\t"+p1.price+"\t"+p1.cnt+"\t"+(p1.price*p1.cnt));
		System.out.println((cnt++)+"\t"+p2.name+"\t"+p2.price+"\t"+p2.cnt+"\t"+(p2.price*p2.cnt));
		System.out.println((cnt++)+"\t"+p3.name+"\t"+p3.price+"\t"+p3.cnt+"\t"+(p3.price*p3.cnt));
		
/*
		2단계
		Scanner 객체를 이용하여..
		점심 식사를 주문하고, 주문된 내용을 결재처리하는 내용 

		## 출력내용..
		@@@ 식당에 오신것을 환영합니다.
		메뉴
		1. 짜장면 - 4500
		2. 짬뽕   - 6000
		3. 탕수육 - 12000
		0. 종료

		주문 번호 입력:
		주문 수량 입력:

		0.을 눌렀을 때..
		현재 주문 내용을 list하고..
		총 비용 계산처리..*/
		System.out.println("행복관에 오신것을 환영합니다.");
		Scanner s = new Scanner(System.in);
		int chnum=0; // 선택한 주문번호
		int price=0; // 가격
		int count=0; // 갯수
		int no=1;    // numbering
		int totall=0; // 전체총계
		Prod p=null; // 객체 초기 선언..
		String chMenu="";
		String show="NO\tMENU\t단가\t갯수\t계\n";  // 화면에 전체내용을 출력하기 위해.
		while(true){
			p=new Prod();  // 객체를 할당.. 한메모리에 객체를 할당하기 위해..
			System.out.println("메뉴");
			System.out.println("1. 짜장면 - 4500");
			System.out.println("2. 짬뽕   - 6000");
			System.out.println("3. 탕수육 - 12000");
			System.out.println("0. 종료");
			System.out.print("주문 번호 입력:");
			chnum=s.nextInt();

			if(chnum==1) {price=4500; chMenu="짜장면";}
			if(chnum==2) {price=6000; chMenu="짬뽕";}
			if(chnum==3) {price=12000; chMenu="탕수육";}
			if(chnum==0) break;
			p.name=chMenu;
			p.price=price;
			
			System.out.print("주문갯수:");
			count=s.nextInt();
			p.cnt=count;
			p.tot=p.price*p.cnt;  //  단위 계
			totall+=p.tot;    // 총계 누적처리..
			// 주문내용을 show문자열에 누적처리..
			show+=(no++)+"\t"+p.name+"\t"+p.price+"\t"+p.cnt+"\t"+p.tot+"\n";
		}
		System.out.println("=== 계산서 ===");
		System.out.println(show);
		System.out.println("총 계:"+totall);
		
		
	}

}
