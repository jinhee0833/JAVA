package net.hb.day21;

import java.awt.Frame;
import java.util.Scanner;

public class CalTest extends Frame implements Cal {
	
	public CalTest(int a,int b){
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
	}


	public int sum(int a, int b) {
		
		return a+b;
	}

	public int cha(int a, int b) {
		return a-b;
	}

	public int gob(int a, int b) {
		return a*b;
	}

	public double mok(int a, int b) {
		return a/b;
	}

	public int nmg(int a, int b) {
		return a%b;
	}

}
