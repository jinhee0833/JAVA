package net.hb.day04;

import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		System.out.println("Seven.java");

		int a = (int) (Math.random() * 100) + 1;
		System.out.println(a);

		int count = 0, su = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			count++;
			System.out.print("숫자 입력? ");
			su = sc.nextInt();
			if (count == 5) {
				break;
			}
			if (a > su)
				System.out.println(su + "보다는 큽니다");
			else if (a < su)
				System.out.println(su + "보다는 작습니다");
			else
			{
				System.out.println("정답입니다");
				break;
			}
		}
		System.out.println("게임이 종료되었습니다.");
		sc.close();
	}// main end
}// class END
