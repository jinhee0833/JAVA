package net.hb.day06;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		System.out.println("First.java");
		int my = 0, com = 0;
		com = (int) (Math.random() * 100) + 1;
//System.out.println("com = " + com);

		Scanner stdIn = new Scanner(System.in);
		
		for(int i=1;i<=5;i++){
			System.out.print(i+"회 숫자입력? ");
			my = stdIn.nextInt();
			if(my<=0 || my>100)
			{
				System.out.println("잘못 입력하셨습니다");
				i--;	
			}
		
			
			
			if(com>my)
				System.out.println(my + " 보다는 큰수 입니다.");
			else if(com<my)
				System.out.println(my + " 보다는 작은수 입니다.");
			else
			{
				System.out.println(my + " 정답입니다.");
				break;
			}
			
		}
		
		System.out.println("게임이 끝났습니다. 다시 도전하세요");
		stdIn.close();

	}

}
