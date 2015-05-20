package net.hb.day08;

public class Home {

	public static void main(String[] args) {
		int a = 100, b = 100, sum = 0;
		double avg = 0.0;
		char grade = 'F';
		String msg = "합격/재시험";

		sum = a + b;
		avg = (double) sum / 2;
		switch ((int) avg / 10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		case 5:
			System.out.println("F");
			break;

		}
		String[] data = msg.split("/");
		
		if (avg >= 70)
			System.out.println(data[0]);
		else
			System.out.println(data[1]);

	}// main end

}// class END
