package javastart.a04_switch;

public class A02_exp01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
1단계
switch case문의 break 관련 확인예제..
월을 입력하고,
해당 월의 마지막 날짜를 switch case문을 활용하여 출력하세요.	
=== 출력형식
입력된 월 : @@@
해당 달의 마지막날짜 : ###

2단계
생년을 입력 : @@@
현재 나이와 띠를 출력
현재 나이는 ## 이면, 띠는 ### 입니다. 자축인묘진사오미신유술해.
 * */
		int inMon=5;
		int days=0;
		switch(inMon){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: days=31; break;
			case 2: days=28; break;
			case 4:
			case 6:
			case 9:
			case 11:days=30; break;
			default : System.out.println("입력범위(1~12) 월 입니다.");
		}
		int birthyear=1994; // 30
		int age=2016-birthyear+1; // 한국나이
		System.out.println("나이:"+age);
		String orgAnim="";
		switch(age%12){  // 자축인묘진사요미신유술해
			case 1: orgAnim="원숭이(신)"; break;
			case 2: orgAnim="양(미)"; break;
			case 3: orgAnim="말(오)"; break;
			case 4: orgAnim="뱀(사)"; break;
			case 5: orgAnim="용(진)"; break;
			case 6: orgAnim="토끼(묘)"; break;
			case 7: orgAnim="호랑이(인)"; break;
			case 8: orgAnim="소(축)"; break;
			case 9: orgAnim="쥐(자)"; break;
			case 10: orgAnim="돼지(해)"; break;
			case 11: orgAnim="개(술)"; break;
			case 0: orgAnim="닭(유)"; break;
		}
		System.out.println(orgAnim);
		
		
	}

}
