package net.hb.day08;

public class Work {

	public static void main(String[] args) {
		int su = 0;
		while (true) {
			int k = 0;
			while (k < 5) {
				su++;
				k++;
				System.out.print(su + "\t");
			}
			System.out.println();
			if (su >= 20)
				break;
		}
		System.out.println("\n마지막 영수증 출력");
	}// main end
}// class END
