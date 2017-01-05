package javastart.a02_operator;

public class A05_alloOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
대입연산자 : 데이터를 할당할 때, 쓰이는 연산자를 말한다.
기본  int age=24;

기본 데이터에 다시 데이터를 누적하여 할당 할때.
age += 10;
cf) -=, *=, /=, %= 

현재 사과의 갯수에서 3회 10개씩 누적시킨 총 갯수를 출력하세요.
 * */
		 int appleCnt=25;
		 appleCnt+=10;
		 System.out.println("1회 후, 총 사과갯수:"+appleCnt);
		 appleCnt+=10;
		 System.out.println("2회 후, 총 사과갯수:"+appleCnt);
		 appleCnt+=10;
		 System.out.println("3회 후, 총 사과갯수:"+appleCnt);
		 /*
		 곰돌이 3마리에게 현재 오렌지 3, 5, 6 개를 초기에 나누어 주었다.
		 3회 7개씩 나누어 준 후,  곰돌이 3마리가 가지고 있는 총 오렌지 갯수를 
		 계산하는 프로그램을 만들어 보세요..
		 출력..
		      곰돌이1  곰돌이2  곰돌이3   계
		 1회    @@@     @@@      @@@     ## 
		 2회    @@@     @@@      @@@     ## 
		 3회    @@@     @@@      @@@     ## 
		  * */
		 	int bear1OrgCnt=3;
		 	int bear2OrgCnt=5;
		 	int bear3OrgCnt=6;
		 	int tot=0;
		 	int cnt=1;
		 System.out.println("\t곰돌이1\t곰돌이2\t곰돌이3\t계");
		 bear1OrgCnt+=7;
		 bear2OrgCnt+=7;
		 bear3OrgCnt+=7;
		 tot=bear1OrgCnt+bear2OrgCnt+bear3OrgCnt;
		 System.out.println((cnt++)+"회\t" + bear1OrgCnt
				 					 +"\t" + bear2OrgCnt
				 					 +"\t" + bear3OrgCnt +"\t"+tot);
		 bear1OrgCnt+=7;
		 bear2OrgCnt+=7;
		 bear3OrgCnt+=7;
		 tot=bear1OrgCnt+bear2OrgCnt+bear3OrgCnt;
		 System.out.println((cnt++)+"회\t" + bear1OrgCnt
				 					 +"\t" + bear2OrgCnt
				 					 +"\t" + bear3OrgCnt +"\t"+tot);
		 bear1OrgCnt+=7;
		 bear2OrgCnt+=7;
		 bear3OrgCnt+=7;
		 tot=bear1OrgCnt+bear2OrgCnt+bear3OrgCnt;
		 System.out.println((cnt++)+"회\t" + bear1OrgCnt
				 					 +"\t" + bear2OrgCnt
				 					 +"\t" + bear3OrgCnt +"\t"+tot);	
/*  증감 연산자.
 * 데이터를 1단위로 증감시키는 연산자를 말한다.
 * cnt++ : 현재데이터를 1단위를 증가시킨다. 단, 증가는 다음 라인에 증가가 된다.
 * ++cnt : 현재데이터를 1단위를 증가시키는데, 현재 라인에서 증가된다.
 * cf) cnt--, --cnt 
 * 
 * */		 
		 int fruitCnt=1;
		 System.out.println("과일의 갯수 다음 프로세스 증가:"+(fruitCnt++));
		 System.out.println("과일의 갯수 현재 프로세스 증가:"+(++fruitCnt));
		 
	}

	
	
}
