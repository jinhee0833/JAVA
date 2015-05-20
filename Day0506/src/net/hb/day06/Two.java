package net.hb.day06;

import java.lang.*;//기본 임포트문장 생략가능,System클래스 field => out,in,error
import java.io.*;//PrintStream클래스,InputStream
import java.util.*; //Scanner클래스,Constr생성자
//new연산자 다음에 기술하고 클래스이름동일

public class Two {

	public static void main(String[] args) {
		System.out.println("Two.java");
		
		
		PrintStream ps = System.out;
		double dd = Math.PI;
		ps.println("PI= "+dd);
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		sc.close();
	}// main end
}// class END
