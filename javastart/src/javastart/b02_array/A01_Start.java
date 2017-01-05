package javastart.b02_array;

public class A01_Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 선언        =   배열 객체 할당
		// type[] 배열이름  =   new type[배열의 크기];
		int [] prodCnts=new int[5];
		/// 글자입력ctrl+space
		prodCnts[0]=5; //ctrl+alt+화살표아래 줄복사
		prodCnts[1]=8; 
		prodCnts[2]=9; 
		prodCnts[3]=5; 
		prodCnts[4]=3; 
		//prodCnts[5]=2; 크기가 5개일 배열은 index가 4까지 있기에 에러발생
		// 배열이름.length : 배열의 크기
		for(int idx=0;idx<prodCnts.length;idx++){
			System.out.println((idx+1)+"번째 값:"+prodCnts[idx]+(int)(Math.random()*10));
		}
/*
1단계
 자판기에 메뉴가 4개가 있다.
 이 메뉴의 가격을 출력하기 위해..
 메뉴의 가격을 배열을 설정하여 출력하세요.
 메뉴명(String[])도 같이 출력할까요?  (메뉴명과 가격을 저장하는 배열 2개를 만들고 출력하세요)
 @@@   @@@  @@@   @@@   
 3000  2000 1000  2000  
2단계
 4명의 친구가 0~5000 범위에서 사다리를 랜덤으로 게임을 만들었다.
 이중, 각각의 금액을 출력하고, 가장 많은 금액은 낸 친구의 금액을 출력하세요(금액은100단위로)
 1: @@@, 2: @@@, 3:@@@@, 4:@@@ 
 최고 금액 :@@@@

 */		

		
		
	}

}
