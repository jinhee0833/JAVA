package net.hb.day16;

public class Father {

	public void bank(){
		System.out.println(" 님의 200억 있다");
	}
	
	public static void house(){
		System.out.println("static void house()");
		
	}
}
/*
자바에서 class 상속 키워는 extends
자바에서 interface 상속 키워드는 implements
자바에서 interface는 메소드 선언만 = 추상메소드로만 구성
class 아버지 { 은행 }
class 엄마 { 현금 }
class 자식 extends 아버지 { 은행, 현금 상속 }
class 자식 extends 아버지,엄마 { 은행, 현금 상속 } 에러

현재 클래스를 가르키는 키워드 this
	this.Non-static메소드();
	this.Non-static필드();
상속받으면 조상님꺼 자식꺼 소유라서 
부모꺼도 this 키워드로 접근 가능
*/