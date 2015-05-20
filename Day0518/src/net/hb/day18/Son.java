package net.hb.day18;
import java.awt.Color;
import java.awt.Frame;


public class Son extends Frame implements Brother {
	public Son(){
		//생성자,Non-static 영역에서는 this키워드 사용가능
		this.setTitle("chatting");
		this.setBackground(Color.yellow);
		this.setBounds(100, 100, 600, 400);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		System.out.println("Son.java");
		Son tom = new Son();
		tom.game();
		
		
		
	}//main end
	
	public void game(){
	
		System.out.println("game()메소드\n");
		
		

	}

	@Override
	public void note() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String book() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int car() {
		// TODO Auto-generated method stub
		return 0;
	}
}//class END
