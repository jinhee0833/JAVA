package net.hb.day04;

public class Two {

	public static void main(String[] args) {
		System.out.println("Two.java");
		int kor = 85, eng = 90;
		Two ob = new Two();
		ob.mySum(kor, eng);
		ob.myavg(kor + eng);

	}// main end

	public void mySum(int a, int b) {
		System.out.println("합계=" + (a + b));
	}

	public void myavg(int a) {
		double avg = (double) a / 2;
		System.out.println("평균=" + avg);

	}

}// class END