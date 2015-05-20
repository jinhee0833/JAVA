package net.hb.day11;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		Gugudan gg = new Gugudan();
		int k = gg.input();
		gg.output(k);
	}// main end

	public int input() { // return값 응용
		Scanner stdin = new Scanner(System.in);
		System.out.print("단 입력? ");
		int dan = stdin.nextInt();
		return dan;

	}

	public void output(int dan) { // 매개인자응용 Non-static
		while (true) {

			if (dan < 2 || dan > 9) {
				System.out.println("다시 입력하세요");
				return;
			} else {
				for (int i = 1; i < 10; i++) {
					System.out.println(dan + "*" + i + "=" + (dan * i));
				}
				break;
			}
		}// while end
	}
}// class END
