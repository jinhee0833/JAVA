package net.hb.day18;
public class First {

	public static void main(String[] args) {
		System.out.println("First.java");

		First ob = new First();
		int hap = ob.sum(85, 90);
		double dd = ob.avg(hap);
		ob.grade(dd);

	}// main end

	public String book() { // Non-static 일반함수
		String title = "몽블랑";
		return title;
	}

	public int price() { // Non-static 일반함수
		int m = 2300;
		return m;
	}

	public int sum(int a, int b) {
		int c = a + b;
		return c;
	}

	public double avg(int a) {
		double c = ((double) a / 2) / 10;
		return c;
	}

	public void grade(double a) {
		switch ((int) a) {
		case 10:
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
		default:
			System.out.println("F학점");
			
		}
	}
}// class END
