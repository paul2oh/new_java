package javastart.a05_loop;

import java.util.Scanner;

public class A07_breakExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade=Integer.parseInt(args[0]);
		int bknum=Integer.parseInt(args[1]);
		for(int cnt=1;cnt<10;cnt++){
			if(cnt==bknum){
				break;
			}
			System.out.println(grade + " * " + cnt+" = "+(grade*cnt));
		}
		// System.in  :  자바의 기본 입력..s.nextInt() 정수값을 입력 받음..
		Scanner s = new Scanner(System.in);
		int chNum=0;
		for(;;){
			System.out.println("메뉴를 선택하세요!!");
			System.out.println("1. 한식");
			System.out.println("2. 일식");
			System.out.println("3. 중식");
			System.out.println("0. 종료처리");
			chNum=s.nextInt();
			if(chNum==1){
				System.out.println("한식 선택");
			}else if(chNum==2){
				System.out.println("일식 선택");
			}else if(chNum==3){
				System.out.println("중식 선택");
			}else if(chNum==0){
				System.out.println("종료~~");
				break;
			}else {
				System.out.println("해당 주문번호가 없습니다.");
			}
		}
		System.out.println("주문 완료!!");
	}

}
