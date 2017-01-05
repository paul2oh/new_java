package javastart.a05_loop;

public class A09_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사과를 10개 
		/*  while( 조건 ){
		 *     반복할 구문 처리...
		 * }
		 * */
		int appleCnt=0;
		while(appleCnt <10){
			appleCnt++;
			if(appleCnt==5){
				System.out.println("5개는 제외");
				continue;
			}
			System.out.println("사과 "+appleCnt+"개를 구매하였습니다.");	
		}
		/* do{
		 *   반복할 프로세스나 구문,
		 *   조건이 맞지 않더라도 1번은 출력되게 처리..
		 * }while(조건);
		 * 
		 * */
		int visitCnt=1;
		do{
			System.out.println("홍길동 은행 방문!!"+(visitCnt++)+"회!!");
			
		}while(visitCnt<=0);
		System.out.println(" 종료!!!!");
		
	}

}
