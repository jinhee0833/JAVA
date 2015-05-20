package net.hb.day07;

public class Gugudan {
	private int dan = 1;

	public static void main(String[] args) {
		System.out.println("Gugudan.java");

		Gugudan gu = new Gugudan();
		gu.input();
		gu.output();

	}// main end

	public void input() {// Non-static일반함수
		int dan = 5; // 지역변수값을 필드한테 대입=할당
		this.dan = dan;
	}

	public void output() {// Non-static일반함수
		
		for (int i = 1; i < 10; i++)
			System.out.println(dan + "*" + i + "=" + (dan * i) + " ");

	}
}// class END
