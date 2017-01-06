package javastart.b01_object;

class BookStore1{
	private String store01;
	private Book books1;
	public void setStore01(String store01) {
		this.store01 = store01;
	}
	public void setBook01(Book books1) {
		this.books1 = books1;
	}
	
	public void showBookStores(){
		System.out.println(store01+"서점에 가서,");
		books1.showAll();
	}
}
class Book{
	private String book02;
	private int price;
	private int cnt;
	public void setBook02(String book02) {
		this.book02 = book02;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public Book(String book02, int price, int cnt) {
		super();
		this.book02 = book02;
		this.price = price;
		this.cnt = cnt;
	}
	public void showAll(){
		System.out.println(book02+","+price+","+cnt+"를 구매하였다.");
	}
	
}

public class C04_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 확인예제..
		 * BookStore
		 * 	전역변수 : 서점명, Book
		 * 	메서드 : 서점명을 저장하는 메서드
		 * 			Book을 저장하는 메서드
		 * 			출력메서드
		 * 			@@@ 서점에 가서,
		 * 			도서명, 가격, 갯수를 구매햐였다.
		 * Book	
		 *  전역변수 : 도서명, 가격, 갯수
		 *  메서드 : 출력메서드
		 *  		도서명, 가격,갯수를 구매하였다.
		 */
		
		Book b =new Book("미움받을 용기",25000,1);
//		b.showAll();
		BookStore1 b1 = new BookStore1();
		b1.setStore01("영풍문고");
		b1.setBook01(b);
		b1.showBookStores();
		
		
	}//main

}
