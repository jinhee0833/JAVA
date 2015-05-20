package net.hb.day19;

import  java.lang.*; 
import  java.io.*;
import  java.util.*;

public class Gabb { 
	public static void main(String[] args)  throws  IOException	{
		int  com  , my  ;  
		int  cnt  =0  ; 
		int  mu=0  ;  
		int  win = 0 ; 
		int  lose = 0 ;
		String  com_str="com msg"  , my_str ="my msg"  ;   
		double   su ;
		
		Scanner sc = new Scanner(System.in) ;
		InputStreamReader isr =new InputStreamReader(System.in) ;
		BufferedReader  br  = new BufferedReader( isr) ; 

		while(true) {   
			su = (Math.random( ) * 3) + 1 ;  
			com = (int)su ;  
																		   
			System.out.print("\n1.가위  2.바위  3.보   4.종료 ? ");
			String  str = br.readLine( ) ;	
			 
			if(str.equals("1")  ||  str.equals("2")  || str.equals("3")  || str.equals("4")) {
					my = Integer.parseInt(str) ;  //문자String클래스형  표준테이타타입 int형으로 변환
		    } 
			 else  {  System.out.println("1~4 seleted!!" );  continue ;  } 
			
			
		switch(com){
			case 1: com_str="mok" ;  break;
			case 2: com_str="jji" ;  break;
			case 3: com_str="ba";  break;
		}
		
		switch(my){
			case 1: my_str="mok" ; break;
			case 2: my_str="jji" ;  break;
			case 3: my_str="ba" ; break;
		} 			
		String  result =""   ;  //메세지 뿌려줄 변수 

			if(com == my) { result = "비겼습니다 "  ;  mu = mu + 1 ; }
			else if((my==1 && com==2) || (my==2 && com==3) ||  (my==3 && com==1))
					{  result = "com victor !!!"  ;   lose = lose + 1 ; }
			else if((my==1 && com==3) || (my==2 && com==1) ||  (my==3 && com==2))
					{  result = "My victor !!!"  ;  win= win + 1 ;  }
		   else if(my ==4)  {  
			   System.out.println("\n program end "); 
			   System.out.println("총 " + cnt +"게임\t" + win + ":승\t" +  lose +":패\t" +  mu + ":무승부");
			   System.exit(1) ; 
			   }
		   else {  System.out.println("input failed "  ) ;  continue ;  }
			
			System.out.println("______________________________");
			System.out.println("컴:" + com_str + "\t" + "본인:" + my_str) ; //주석처리하고 실행해보세요 
			System.out.println("게임결과 : " + result ) ;  //비겼는지, 컴승리, 본인승리인지...
		 
			cnt = win+lose+mu;
			System.out.println("총 " + cnt +"게임\t" + win + ":승\t" +  lose +":패\t" +  mu + ":무승부"); 
			System.out.println("______________________________");
			
			System.out.print("Game Termanate(Q/q)  ? ");
			String flag = sc.nextLine( );
			if(flag.equals("Q") || flag.equals("q")){ 
				 System.out.println("Game Over " ) ; break ;
			}else { continue;}
			/*char loop =  (char)System.in.read( ) ;
								 System.in.read( ) ;
								 System.in.read( ) ;
			if(loop == 'q' || loop=='Q') { System.out.println("Game over " ) ; break ;  }
			else { continue  ;  } 
			*/ 
		} //while END
	}  // main END
} //class END

