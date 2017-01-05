package javastart.b02_array;

public class A02_StartExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		1단계
		 자판기에 메뉴가 4개가 있다.
		 이 메뉴의 가격을 출력하기 위해..
		 메뉴의 가격을 배열을 설정하여 출력하세요.
		 메뉴명(String[])도 같이 출력할까요?  (메뉴명과 가격을 저장하는 배열 2개를 만들고 출력하세요)
		 @@@   @@@  @@@   @@@   
		 3000  2000 1000  2000  
		*/
		String[] menus=new String[4];
		int[] prices=new int[4];
		menus[0]="콜라";
		menus[1]="사이다";
		menus[2]="환타";
		menus[3]="박카스";
		prices[0]=1200;
		prices[1]=1000;
		prices[2]=800;
		prices[3]=900;
		for(int idx=0;idx<menus.length;idx++){
			System.out.print(menus[idx]+"\t");
		}
		System.out.println();
		for(int idx=0;idx<prices.length;idx++){
			System.out.print(prices[idx]+"\t");
		}		
		/*
		2단계
		 4명의 친구가 0~5000 범위에서 사다리를 랜덤으로 게임을 만들었다.
		 이중, 각각의 금액을 출력하고, 가장 많은 금액은 낸 친구의 금액을 출력하세요(금액은100단위로)
		 1: @@@, 2: @@@, 3:@@@@, 4:@@@ 
		 최고 금액 :@@@@

		 */	
		System.out.println();
		int []pays=new int[4];
		int top=0;
		for(int idx=0;idx<pays.length;idx++){
			// 0~50  * 100  100단위처리..
			pays[idx]=(int)(Math.random()*51)*100;
			if(top<pays[idx]){
				top=pays[idx];
			}
			System.out.print((idx+1)+":"+pays[idx]+", ");
		}
		System.out.println("\n최고 금액:"+top);
	}

}
