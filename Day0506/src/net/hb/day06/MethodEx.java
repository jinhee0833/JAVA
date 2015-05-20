package net.hb.day06;

public class MethodEx {
	
	private int var1,var2;
	
	public MethodEx(){}
	
	
	public int sum(double c,double d){
		int hap = (int) (c+d);
		return hap;
	}
	
	public int sum(int a, int b){
		return a+b;
	}
	public int sum(int x){
		return x;
	}

	public static void main(String[] args) {
		System.out.println("MethodEx.java");
		MethodEx me = new MethodEx();
		int res = me.sum(1000,-10);
		System.out.println("res="+res);

	}//main end
}//class END
