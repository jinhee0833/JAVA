package net.hb.day08;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		System.out.println("Two.java");
		Two ob = new Two();
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.print("1.web 2.tv 3.종료? ");
	
			String sel = sc.nextLine();

			if (sel.equals("1")) {
				ob.tv();
			} else if (sel.equals("2")) {
				ob.web();
			} else if (sel.equals("3")) {
				System.out.println("프로그램을 종료합니다");
			
				break; // while 반복문 밖에서 다른처리를 하고 싶으면 break;

			} else {
				System.out.println("다시 입력하세요~");
				continue;
				
			}
			
		}// while END
		sc.close();
		System.out.println("끝");
	
	}// main end

	public void tv() {
		System.out.println("CSI시즌15");
		System.out.println("블루브러드7");
		System.out.println("JTBC손석희 뉴스룸");
		System.out.println("유재석 해피투게더");
	}// end

	public void web() {
		System.out.println("www.daum.net");
		System.out.println("www.google.com");
		System.out.println("www.naver.com");
		System.out.println("www.yahoo.com");
	}// end

}// class END
