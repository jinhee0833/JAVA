package net.hb.day16;

import java.util.Random;
import java.util.Scanner;

public class Gabb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com, my; // 초기값 주며 엉뚱한 결과 초래됨
		int cnt = 0; // 총게임수 누적
		int mu = 0; // 무승부 누적
		int win = 0; // 본인 이긴것 누적
		int lose = 0; // 컴 이긴것 누적

		Scanner sc = new Scanner(System.in);

		while (true) {
			String com_str = "컴메세지", my_str = "내메세지";
			Random rd = new Random();
			com = rd.nextInt(3) + 1;

			System.out.print("\n1. 바위  2. 가위  3. 보   4. 종료 ? ");
			String str = sc.nextLine();

			if (str.equals("1") || str.equals("2") || str.equals("3")
					|| str.equals("4")) {
				my = Integer.parseInt(str); // 문자String클래스형 표준테이타타입 int형으로 변환
			} // if end
			else {
				System.out.println("잘못 입력하셨군요!!!");
				continue;
			}

			switch (com) {
			case 1:
				com_str = "바위";
				break;
			case 2:
				com_str = "가위";
				break;
			case 3:
				com_str = "보";
				break;
			}
			switch (str) {
			case "1":
				my_str = "바위";
				break;
			case "2":
				my_str = "가위";
				break;
			case "3":
				my_str = "보";
				break;
			}

			String result = "안내문"; // 메세지 뿌려줄 변수

			if (com == my) {
				result = "비겼습니다 ";
				mu = mu + 1;
			} else if ((my == 1 && com == 3) || (my == 2 && com == 1)
					|| (my == 3 && com == 2)) {
				result = "컴 승리 !!!";
				lose = lose + 1;
			} else if ((my == 1 && com == 2) || (my == 2 && com == 3)
					|| (my == 3 && com == 1)) {
				result = "My 승리 !!!";
				win = win + 1;
			} else if (my == 4) {
				System.out.println("\n프로그램종료(Q/q)?  ");
				String a = sc.nextLine();
				String b = a.toUpperCase();

				if (b.equals("Q")) {
					System.out.println("총 " + cnt + "게임\t" + win + ":승\t" + lose + ":패\t"
							+ mu + ":무승부");
					sc.close();
					System.exit(1);
				} else
					System.out.println("다시 입력하시오");
				continue;

			} else {
				System.out.println("잘못 입력하셨군요 ");
				continue;
			}

			System.out.println("컴퓨터의 선택: " + com_str);
			System.out.println("나의 선택: " + my_str);

			System.out.println("______________________________");
			// System.out.println(com_str + "\t" + my_str) ; //주석처리하고 실행해보세요
			System.out.println("컴퓨터의 선택: " + com_str);
			System.out.println("나의 선택: " + my_str);
			System.out.println("게임결과 : " + result);
			cnt = win + lose + mu;
			double per =(double)(100*win)/cnt;
			System.out.println("총 " + cnt + "게임\t" + win + ":승\t" + lose + ":패\t"+ mu + ":무승부 " + per+"% :승률" );
			System.out.println("______________________________");

		}
	}

}
