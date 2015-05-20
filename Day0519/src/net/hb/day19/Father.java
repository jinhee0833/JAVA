package net.hb.day19;

public class Father {
	private  int m = 780;
	
	public static void main(String[] args) {
		Father john = new Father( );
		john.bank( );
	}//main end
	
	public void bank(){
		int m=-230;
		System.out.println("지역m= " +  m ); //230
		System.out.println("전역m= " + this.m ); //780
	}//end
}//class END
