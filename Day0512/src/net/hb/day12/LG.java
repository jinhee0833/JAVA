package net.hb.day12;

public class LG {

	public static void main(String[] args) {
		LG a = new LG();
		System.out.println(a.book());
		System.out.println(a.price());
		System.out.println(a.save());
		
	}// main end
	
	public String book(){
		String title="몽블랑";
		return title;
	}
	
	public int price(){
		int m = 23000;
		return m;
	}
	
	public double save(){
		double point = 7.8;
		return point;
	}
}// class end
