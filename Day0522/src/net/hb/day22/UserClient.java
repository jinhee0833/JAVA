package net.hb.day22;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class UserClient {
	public static void main(String[] args) {
		try{
				//순서1 ->서버 ip와 포트번호 
				Socket  socket = new Socket("203.236.209.116", 1111) ;
	
				//순서4  소켓으로 접속한  InputStream/OutputStream 값 얻어오기
				InputStream  is =  socket.getInputStream( ) ;
				OutputStream  os = socket.getOutputStream( ) ;
	
				//순서5  while문을 통해서 소켓으로 받은 입/출력을 char로 주고받게함 
				BufferedReader   br = new  BufferedReader( new InputStreamReader( is ) ) ;
				PrintWriter   pw =  new  PrintWriter(  new OutputStreamWriter( os ) )  ;
				BufferedReader   key = new  BufferedReader( new InputStreamReader( System.in ) ) ;
				while(true) {
					System.out.print("young:) " ) ;
					String data= key.readLine( ) ;
					if(data.equals("exit"))break ;
					pw.println( data );  		 
					pw.flush( ) ;
				} //while END
				
				System.out.println("young퇴장했습니다");
				key.close( ) ;  br.close( );  pw.close( ) ;  socket.close( ) ; 
			} catch(Exception  ex) {   } 
	}//main end
}//class END











