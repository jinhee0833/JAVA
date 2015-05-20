package net.hb.day12;

import java.util.Arrays;

public class First {

	public static void main(String[] args) {
		System.out.println("로또배열 난수발생");
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 10) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j])
					i--;
			}
		}

		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "\t");
		}
		System.out.println();
		Arrays.sort(lotto);
		for (int i = 5; i >= 0 ; i--) {
			System.out.print(lotto[i] + "\t");
		}

	}// main end
}// class end
