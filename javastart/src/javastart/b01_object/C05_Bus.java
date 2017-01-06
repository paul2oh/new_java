package javastart.b01_object;
class Bus{
	private int busNum;
	private Passenger bp;
	private int totalPassenger ;
	private int totalMoney;
	
	
	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
	}
	public void setTotalPassenger(int totalPassenger) {
		this.totalPassenger = totalPassenger;
	}
	public void setBusNum(int busNum) {
		this.busNum = busNum;
	}
	public void setbP(Passenger bp) {
		this.bp = bp;
	}
	public void paySys(Passenger bp){
		System.out.println(busNum+"번 버스에 승객이 탑승하였습니다.");
		
		if(bp != null){
			bp.showAll();
		}else {
			System.out.println("승객이 없습니다.");
		}
	}
}
class Passenger{
	
	private int billPay;
	public Passenger(){}
	public int currentPay= 10000;
	
	private int passengerNum;
	
	
	
	

	public void setPassengerNum(int passengerNum) {
		this.passengerNum = passengerNum;
	}
	
	public Passenger(int billPay, int passengerNum) {
		super();
		this.billPay = billPay;
		this.passengerNum = passengerNum;
	}


	public void setbillPay(int billPay) {
		this.billPay = billPay;
	}
	public void showAll(){
		System.out.println("승객이 "+billPay+"원을 지불하였습니다.");
		System.out.println("현재 총"+passengerNum+"가 탑승하였고,");
		System.out.println("현재 총"+(billPay*passengerNum)+"의 수입금액이 있습니다.");
	}
	
}

public class C05_Bus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*1단계
		 * Bus
		 *  속성 : 버스번호, Passenger,
		 *  메서드 : @@@번 버스에
		 *  		승객이 탑승하였습니다. 승객이 @@@원을 지불하였습니다.
		 *  
		 *  Passenger
		 *  속성 : pay
		 *  메서드 : 승객이 @@@원을 지불하였습니다.
		 *  
		 *  2단계
		 *  속성 :1단계에서 추가, 누적 승객수와 금액
		 *  메서드: 
		 *  추가: 현재 총@@명이 탑승하였고,
		 *  	현재 총@@@원 누적 수입금액이 있습니다.  
		 *  
		 *  Passenger
		 *  	속성: 추가 현재 금액..초기 가지고 있는 금액은 생성자를 통해서
		 *  		차를 탈때마다 비용지불을 통해 금액 차감
		 *  	메서드: 차감되어 금액 내용 표시..
		 *  
		 * 
		 */
		Passenger p1 =new Passenger();
		p1.setbillPay(1000);
		p1.setPassengerNum(2);
		Bus b1 =new Bus();
		b1.setBusNum(605);
		b1.paySys(p1);
		
		
		
		
	}//main

}
