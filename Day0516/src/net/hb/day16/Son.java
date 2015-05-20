package net.hb.day16;

public class Son extends Father {

	public Son(String title){
		
	}
	public static void main(String[] args) {
		
		Son tom = new Son("톰소여의 모험");
		tom.game();
		

	}// main end

	private void game() {
		
		System.out.println("\ngame메소드");
		System.out.println("메이플,스타저그");
		this.bank();
	}//game end
	
	

}// class END
