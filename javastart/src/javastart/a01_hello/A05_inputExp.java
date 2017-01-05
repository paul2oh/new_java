package javastart.a01_hello;

public class A05_inputExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		입력값을 args로 받아서..
		숫자 3개를 받아서  다음과 같은 결과물을 처리한다.
		args  사과갯수  바나나갯수  딸기갯수

		과일의 갯수
		사과 : @@@
		바나나 : @@@
		딸기 : @@@
		총갯수 : @@@
		
		[5,7,13] ==> args[0]:5, args[1]:7, args[2]:13
		 * */
		int appleCnt=Integer.parseInt(args[0]);
		int bananaCnt=Integer.parseInt(args[1]);
		int strawCnt=Integer.parseInt(args[2]);
		int tot=appleCnt+bananaCnt+strawCnt;
		// ctrl+s :저장 단축키..
		System.out.println("과일의 갯수");
		System.out.println("사과 : "+appleCnt);
		System.out.println("바나나 : "+bananaCnt);
		System.out.println("딸기 : "+strawCnt);
		System.out.println("총갯수 : "+tot);
		
		
		
	}

}
