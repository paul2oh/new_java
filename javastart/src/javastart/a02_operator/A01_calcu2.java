package javastart.a02_operator;

public class A01_calcu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
산술연산자 : +, -, *, /, %
 %:나머지 연산자 : 해당 데이터의 몫을 제외한 나머지 부분 처리
 * */
		//System.out.println("20%7="+(20%7));
/*
사과 50개를 3명에게 나누어 주기로 했습니다.
1명당 몇개를 나누어 주고, 나머지 @@개가 남는 것을 프로그램할려고 한다.
이 때, 과일 종류와 총갯수 나누어 줘야 할 사람 수를 args를 받아서
변동적으로 처리하는 프로그램을 만든다면..
 
과일 종류 : @@@
과일 갯수 : @@
나누어줄 인원 : @@@
1명당 나눌어 줄 과일 갯수 : @@@ 
나머지 갯수 :@@@ 
 * */	
		String fruitKind=args[0];
		int fruitCnt=Integer.parseInt(args[1]);
		int personCnt=Integer.parseInt(args[2]);
		int cntPerPerson=fruitCnt/personCnt;
		int cntMod=fruitCnt%personCnt;
		// sysout+ctrl+space : 단축키를 외우기전에 풀 코드 암기
		System.out.println("과일 종류 : "+fruitKind);
		System.out.println("과일 갯수 : "+fruitCnt);
		System.out.println("나누어줄 인원 : "+personCnt);
		System.out.println("1명당 나눌어 줄 과일 갯수 : "+cntPerPerson);
		System.out.println("나머지 갯수 : "+cntMod);
/*
 * 
아래형식의 내용을 args값으로 받아서 처리하세요.
@@@:args변수를 받아서처리
###:연산처리해서 나타나는 부분..

          성적관리 프로그램..
  	                   반 : @@@@ ex) 3-4반, 영어영문학과
NO 이름  국어  수학  영어  총점  평균(실수)     	        
## @@@ @@  @@  @@  ##  ###
## @@@ @@  @@  @@  ##  ###
 * */		
	}

}
