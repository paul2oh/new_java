package javastart.a05_loop;

public class A03_forExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price=0;
		int cnt=0;
		// 총합계을 처리할려면??
		int tot=0;
		for(int idx=0;idx<args.length;idx++){
			System.out.print(args[idx]+"\t");
			if(idx%3==1){
				// 단가
				price = Integer.parseInt(args[idx]);
			}
			if(idx%3==2){	// 0 : 과일명 1:단가  2:수량 
							//  %이용해서 수량일 때 줄바꿈 처리..
				// 수량
				cnt  = Integer.parseInt(args[idx]);
				System.out.println((price*cnt)); // /t 계를 출력
				tot+=(price*cnt); // 계를 누적시켜 처리..
			}
		}
		System.out.println("\t총계:"+tot);
		
	}

}
