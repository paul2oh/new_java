package javastart.a03_if;

public class A01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. if(조건){ 조건이 true값이 나올때, 처리할 프로세스. } 입력 id와 password가 맞을 때, @@@님
		 * 환영합니다. 2. if(조건){ 위 조건이 true일 때, 처리할 프로세스 }else{ 위 조건이 false일 때, 처리할
		 * 프로세스 }
		 */
		String inputId = "himan";
		String password = "7879";
		if (inputId.equals("himan") && password.equals("7878")) {
			System.out.println(inputId + "님 환영합니다.");
		} else {
			System.out.println(inputId + "님은 인증된 계정이 아닙니다.\n다시 로그인하세요.");

		}
		System.out.println("행복 홈페이지..");
		/*
		 * 사은품 행사 구매물품.. 1. 사과1상자 : 40,000원 2. 포도1상자 : 25,000원 3. 딸기1상자 :
		 * 15,000원 5만 미만 고객 : 라면5개 5~10만 고객 : 10000상품권 10만 이상고객 : 20000상품권 입력할
		 * 내용 : 번호, 상자 수. args
		 * 
		 * 선택한 번호는 @@번 @@@를 선택하셨습니다.
		 * 
		 * @@ 상자를 주문하셨습니다. 사은품은 @@@ 입니다.
		 * 
		 * 
		 */
		System.out.println("사은품 행사");
		System.out.println("구매물품..");
		System.out.println("1. 사과1상자 : 40,000원");
		System.out.println("2. 포도1상자 : 25,000원");
		System.out.println("3. 딸기1상자 : 15,000원");
		System.out.println("5만 미만 고객 : 라면5개");
		System.out.println("5~10만 미만 고객 : 10000상품권");
		System.out.println("10만 이상고객 : 20000상품권");
		//
		String inputNum = args[0];
		int inputCnt = Integer.parseInt(args[1]);
		String chFruit = "";
		int tot = 0;
		if (inputNum.equals("1")) {
			chFruit = "사과";
			tot = 40000 * inputCnt;
		} else if (inputNum.equals("2")) {
			chFruit = "포도";
			tot = 25000 * inputCnt;
		} else {
			chFruit = "딸기";
			tot = 15000 * inputCnt;
		}
		String chThanks="라면5개";
		if(tot>=50000 && tot<100000)
			chThanks="10000상품권";
		if( tot>=100000)
			chThanks="20000상품권";		
/*
		 * 선택한 번호는 @@번 @@@를 선택하셨습니다.
		 * 
		 * @@ 상자를 주문하셨습니다. 사은품은 @@@ 입니다.
 * */		
		System.out.println("선택한 번호는 " + inputNum + "번 "
                           + chFruit + "를 선택하셨습니다.");
		System.out.println(inputCnt+" 상자를 주문하셨습니다. 사은품은 "+chThanks+" 입니다.");
		

	}

}
