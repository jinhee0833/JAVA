package net.hb.day21;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path = "C:/Mtest/zoomskLGkt";
		File file = new File(path);
		file.mkdir();
		while (true) {
			try {
				System.out.print("단 입력? ");
				int dan = Integer.parseInt(sc.nextLine());
				System.out.println(path + " success!!!");
				PrintWriter pw = new PrintWriter(path + "/gugu.txt");

				for (int i = 1; i < 10; i++) {
					System.out.println(dan + "*" + i + "=" + (dan * i));
					pw.println(dan + "*" + i + "=" + (dan * i));
				}
				pw.close();// 중요!!!!!

				System.out.println("gugu.txt Save OK");
			} catch (Exception ex) {
				System.out.println("error: " + ex.toString());
		
				continue;
			}
			sc.close();
			break;
		}

		System.out.println("영수증미출력시 벌금 30만원 징수 ");

	}

}
