package net.hb.day15;

public abstract class Mother { // 추상클래스

	public String bc() {
		String name = "KB국민은행";
		return name;
	}

	// 함수를 지역변수나, 멤버변수=필드처럼 선언만
	// 함수의 내용=body없으면 추상메소드 abstract
	// 추상메소드가 하나라도 있으면 추상클래스

	public abstract int card();

	public static void cash() {
		System.out.println("cash()메소드");
	}

}
