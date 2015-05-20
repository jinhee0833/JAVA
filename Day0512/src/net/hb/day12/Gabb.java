package net.hb.day12;

import  java.lang.*; 
import  java.io.*;
import  java.util.*;

public class Gabb { 
	public static void main(String[] args)  throws  IOException	{
		int  com  , my  ;  //초기값 주며 엉뚱한 결과 초래됨 
		int  cnt  =0  ; //총게임수 누적
		int  mu=0  ; //무승부 누적 
		int  win = 0 ;  //본인 이긴것 누적
		int  lose = 0 ; // 컴 이긴것 누적
		String  com_str="컴메세지"  , my_str ="내메세지"  ;  //메세지 기억할 변수 
		double   su ;
		
		Scanner sc = new Scanner(System.in) ;
		InputStreamReader isr =new InputStreamReader(System.in) ;
		BufferedReader  br  = new BufferedReader( isr) ; 

		while(true) {   
			su = (Math.random( ) * 2.9 ) + 1 ;  //1 ~ 3  사이의  난수 
			com = (int)su ;  // com변수는 컴퓨터 알아서 내는 수 
																		   
			System.out.print("\n1. 가위  2. 바위  3. 보   4. 종료 ? ");
			//br대신 sc  이용하세요
			String  str = br.readLine( ) ; //문자로 입력받음 		
			 
			//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
			//추가  숫자가 아닌 문자을 입력했을때  비고처리 
			//equals( )함수를 응용 
			
			//if(str =="1"  ||  str =="2"  || str=="3"  || str=="4") {  //에러는 없으나 비교가 안됨
			if(str.equals("1")  ||  str.equals("2")  || str.equals("3")  || str.equals("4")) {
					my = Integer.parseInt(str) ;  //문자String클래스형  표준테이타타입 int형으로 변환
		    	} //if end 
			else  {  System.out.println("잘못 입력하셨군요!!!" );  continue ;  } 
			
			
			
			//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
			String  result ="안내문"   ;  //메세지 뿌려줄 변수 

			if(com == my) { result = "비겼습니다 "  ;  mu = mu + 1 ; }
			else if((my==1 && com==2) || (my==2 && com==3) ||  (my==3 && com==1))
					{  result = "컴 승리 !!!"  ;   lose = lose + 1 ; }
			else if((my==1 && com==3) || (my==2 && com==1) ||  (my==3 && com==2))
					{  result = "My 승리 !!!"  ;  win= win + 1 ;  }
		   else if(my ==4)  {  
			   System.out.println("\n프로그램종료 "); 
			   System.out.println("총 " + cnt +"게임\t" + win + ":승\t" +  lose +":패\t" +  mu + ":무승부");
			   System.exit(1) ; 
			   }
		   else {  System.out.println("잘못 입력하셨군요 "  ) ;  continue ;  }
			
			System.out.println("______________________________");
			System.out.println(com_str + "\t" + my_str) ; //주석처리하고 실행해보세요 
			System.out.println("게임결과 : " + result ) ;  //비겼는지, 컴승리, 본인승리인지...
			//System.out.println( 총 7게임  4:승  1:패   2:무승부  ) ; 
			cnt = win+lose+mu;
			System.out.println("총 " + cnt +"게임\t" + win + ":승\t" +  lose +":패\t" +  mu + ":무승부"); 
			System.out.println("______________________________");
			
			System.out.print("게임종료(Q/q)  ? ");
			char loop =  (char)System.in.read( ) ;
								 System.in.read( ) ;
								 System.in.read( ) ;
			if(loop == 'q' || loop=='Q') { System.out.println("게임종료 " ) ; break ;  }
			else { continue  ;  } //continue문은 while문 처음으로 이동함 
		} //while END
	}  // main END
} //class END

