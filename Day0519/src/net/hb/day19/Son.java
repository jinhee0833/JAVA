package net.hb.day19;

import java.awt.Frame;

public class Son extends Father implements Brother { //Father클래스 상속
	
	public Son(String name){
		
	}
	public static void main(String[] args) {
		Son tom = new Son("톰소여의모험");
		tom.game( );
	}//main end
	
	public void game( ){//Non-static
		System.out.println("Son클래스 game( )");
		super.bank();
		bank();
		
	}//end
	
	@Override
	public void bank() {//Non-static
		String msg="제로상태유지, 상속포기";
		System.out.println(msg);
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
	
	//클래스 재정의 = OverRiding적용,  OverLoading아닙니다
	
	
}//class END

