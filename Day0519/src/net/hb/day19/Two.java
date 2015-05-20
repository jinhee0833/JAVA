package net.hb.day19;

import java.io.InputStream;
import java.io.PrintStream;

public class Two {

	public static void main(String[] args) {
		int dan=0;
		InputStream is = System.in ;
		PrintStream ps = System.out;
		
		ps.print("단입력? ");
		try{
		dan = is.read();
		
		
		for(int i=1;i<10;i++)
			ps.println(dan+"*"+i+"="+(dan*i));
			
			System.in.read();
			System.in.read();
			System.in.read();

			ps.print("학점입력? ");
			
			char grade = (char)is.read();
			System.out.println("\n학점="+grade);
			}catch(Exception e){	}

	}

}
