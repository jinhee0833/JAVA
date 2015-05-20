package net.hb.day04;

import java.awt.Color;

public class Game {

	public static void main(String[] args) {
		System.out.println("Game.java");
		Game gm = new Game();
		gm.star();//Non-static Method
		Game.nemo();
		// 리턴값 앞, void앞에 static 있으면 클래스이름.메소드()
	}// main end

	public static void nemo() {// static메소드
		System.out.println("nemo( )");
		for (int i = 0; i < 3; i++) {
			System.out.println("# # # # #");

		}// for end
	}// nemo end

	public void star() {
		System.out.println("Non-static star()");
		/*for(int i=0;i<5;i++){
			for(int j=0;j<=i;j++)
				System.out.print("★ ");
			System.out.println();
		}*/
		
		/*
		int i=0;
		while(i<5)
		{
			int j =0;
			while(j<=i)
			{
				System.out.print("★ ");
				j++;
			}
			System.out.println();
			i++;
		}*/
		
		int i= 0;
		while(i<5)
		{
			for(int j=0;j<=i;j++)
			{
					System.out.print("★ ");
			}
			System.out.println();
			i++;
		}
		
	}
}// class END
