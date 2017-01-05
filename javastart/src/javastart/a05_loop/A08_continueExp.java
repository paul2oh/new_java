package javastart.a05_loop;

public class A08_continueExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tot=0;
		for(int cnt=1;cnt<=100;cnt++){
			if(cnt==50){
				continue;
			}
			tot+=cnt;
		}
		System.out.println("1~100까지 합산(50제외):"+tot);
		tot=0;
		for(int cnt=1;cnt<=100;cnt++){
			if(cnt%10==0){
				System.out.println();
				continue;
			}
			System.out.print(cnt + ((cnt!=99)?"+":"="));
			tot+=cnt;
		}
		System.out.println("총계:"+tot);
		
	}
	

}
