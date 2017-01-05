package javastart.a02_operator;

public class A04_ComparOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
비교연산자 : 조건을 통해 해당 프로세스를 분기할 때, 쓰이는 연산자를 말한다..
종류: a == b, a > b, a >= b, a < b, a <= b, a != b, a != b(a <> b)
 * 
 * */
/*
바나나의 갯수와 딸기의 갯수가 같을 때, true값을 출력하세요..
 * 
 * */		
		int bananaCnt = 5;
		int strawCnt = 7;
		System.out.println("바나나와 딸기 갯수가 같은지?"+(bananaCnt==strawCnt));
// boolean 값 : 비교연산자나 특정 조건을 변수로 활용하여 사용하고자 할 때 쓰이는 data type
// 초기 값은 false
		boolean isEqual=false;
		isEqual=bananaCnt!=strawCnt;
		System.out.println("같지 않지?"+isEqual);
		
	}

}
