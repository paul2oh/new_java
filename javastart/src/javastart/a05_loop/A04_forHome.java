package javastart.a05_loop;

public class A04_forHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
### homework
1. 단계
데이터 args로 아래와 같은 데이터가 있다.
급여  3000000   0  마트   0  100000  옷구매  0  50000 알바 100000  0
 1) 수입/지출 항목을 출력하세요..
 2) 총수입액을 출력하세요..
*/
		int tot=0;
		System.out.println("\t수입/지출항목(1단계)");
		for(int idx=0;idx<args.length;idx++){
			if(idx%3==0)
			System.out.println(args[idx]);
			if(idx%3==1)
				tot+=Integer.parseInt(args[idx]);
		}
		System.out.println("총수입액:"+tot);
		/*
2. 단계  ==> 3단  0 
위 데이터를 아래의 형식을 출력하세요.
급여  3000000   0  마트   0  100000  옷구매  0  50000 알바 100000  0

가계부
no   항목     수입액   지출액    현잔액
1    급여     3000000     0    3000000
2    마트             0  100000   2900000
*/		
		tot=0;
		int income=0;
		int spend=0;
		System.out.println("\t수입/지출항목(2단계)");		
		System.out.println("no\t항목\t수입액\t지출액\t현잔액");		
		for(int idx=0;idx<args.length/3;idx++){
			income=Integer.parseInt(args[idx*3+1]);
			spend=Integer.parseInt(args[idx*3+2]);
			tot+=(income-spend);	
			System.out.print((idx+1)+"\t");
			System.out.print(args[idx*3]+"\t");
			System.out.print(income+"\t");
			System.out.print(spend+"\t");
			System.out.print(tot+"\n");
		}
		
		
		
		/*
3단계  
급여  3000000   수입  마트   100000 지출  옷구매  50000 지출  

 * */
	}

}
