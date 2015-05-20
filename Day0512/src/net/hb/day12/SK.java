package net.hb.day12;

public class SK {

	public SK() { // 기본생성자호출=생략가능

	}

	public SK(String name) {

	}

	public static void main(String[] args) {
		System.out.println("Sk.java");
		// 함수의 중복=overloading = 리턴값 동일, 함수이름동일
		// 괄호안의 매개인자갯수, 타입, 순서가 다르면 되요
		SK hb = new SK("선경");
		hb.move("시청");
		hb.move("시청", 20);
		hb.move("시청", 20, "지하철");
	}// main end

	public void move(String dong) {
		System.out.println("move()함수");
	}

	public void move(String dong, int t) {
		System.out.println("move()함수");
	}

	public void move(String dong, int t, String tr) {
		System.out.println("move()함수");
	}
}// class end
