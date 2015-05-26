package net.hb.day26;

import java.awt.Frame;
import java.util.Scanner;

public class Game extends Frame implements Runnable{
	public static void main(String[] args) {
		Game gm = new Game();
		Thread th = new Thread(gm);
		th.start();
		
		int dan = 3;
		Scanner stdin = new Scanner(System.in);
		System.out.print("구구단 입력?");
		dan = stdin.nextInt();
		for(int i=1;i<10;i++)
			System.out.println(dan +"*"+i+"="+(dan*i));
		
		gm.jumsu();
		System.out.println("마지막 영수증 출력");
		
	}//main end
	
	public void run(){
		int su=0;	
		while(true){
			try{
				su++;
				System.out.print(su +"\t");//일꾼이 미네랄캐는 작업 
				if(su%5==0)System.out.println( );
				Thread.sleep(200);
			}catch(Exception ex){ }
		}//while end
	}//numbers
	
	public void jumsu(){
		System.out.println("\n국어영어총점 2초후 출력");
		try{
			Thread.sleep(2000);
		}catch(Exception ex){
			
		}
		
		int kor=85,eng=90,sum=0;
		sum=kor+eng;
		System.out.println("\n국어=" + kor);
		System.out.println("영어=" + eng);
		System.out.println("총점=" + sum);
	}//chongjum
	
}//class END
