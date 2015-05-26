package net.hb.day26;

public class Two {

	public static void main(String[] args) {
		int su = 0;
		while (true) {

			try {
				su++;
				System.out.print(su + "\t");
				if (su % 5 == 0)
					System.out.println();
				Thread.sleep(500);

			} catch (Exception ex) {
			}
		}// while end
		//무한루프 처리하면서 다른처리를 할때 쓰레드

	}// main end
	
	public void score(){
		int kor = 85, eng = 90, sum = 0;
		sum = kor + eng;
		System.out.println("\n국어=" + kor);
		System.out.println("영어=" + eng);
		System.out.println("총점=" + sum);
	}
	public void number(){
		
	}
}// class end
