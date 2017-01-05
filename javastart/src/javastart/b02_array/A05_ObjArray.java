package javastart.b02_array;

class Team{
	// 팀명
	String name;
	// 총전적
	int totGame;
	// 승수
	int vicCnt;
	// 패..
	int defCnt;
	// 승률
	double vicRatio;
	Team(String name, int vicCnt, int defCnt){
		this.name= name;
		this.totGame= vicCnt+defCnt;
		this.vicCnt= vicCnt;
		this.defCnt= defCnt;
	}
	void showCur(){
		vicRatio=((int)(vicCnt/(double)totGame*1000))/1000.0;
		System.out.println(name+"\t"+totGame+"\t"+vicCnt+"\t"+defCnt
				+"\t"+vicRatio);
	}
	
}

public class A05_ObjArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Team t = new Team("빙그레",20,17);
		t.showCur();
/* 객체 배열
 * 1. 객체배열 크기선언	
 *    객체[] 객체배열명 = new 객체[배열크기];
 *    ex) Person[]p = new Person[5]; // 5개 Person객체가 들어갈 수 있는 배열..
 * 2. 객체배열 선언, 할당
 * 	  ex) Person[]p ={new Person("하이맨1"),new Person("하이맨2"),new Person("하이맨3")};
 * 3. 객체 배열의 통한 메서드 활용.
 *    for(int idx=0;idx<p.length;idx++){
 *    	p[idx].printAll(); // 특정 배열객체 내부에 있는 객체한개의 메서드 활용..==>  p.printAll();
 *    }
 *    for(Person ps:p){
 *    	ps.printAll();
 *    }
 * */	
		System.out.println("팀명\t\t총게임\t승\t패\t승률");
		Team[] tArray01 = new Team[3];
		tArray01[0] = new Team("두산베어즈",21,18);
		tArray01[1] = new Team("넥센히어로즈",19,18);
		tArray01[2] = new Team("삼성라이온즈",17,14);
		for(Team tm:tArray01){
			tm.showCur();
		}
		Team[] tArray02 = { new Team("롯데자이언트",22,21),
							new Team("sk와이번스",22,21),
							new Team("LA다저스 ",23,19)};
		for(int idx=0;idx<tArray02.length;idx++){
			tArray02[idx].showCur();
		}
/*
확인예제
1. 단계 
월간계획표 작성.
	Schedule
		속성 : 일정내용, 날짜, 시간(언제), 소요시간
		메서드 : showSchedule()  계획내용, 날짜/시간, 소요시간 출력..
	계획 5개를 배열로 만들어 해당 메서드를 호출하는 순간 출력되게 처리. 
	
2. 단계
   위내용에 속성값 우선순위를 입력하여, 
   초기에는 우선순위를 임의로 넣어지만, 출력할때, 우선순위가 높은 것부터 출력하게 처리..
 * 
 * */		
		
		
	}

}
