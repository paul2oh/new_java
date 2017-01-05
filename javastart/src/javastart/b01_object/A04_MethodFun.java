package javastart.b01_object;


class Calcu{
	int num01;
	int num02;
	String cal;
	int sum;
	// 두개의 값을 입력받아 덧셈처리.
	int plus(int n01, int n02){
		cal="+";
		sum=n01+n02;
		return sum;
	}
	int minus(int n01, int n02){
		cal="-";
		sum=n01-n02;
		return sum;
	}
	int multi(int n01, int n02){
		cal="*";
		sum=n01*n02;
		return sum;
	}
	int div(int n01, int n02){
		cal="/";
		sum=n01/n02;
		return sum;
	}	
	// 숫자를 입력하고 연산자를 넣으면 원하는 출력 형식으로 나오게 
	// 하는 메서드 구현..
	void print(int num01, int num02, String cal){
		// 입력된 cal을 전역변수에 있는 cal로 할당.
		this.cal=cal;		
		if(cal.equals("+")){
			sum=plus(num01,num02);
		}
		if(cal.equals("-")){
			sum=minus(num01,num02);
		}
		if(cal.equals("*")){
			sum=multi(num01,num02);
		}
		if(cal.equals("/")){
			sum=div(num01,num02);
		}		
		System.out.println(num01 +" "+cal+" "+num02 +" = "+ sum );
	}
}

public class A04_MethodFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcu c01 = new Calcu();
		int num01=4;
		int num02=5;
		System.out.println(num01 +" + "+num02 +" = "+ c01.plus(num01, num02));
		// 입력값과 연산자를 넘겨줘.. 화면에 출력까지 처리하는 내용..
		c01.print(25, 13, "-");
	}
/*
확인예제..
1단계 
BookStore 서점..
변수 : 도서명, 가격, 갯수, 계
메서드 : 
  buyBook 
  	입력값 : 도서명과 가격, 갯수
  	return : 계산된값
  showCalcu
    출력 exp : java입문  단가 25000  2권  총 : 50000
2단계
위 buyBook을 통해서 다중의 도서를 구매할 수 있으면.
showCalcu 메서드를 통해서 누적된 도서구매 내용을 아래 형식으로 출력
       도서 구매 내역
   java  25000  2 50000
   jsp   33000  1 33000
        계        83000
        
        
        



 * 
 * */
}
