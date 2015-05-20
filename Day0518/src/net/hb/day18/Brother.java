package net.hb.day18;

public interface Brother {
	//인터페이스 매소드선언만 => 추상메소드
	//abstract 키워드 생략가능
	//인터페이스 상속 키워드 implements
	//상속 받으면 추상매소드 반드시 재정의=OverRiding
	//선언만해서 new연산자로 개체생성하면 에러발생
	//class Son클래스 상속 받아서 기술하세요
	
	public abstract void note();

	public abstract String book();

	public abstract int car();
}
