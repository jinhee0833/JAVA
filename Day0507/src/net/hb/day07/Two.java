package net.hb.day07;

public class Two {

	public static void main(String[] args) {
		System.out.println("Two.java");

		Two my = new Two();
		String data = "서울시청";
		int a = my.juso(data);
		String b = my.book();

	}// main end

	public int juso(String city) {
		int distance = 20;
		return distance;
	}

	public String book() {
		String title = "몽블랑";
		return title;
	}
}// class END
