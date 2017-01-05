package javastart.b02_array;

public class A04_InitArrayExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1단계 확인예제..
		과목명: 국어, 영어, 수학
		점수:    80    90    70
		을 데이터 선언과 할당을 바로하면서 처리하고..
		for( 단위객체: 배열객체) 형태로 출력하세요..
		*/
		String []subjects={"국어","영어","수학"};
		int []points={80,70,90};
		System.out.print("과목명:");
		for(String subject:subjects){
			System.out.print(subject+",\t");
		}
		System.out.print("\n점  수:");
		for(int point:points){
			System.out.print(point+"\t");
			
		}		
		/*
		2단계 : 평균점수, 출력하고.
		최저점수 - 과목명 
		 * */	
		/*
		int tot=0;
		int lowIdx=0;
		int lowpnt=0; // 초기값 setting 
		              // 최저값 - 나올수 값 중 최고값을 setting
		              // 최고값 - 0
		for(int idx=0;idx<points.length;idx++){
			if(idx==0){   // 최저값이기 때문에 초기데이터 setting필요.
				lowpnt=points[idx];
			}
			tot+=points[idx]; // 평균을 위해 누적..
			if(lowpnt>points[idx]){ // 현재 최저값이 나온 값보다
				lowpnt=points[idx];
				lowIdx=idx;   // 해당 index값을 가지고 있으면, 과목명도 호출될 수 잇다.
			}
			
		}	
		*/
		int tot=0;
		int lowIdx=0;
		int lowpnt=100; // 나올 수 있는 최고점수 setting
		int idx=0;  // 과목명을 가져와야 하기에 index변수 호출..
		for(int point:points){
			tot+=point;
			if( point < lowpnt ){ // 나온 점수가 현재 최저점수보다 적을 때..
				lowpnt=point;
				lowIdx=idx; // 과목명도 가져오기 위해 index저장
			}
			idx++;		
		}	
		System.out.println("\n평균:"+tot/points.length);
		System.out.println("최저과목:"+subjects[lowIdx]);
		System.out.println("최저점수:"+points[lowIdx]);	
		
		
	}

}
