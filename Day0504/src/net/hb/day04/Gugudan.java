package net.hb.day04;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		System.out.println("Gugudan.java 10:40");
		Gugudan jj = new Gugudan();
		jj.input();

	}// main end

	public static void input() {
		System.out.println("input()함수");
		Scanner sc = new Scanner(System.in);

		int dan = 3;
		System.out.print("단 입력? ");
		dan = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
			if (i == 5)
				break;
		}// for end
	}
}// class END
