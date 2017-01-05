package javastart.a05_loop;

public class A02_forExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 for문 활용..
 1. 배열과 함께 데이터 입력처리..
    배열 length :배열의 크기를 출력..
 2. 배열은 [index] 로 접근할 수 있다.
    3개의 크기배열,   0, 1, 2 까지 가질수 있다.  
 * */
		System.out.println("입력된 데이터크기:"+args.length);
		// 0부터 시작해서 배열의 크기보다 1작을 때까지 가져온다.
		for(int idx=0;idx<args.length;idx++){
			// 홀수 배열의 데이터만 가져오고 싶다.
			if(idx%2==1)
				System.out.println("배열 args["+idx+"]:"+args[idx]);
		}
		
		
	}

}
