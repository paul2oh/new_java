package javastart.a02_operator;

public class A07_tripleOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
3항연산자 : 조건처리의 결과물을 한라인에서 true, false값에 따라
바로 처리하고자 할 때, 쓰이는 연산자

(조건/논리연산자) ? true일때처리결과물 : false일때처리결과물
ex)  pt >= 70 ? "합격" : "불합격";
변수에 할당도 가능하다.
    String isPass=pt >= 70 ? "합격" : "불합격"; 
	할인율 계산..8~18일때, 20%, 그외는 0%
	double disRator=(age >= 8 && age <= 18) ? 0.2:0.0;

 * */	
		int pt=70;
		String isPass=pt >= 70 ? "합격" : "불합격"; 
		System.out.println("결과:"+isPass);
		int age=15;
		double disRator=(age >= 8 && age <= 18) ? 0.2:0.0;
		System.out.println("할인율:"+(int)(disRator*100)+"%");
/*
 확인예제.
 3항연산자를 활용하여, 
 학점 평가를 하세요.
 점수을 입력받아 아래와 같은 조건에서 결과를 출력하세요.
 90이상  A, 80~89 : B, 70~79 : C, 60~69 : D, 60미만 :F
 
 획득점수 : @@@
 학점등급 : ##
 
 * */		
		int inputPt=80;
		String grade=inputPt>=90?"A":
			         inputPt>=80?"B":   
			         inputPt>=70?"C":   
			         inputPt>=60?"D":   
			         inputPt<60?"F": "등급외";
		System.out.println("획득점수:"+inputPt);
		System.out.println("학점등급:"+grade);		
		
		
		
	}

}
