package net.hb.day26;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class UserServer {

	public static void main(String[] args) {
		try {
			ServerSocket sv = new ServerSocket(1111);
			System.out.println("접속중.. 대기중..");

			Socket s = sv.accept();

			InetAddress add = s.getInetAddress();
			System.out.println("접속자 : " + add);

			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();

			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			while (true) {
				String str = br.readLine();
				if (str == null)
					break;
				System.out.println("메세지= " + str);
			}

			br.close();
			s.close();

		} catch (Exception ex) {

		}

	}
}
