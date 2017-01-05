package javastart.a02_operator;

public class A02_homeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		아래형식의 내용을 args값으로 받아서 처리하세요.
		@@@:args변수를 받아서처리
		###:연산처리해서 나타나는 부분..

		          성적관리 프로그램..
		  	                   반 : @@@@0 ex) 3-4반, 영어영문학과
		NO 이름   국어    수학   영어   총점  평균(실수)     	        
		## @@@1 @@2  @@3  @@4  ##  ###
		## @@@5 @@6  @@7  @@8  ##  ###
		 * */
		String cls=args[0];
		String name01=args[1];
		String name02=args[5];
		int kor01=Integer.parseInt(args[2]);
		int kor02=Integer.parseInt(args[6]);
		int math01=Integer.parseInt(args[3]);
		int math02=Integer.parseInt(args[7]);
		int eng01=Integer.parseInt(args[4]);
		int eng02=Integer.parseInt(args[8]);
		int tot01=kor01+math01+eng01;
		int tot02=kor02+math02+eng02;
		double avg01=tot01/3.0; // 정수/정수=정수 정수/실수=실수
		double avg02=tot02/3.0;
		int cnt=1;
		System.out.println("\t\t성적관리 프로그램");
		System.out.println("\t\t\t\t\t\t반:"+cls);
		System.out.println("NO\t이름\t국어\t수학\t영어\t총점\t평균");
		System.out.println(cnt+"\t"+name01+"\t"+
		               kor01+"\t"+math01+"\t"+eng01+"\t"+tot01+"\t"+avg01);
		cnt=cnt+1;
		System.out.println(cnt+"\t"+name02+"\t"+
	               kor02+"\t"+math02+"\t"+eng02+"\t"+tot02+"\t"+avg02);
		

		
	}

}
