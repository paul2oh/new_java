package javastart.a05_loop;

public class A06_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
break : 반복문에서 프로세스를 중단하고자 할 때, 사용된다.
   일반적으로 조건문과 함께 하여, 해당 조건에 해당할 때,
  프로세스를 중단시킨다..
 * */
		// 3단에서  3 * 5 = 15 를 생략하고자 한다..
		System.out.println("break인 경우..");
		for(int cnt=1;cnt<=9;cnt++){
			//System.out.println("3 * "++" = "+);
			if(cnt==5){
				break; // 해당 프로세스를 중단시킨다..
			}
			System.out.println( 3 + " * "+ cnt + " = " + (3*cnt));
		}
		/*
		continue : 반복문에서 특정 프로세스만 중단시키고, 그 다음 프로세스를
		 진행하고자 할 때 쓰임..
		 * */		
		System.out.println("continue인 경우..");
		for(int cnt=1;cnt<=9;cnt++){
			//System.out.println("3 * "++" = "+);
			if(cnt==5){
				continue; // 해당 프로세스를 중단시킨다..
			}
			System.out.println( 3 + " * "+ cnt + " = " + (3*cnt));
		}	
/*
확인예제..
1단계
	변수로 특정 구구단의 단수를 입력받은 후,  args 5 7
	ex) int grade = 5; // args[0]값으로 받음
	중단해야 할  number 5 * 7 = 25   7 // args[1]값으로 받음. 
2단계 <프로그램 경험 있는 분만..>
	Scanner s = new Scanner(System.in);
	으로 외부데이터  s.nextInt() :데이터를 숫자..입력 받음..
	for(;;) 무한 루프처리..
	메뉴를 선택하세요.
	1. 한식
	2. 일식
	3. 중식
	0. 종료처리..	
	1을 입력했을 때,	한식주문
	3을 입력했을 때, 중식주문
	0을 입력했을 때, 주문완료..   기타입력 : 주문번호가 없습니다.
	
 * 
 * */		
	}



}
