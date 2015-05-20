package net.hb.day19;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		try{
		
		InputStream is=System.in;
		Scanner sc = new Scanner(is);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		DataInputStream dis = new DataInputStream(is);
		
		String path="C:\\Mtest\\gugudan.txt";
		File file = null;
		PrintWriter pw = null;
		
		int dan=0;
		System.out.println("br 단입력? ");
//		dan=Integer.parseInt(br.readLine());
		dan = Integer.parseInt(dis.readLine());
		for(int i=1;i<10;i++)
			System.out.println(dan+"*"+i+"="+(dan*i));
			sc.close();
		}catch(Exception ex){
			
		}

	}

}
