package my.common;

import java.util.Scanner;

public class Motel {
	String[][] name = new String[3][5];
	private int floor;
	private int room;

	public static void main(String[] args) {
		Motel mm = new Motel();
		mm.Process();

	}

	public void Process() {

		while (true) {
			/*
			try{
				Thread.sleep(1000);
			}catch(Exception ex){
				
			}
			*/
			ShowStatus();
			System.out.print("1.투숙  2.퇴실  3.map  4.종료? ");
			int sel = input(4);

			switch (sel) {
			case 1:
				CheckIn();
				break;
			case 2:
				CheckOut();
				break;
			case 3:
				ShowStatus();
				break;
			case 4: {
				System.out.println("종료합니다.");
				return;
			}
			}
			for(int i=0;i<30;i++)
				System.out.println();
		}
	}

	public int input(int n) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int r = 0;
			try {
				r = sc.nextInt();
			} catch (Exception ex) {
				System.out.print("범위 값이 아니라오1");
				
				continue;
			}
			if (r > 0 && n >= r) {
				return r;
			} else {
				System.out.print("범위 값이 아니라오2");
				continue;
			
			}
		}
	}

	public void CheckIn() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 층? ");
		this.floor = input(3);
		System.out.println();
		System.out.print("몇번 방에? ");
		this.room = input(5);
		System.out.println();
		if (this.name[floor - 1][room - 1] != null) {
			System.out.println("이미 예약된 방입니다.");
			return;
		}
		System.out.print("투숙객 이름은? ");

		this.name[floor - 1][room - 1] = sc.nextLine();

		System.out.println("정상적으로 예약되었습니다.");
	}

	public void CheckOut() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 층? ");
		this.floor = input(3);
		System.out.println();
		System.out.print("몇번 방에? ");
		this.room = input(5);
		System.out.println();

		if (this.name[floor - 1][room - 1] == null) {
			System.out.println("이미 빈방입니다.");
			return;
		} else {
			this.name[floor - 1][room - 1] = null;
			System.out.println("정상적으로 체크아웃 되셨습니다.");
		}

	}

	public void ShowStatus() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++)
				System.out.print((i + 1) + "0" + (j + 1) + "\t");
			System.out.println();
			for (int j = 0; j < this.name[i].length; j++) {
				if (this.name[i][j] == null) {
					System.out.print("\t");
					continue;
				}
				System.out.print(this.name[i][j] + "\t");
			}

			System.out.println();
			System.out.println("----------------------------------------------");

		}
	}
}
