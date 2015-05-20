package net.hb.day07;

public class Last {

	public static void main(String[] args) {
		System.out.println("Last.java");
		Last ob = new Last();
		int a = ob.input();
		ob.ouput();
	}// main end

	public int input() {
		int a = 3;
		return a;
	}

	public void ouput() {
		Last a = new Last();
		int b = a.input();
		System.out.println(b);
	}

}// class END
