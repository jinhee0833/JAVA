package net.hb.chatting.ddd;

import java.io.*;
import java.net.*;
import java.util.*; 

public class MServer implements Runnable{ 
	Vector vc=new Vector();

	public void run(){
		ServerSocket ss=null;
		try{
			ss=new ServerSocket(8000);  //서버에서 계속 감시하는 포트번호(약속할 포트)
			System.out.println("server start");
		}catch(Exception ex){System.out.println("오류:"+ex); return;}
		while(true){
			try{
				Socket s=ss.accept();  
				Service cs=new Service(s);  
				cs.start();   
				cs.myname=cs.in.readLine();
				cs.messageAll(cs.myname); 
				vc.add(cs); 
				for(int i=0;i<vc.size();i++){
					Service cs1=(Service)vc.elementAt(i); 
					cs.message(cs1.myname); 				
				}
			}catch(Exception ex){ex.printStackTrace(); return;}
		}//while end
	} //run메소드 end

	class Service extends Thread{  
		String myname="guest";
		BufferedReader in;
		OutputStream out;
		Socket s;	
		Calendar now=Calendar.getInstance();

		public Service(Socket s){
			System.out.println("===Service 12:30");
			try{
				this.s=s; 
				in=new BufferedReader(new InputStreamReader(s.getInputStream())); 		
				out=s.getOutputStream(); 
			}
			catch(Exception ex){ex.printStackTrace(); return;}
		}//end

		public void run(){
			System.out.println("===run()2 생성자 12:30");
			while(true){
				try{
					String msg=in.readLine();				
					if(msg==null) return;
					if(msg.charAt(0)=='/'){
						
						if(msg.charAt(1)=='q'){ //클라이언트가 퇴장했을때...
							try{
								for(int i=0 ; i<vc.size(); i++){
									Service  svc = (Service)vc.get(i);
									if(myname.equals(svc.myname)){
										vc.remove(i);
										break;
									}
								}
								messageAll("/q"+myname);
								in.close();
								out.close();
								s.close();  //소켓 끊기
								return;
							}catch(Exception ex){messageAll("/q"+myname);}
						}
					}//if end
					else
						messageAll(msg);  //대화명과message
				}catch(Exception ex){ex.printStackTrace(); return;}
			}//while end
		}//run end

		public void messageAll(String msg){		
			for(int i=0;i<vc.size();i++){
				try{
					Service cs=(Service)vc.elementAt(i); 
					cs.message(msg);
				}catch(Exception ex){vc.removeElementAt(i--);} 
			}   
		}//messageAll end

		public void message(String msg) throws Exception{		
			out.write((msg+"\n").getBytes());
		}//message end
	}//Service클래스 end

	public static void main(String[] args){	
		MServer cs=new MServer();
		new Thread(cs).start();  
	}//main end
} //class END
