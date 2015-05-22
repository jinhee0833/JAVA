package net.hb.day26;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class UserClient {

	public static void main(String[] args) {
		try{
				Socket s = new Socket("203.236.209.120",1111);
				
				InputStream is = s.getInputStream();
				OutputStream os = s.getOutputStream();
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter pw = new PrintWriter(new OutputStreamWriter(os));
				
				while(true){
					System.out.println("Lee");
					String data = br.readLine();
					if(data.equals("exit")) break;
					System.out.println("메세지: "+data);
				}
				System.out.println("퇴장하셨습니다.");
				br.close(); s.close(); pw.close();
		}catch(Exception ex){
			
		}
	}

}
