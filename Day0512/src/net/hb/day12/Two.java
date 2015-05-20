package net.hb.day12;

public class Two {

	public static void main(String[] args) {
		System.out.println("Two.java");
		
		//main함수가 실행되기전에 초기값 문자열 배열 테이터를 받음
		//Save as...configurations => arguments
		
		String name = args[0];
		String price=	args[1];
		String menu = args[2];
		System.out.println("세프="+name);
		System.out.println("가격="+price);
		System.out.println("메뉴="+menu);
	}// main end
}// class end
