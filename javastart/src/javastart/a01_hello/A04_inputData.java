package javastart.a01_hello;

public class A04_inputData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num01=args[0];
		String num02=args[1];
		System.out.println(num01+" + "+ num02);
		System.out.println("합:"+num01+num02);
		// Integer.parseInt:숫자형태문자열을 숫자로 변환
		int num01Int=Integer.parseInt(num01);
		int num02Int=Integer.parseInt(num02);
		int sum=num01Int+num02Int;
		System.out.println("합:"+sum);
/*
입력값을 args로 받아서..
숫자 3개를 받아서  다음과 같은 결과물을 처리한다.
args  사과갯수  바나나갯수  딸기갯수

과일의 갯수
사과 : @@@
바나나 : @@@
딸기 : @@@
총갯수 : @@@

 
 
 * */		
		
		
		
	}

}
