package javastart.a01_hello;

public class A03_calcu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
1. 변수들의 사칙연산 처리..
	변수들은 할당한 데이터를 특정한 요구에 의해 사칙연산 처리를 할 수 있다.
	ex) int sum= num01 + num02;
	사칙연산 처리 결과
	입력값 1 : @@@
	입력값 2 : @@@
	덧셈 : @@@
	뺄셈 : @@@
	나눗셈 : @@@
	곱셈 : @@@

 * 
 * */
		int num01=25;
		int num02=35;
		double num02Dbl=num02;
		num02=(int)num02Dbl; //(int)정수type으로  casting 합니다.
		int sum=num01+num02; // 덧셈 결과
		
		int min=num01-num02; // 뺄셈 결과
		double div=num01/num02Dbl; // 나눗셈 결과
		// 정수/정수 ==> 정수  값이 실수할당 하기 때문에 단지 .0 붙을 뿐
		// 두 정수변수 중, 하나이상이 실수이어야 실수값이 정상적으로 처리 된다.
		int mul=num01*num02; // 곱셈 결과
		System.out.println("사칙연산 처리 결과");
		System.out.println("입력값 1 : "+num01);
		System.out.println("입력값 2 : "+num02);
		System.out.println("덧셈 :"+num01+"+"+num02+"="+sum);
		System.out.println("뺄셈 :"+num01+"-"+num02+"="+min);
		System.out.println("나눗셈 :"+num01+"/"+num02+"="+div);
		System.out.println("곱셈 :"+num01+"*"+num02+"="+mul);
//2. 문자열 add 처리..
		System.out.println("안녕"+"맨");
		String addName="홍";
		addName=addName+" 길동";
//   문자열은 + 기호를 통해서 문자열과 문자열을 이어준다.
//   +기호를 통해서 문자열을 이어주는 역할을 하지, 
//		사칙연산 처리가 되지 않는다.
		
		
		
	}

}
