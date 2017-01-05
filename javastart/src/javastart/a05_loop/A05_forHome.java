package javastart.a05_loop;

public class A05_forHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* 
3단계  
급여  3000000   수입  마트   100000 지출  옷구매  50000 지출  

가계부
no   항목     수입액   지출액    현잔액
1    급여     3000000     0    3000000
2    마트             0  100000   2900000
*/		
		int tot=0;
		int income=0;
		int spend=0;
		System.out.println("\t수입/지출항목(3단계)");		
		System.out.println("no\t항목\t수입액\t지출액\t현잔액");
		
		for(int idx=0;idx<args.length/3;idx++){
			if(args[idx*3+2].equals("수입")){
				income=Integer.parseInt(args[idx*3+1]);
				spend=0;
			}else{
				spend =Integer.parseInt(args[idx*3+1]);
				income=0;
			}
			tot+=(income-spend);	
			System.out.print((idx+1)+"\t");
			System.out.print(args[idx*3]+"\t");
			System.out.print(income+"\t");
			System.out.print(spend+"\t");
			System.out.print(tot+"\n");
		}

	}

}
