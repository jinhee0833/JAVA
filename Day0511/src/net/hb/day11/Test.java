package net.hb.day11;

import java.util.Scanner;

public class Test {
	
	private int dan;	//멤버필드=field=전역변수

	public static void main(String[] args) {
		Test gg = new Test();
		gg.getDan();
//		gg.setDan();
	}// main end

	public int getDan() { // return값 응용
		System.out.println("int getDan()");
		Scanner stdin = new Scanner(System.in);
		System.out.print("단 입력? ");
		int dan = stdin.nextInt();
		return dan;

	}

	public void setDan(int dan) { // 매개인자응용 Non-static
		System.out.println("int void setDan");

		if (dan < 2 || dan > 9) {
			System.out.println("다시 입력하세요");
			return;
		} else {
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + "*" + i + "=" + (dan * i));
			}

		}

	}
}// class END
