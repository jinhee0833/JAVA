package net.hb.day18;
public class Father {
	private int m = 780;
	public static void main(String[] args) {
		Father john =new Father();
		john.bank();
		System.out.println("전역m="+john.m+"억");
	
	}// main end
	
	public void bank(){
		int m = 230;
		System.out.println("전역변수 m ="+this.m+"억");
		System.out.println("지역변수 m ="+m+"억");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
	}
	
	public void card(){
		System.out.println("전역m="+m);
	}

	
}// class END
