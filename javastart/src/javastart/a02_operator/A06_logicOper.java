package javastart.a02_operator;

public class A06_logicOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
논리 연산자 : 비교연산자(!=,==..)의 결과값을 2개이상 연결하여
 연산처리할 때, 사용한다.
 &&(and) : 두가지 조건을 다 만족시킬 때
 ||(or) : 두가지 조건 중, 하나만 만족시킬 때
  !(not) : 조건을 반대 처리. false --> true, true --> false

 연령에 따른 할인율을 적용하고자 한다.
 8~18 : 할인율을 20%을 하면
 4미만, 65이상은 : 할인율 100%(무료)로 하는 처리는 논리 연산자를 
 통하여 처리하여라.
 * */
		int age=3; // args값을 입력 가능..
		
		boolean dis20=( age >= 8 && age <= 18 );
		// 8세 이상이고, 18세 이하일 때 20%할인율 적용 유무 
		System.out.println("할인율 20%대상자(8~18)?"+dis20);
		boolean disNopay=( age < 4 || age >= 65);
		// 4세 미만이거나, 65세 이상일 때, 100%할인율 적용 유무
		System.out.println("무료 대상자"+disNopay);
/*
확인 예제..
해당과목의 평균점수가 70점 이상이고, 각과목의 40점 미만 점수가 없을 때,
합격처리를 한다고 한다. 이상에 해당하는 프로그램을 아래의 형식으로 출력하세요.
출력..
최종 점수
국어 : @@@
영어 : @@
수학 : @@
평균 : @@
합격 여부 : @@

 * */		
		int korPt=39;
		int engPt=88;
		int matPt=100;
		int avg=(korPt+engPt+matPt)/3;
		boolean ckMin= korPt<40 || engPt<40 || matPt <40;
		// ckMin2 = korPt>=40 && engPt>=40 && matPt>=40; 
		boolean chAvg = avg>=70;
		System.out.println("최종 점수");
		System.out.println("국어 : "+korPt);
		System.out.println("영어 : "+engPt);
		System.out.println("수학 : "+matPt);
		System.out.println("평균 : "+avg);
		System.out.println("합격 여부 : "+ ( !(ckMin) && chAvg ) );
	}

}
