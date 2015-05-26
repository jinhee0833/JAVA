package net.hb.day26;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerTest {
	private ArrayList<Socket> clients = new ArrayList<Socket>();
	public static void main(String[] args) {
		ServerTest st = new ServerTest();
		st.serverStart();
	}
	public void serverStart(){
		try{
			
			ServerSocket sv = new ServerSocket(8000);
			System.out.println("server start~~~");
			while(true){
				Socket sc = sv.accept();
				WorkerThread wt = new WorkerThread(sc);
				wt.start();
			}
		
			
			
		}catch(Exception ex){
			
		}
	}
	
	public class WorkerThread extends Thread{
		private Socket sc = null;
		public WorkerThread(Socket socket){
			sc = socket;
			
		}
		public void run(){
			String ip = null, msg = null;
			try{
				clients.add(sc);
				InputStreamReader isr = new InputStreamReader(sc.getInputStream());
				BufferedReader br = new BufferedReader(isr);
				ip=sc.getInetAddress().getHostAddress();
				
				msg = ip + "주소 접속";
				for(Socket s : clients)
				{
					PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
					pw.println();
				}System.out.println(msg);
				
				while((msg=br.readLine())!=null){
					for(Socket s : clients)
					{
						PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
						pw.println();
					}System.out.println("while for " + msg);
				}
			}catch(Exception ex){
				msg=ip + " 주소 퇴장";
				try{
					for(Socket s : clients)
					{
						PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
						pw.println();
					}System.out.println(msg);
				}catch(Exception ex2){
					
				}
				System.out.println(msg);
				clients.remove(sc);
			}
			
			
		}
		
	}
	
}
