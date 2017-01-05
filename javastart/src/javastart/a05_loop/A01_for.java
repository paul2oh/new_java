package javastart.a05_loop;

public class A01_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
for(초기값;한계값;증감){
	반복처리할 구문..
}* */
		for(int cnt=3;cnt<=20;cnt+=5){
			System.out.print(cnt+"번째\t");
		}
		System.out.println();
/*
 * 구구단 처리..
 * 2 * 1 = 2   @@ * @@ = ##
 * 2 * 2 = 4
 * 2 * 3 = 6
 * */		
		int grade=2;
		System.out.println("    "+grade+"단");
		for(int num=1;num<=9;num++){
			System.out.println(grade+" * "+num+" = "+(grade*num));
		}
/* 1단계
 	1) 5 ~ 20 까지 1단위로 증가시켜 출력하세요.   ex) 5 6 7 8...
 	2) 30 ~ 100 까지 5단위로 증가시켜 출력하세요. ex) 30 35 40 45
 	3) 1000 부터 900까지 2씩 감소시켜 출력하세요. ex) 1000 998 996
*/
		for(int cnt=5;cnt<=20;cnt++){
			System.out.print(cnt+" ");
		}
		System.out.println();
		for(int cnt=30;cnt<=100;cnt+=5){
			System.out.print(cnt+" ");
		}		
		System.out.println();
		for(int cnt=1000;cnt>=900;cnt-=2){
			System.out.print(cnt+" ");
		}		
/*   2단계 : if문 활용, \n, \t 활용..
    1) 구구단 전체를 다음과 같은 형식으로 출력하세요.
       2단    3단        4단       5단  .....  9단
      2*1=2  3*1=3  4*1=4  5*1=5        9*1=9
      2*2=4  3*2=6  4*2=8  5*2=10       9*2=18
      2*3=6  3*3=9  4*3=12 5*3=15       9*3=27
      ....
      ..
*/		
		System.out.println();
		for(grade=2;grade<=9;grade++)
		System.out.print(grade+"단\t");
		System.out.println();
		for(int cnt=1;cnt<=9;cnt++){
			for(grade=2;grade<=9;grade++)
				System.out.print(grade+"*"+cnt+"="+(grade*cnt)+"\t");
			System.out.println();
		}
/**/		
		for(grade=2;grade<=9;grade++)
		System.out.print(grade+"단\t");	
		System.out.println();
		for(int cnt=1;cnt<=9;cnt++){
			for(grade=2;grade<=9;grade++){
				System.out.print(grade+"*"+cnt+"="+(grade*cnt)+"\t");
			}	
			// 줄바꿈처리..
			System.out.println();
		}
	}

}
