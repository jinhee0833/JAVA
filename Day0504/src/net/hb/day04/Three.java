package net.hb.day04;

public class Three {

	public static void main(String[] args) {
		System.out.println("Three.java");
		int kor=85,eng=90;
		
		Three tr = new Three();
		int cc = tr.hbsum(kor,eng);
		double dd = tr.hbavg(kor+eng);
		System.out.println("총점="+cc);
		System.out.println("평균="+dd);
		
	}// main end
	
	public int hbsum(int a, int b){
		int c=a+b;
		return c;
	}
	
	public double hbavg(double a){
		double b = a /2;
		return b;
	}
	
	
}// class END
