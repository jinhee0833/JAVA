package net.hb.day07;

public class Three {

	public static void main(String[] args) {
		System.out.println("Three.java");

		String dong = "공덕동";
		int m = 20;
		Three tr = new Three();
		tr.move(dong);

	}// main end

	public void move() {
		System.out.println("move(x) 집으로 가는중");
	}

	public void move(String dd) {
		System.out.println(dd + " 가는중");
	}

	public void move(String dd, int m) {
		System.out.println(dd + "으로 " + m + "분 소요");
	}
}// class END
