package net.hb.day12;

import java.io.InputStream;
import java.util.Scanner;

public class Emp {

	public static void main(String[] args) {
		System.out.println("Emp.java");
		int count=0;
		InputStream input = System.in;
		Scanner sc = new Scanner(input);
		int sabun = 0;
		while(true){
			count++;
		System.out.print("사번 입력? ");
		try{
		sabun=sc.nextInt();
		}	catch(Exception ex){
			System.out.println("잘못입력하셨습니다.");
			sc.nextLine();
			continue;
		}
		
		System.out.print("이름 입력? ");
		String name = sc.nextLine();

		System.out.println();
		System.out.println("사번= " + sabun);
		System.out.println("이름= " + name);
		
		if(count==3) break;
		}
	}// main end

}// class end
