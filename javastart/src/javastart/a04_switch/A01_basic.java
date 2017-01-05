package javastart.a04_switch;

public class A01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
switch문...
선택으로 지정된 데이터가 param값(외부에서 입력)으로 입력될 때, 
case에 따라 다른 처리를 할 수 있게 도와주는 분기문.

switch( param값 ){  //param값은 일반적으로 정수형태, 
                       문자열도 jdk버젼에 따라 입력이 가능하다.
                       ex) int cho=4;
                           switch( cho )
	case param값이 특정1값으로 올 때:
	   처리할 프로세스..... break; // 프로세스가 끝날 때, break를 표시
	case param값이 특정2값으로 올 때:
	   처리할 프로세스..... break; // 프로세스가 끝날 때, break를 표시
	default:  상위에 지정된 값이 없을 때,
	          처리할 프로세스   

}
switch case문에서는 break가 나타나기 전까지는 계속 하위 프로세스를
진행 시킨다.
 * 
 * */
		int choiceBtn=3; // 2번 버튼을 클릭했을 때,
		System.out.println("클릭한 버튼 번호:"+choiceBtn);
		switch( choiceBtn ){
			case 1 :     // 만일에 1번 버튼을 클릭하였을 때,
				System.out.println("1번 구역 점등");  // 처리할 프로세스
				break;  // case 1이 종료가 됨을 의미..
			case 2 :    // 만일에 2번 버튼을 클릭하였을 때,
				System.out.println("2번 구역 점등");  // 처리할 프로세스
				break;  // case 2이 종료가 됨을 의미.. 
			case 3 :    // 	만일에 2번 버튼을 클릭하였을 때,
				System.out.println("모든 구역 소등");
				break;
			default :   // 위에 지정된 case 이외에 버튼이 클릭되었을 때,
				System.out.println("지정된 버튼이 아닙니다.");
		}
		System.out.println("The end!!!^^");
/*
확인예제.
1단계
  맥도널드에 가서..
  주문번호를 말씀하시면 주문내용이 나옵니다.
  메뉴
  1. 새우버그 4000원
  2. 불고기버그 5000원
  3. 치즈버그  4500원
  그 외는 여기서 더 이상 1단계이기 때문에 팔지 않습니다.
 */
		System.out.println("맥도널드에 가서..");
		System.out.println("주문번호를 말씀하시면 주문내용이 나옵니다...");
		System.out.println("메뉴..");
		System.out.println("1. 새우버그 4000원");
		System.out.println("2. 불고기버그 5000원");
		System.out.println("3. 치즈버그  4500원");
		
		int choNum=3;
		System.out.println("주문하신 번호:"+choNum);
		switch(choNum){
			case 1 : System.out.println("1. 새우버그 4000원"); break;
			case 2 : System.out.println("2. 불고기버그 5000원"); break;
			case 3 : System.out.println("3. 치즈버그  4500원"); break;
			default : System.out.println("그 외는 여기서 더 이상 1단계이기 때문에 팔지 않습니다.");
		}
		
		/*
2단계 hint - /-정수이하로 처리하면 소숫점 이하가 처리, %(나머지) 활용 
  3과목에 대한 점수을 입력 받아,
  그 평균 점수에 따라 
  학점 A, B, C, D, F 등급을 나타낸다. 
  출력..
  국어 : @@
  영어 : @@
  수학 : @@
  평균 : @@ 75
  총 평균 학점 : @@ (A, B, C, D, F)
 * */		
		int kor=75;
		int eng=80;
		int mat=90;
		int avg=(kor+eng+mat)/3;
		System.out.println(avg/10);// 100 ==>10, 99~90 => 9
                                   // 89~80 ==> 8, 79~70 ==> 7		
		System.out.println("평균:"+avg);
		
		String grade="";
		switch(avg/10){
			case 10 : 
			case 9 : grade="A"; break;
			case 8 : grade="B"; break;
			case 7 : grade="C"; break;
			case 6 : grade="D"; break;
			case 5 : 
			case 4 : 
			case 3 : 
			case 2 : 
			case 1 : 
			case 0 : grade="F"; break;
			default : System.out.println("범위에서 벗어난 데이터 입니다.");
		}		
		System.out.print("학점:"+grade);
		
		// 0~5 %10   /6
		/*
		System.out.println();
		switch(pt/10/6){
		}
		*/
		
	}

}
