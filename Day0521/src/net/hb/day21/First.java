package net.hb.day21;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class First {

	public static void main(String[] args) {
		InputStream is = System.in;
		DataInputStream dis = new DataInputStream(is);
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
		try{
		System.out.print("br 회원이름? ");
		int name = br.read();
		System.out.println("이름= "+ name);
		}catch(Exception ex){
				continue;
		}
		break;
		}
		System.out.println("마지막 문장");
	}

}
