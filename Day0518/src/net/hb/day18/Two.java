package net.hb.day18;
import java.util.Arrays;

public class Two {

	public static void main(String[] args) {
		Two ob = new Two();
		int[] lotto = ob.input();
		ob.output(lotto);
		System.out.println();

	}// main end

	public int[] input() {
		int[] a = new int[6];

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++)
				if (a[j] == a[i])
					i--;
		}

		return a;
	}

	public void output(int[] a) {
		for (int k = 0; k < a.length; k++)
			System.out.print(a[k] + "\t");
		System.out.println();
		select(a);
	}

	public void select(int[] a) {
		for (int j = 0; j < 5; j++) {
			for (int i = 5; i >= j + 1; i--) {
				if (a[j] > a[i]) {
					int b = a[j];
					a[j] = a[i];
					a[i] = b;
				}
			}
		}

		for (int k = 0; k < a.length; k++)
			System.out.print(a[k] + "\t");
	}
}// class END
