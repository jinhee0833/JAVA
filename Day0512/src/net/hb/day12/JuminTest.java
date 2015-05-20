package net.hb.day12;

import java.util.Calendar;

public class JuminTest {
	public static void main(String[] args) {
		// 주민번호 -> 나이, 성별 출력
		String jumin="8712301234567";
		//나이 : 29  --> (2015-1987)
		//성별 : 남  --> 7번째 글자가 1,3 남 / 2,4 여
		//--------------------------------------------
		Calendar now=Calendar.getInstance();
		int nowyear=now.get(now.YEAR); //2014
		char code=jumin.charAt(6); //'1' 성별코드
		int myyear=Integer.parseInt(jumin.substring(0, 2)); //"87" -> 87
		
		int age=0;
		switch(code) {
		case '1' :
		case '2' : age=nowyear-(1900+myyear); break;
		case '3' :
		case '4' : age=nowyear-(2000+myyear); break;
		}
		System.out.println("나이 : "+age);
		
		//'1'  ->  1
		switch(Character.getNumericValue(code)%2) {
		case 0 : System.out.println("성별 : 여"); break;
		case 1 : System.out.println("성별 : 남"); break;		
		}
		
		//System.out.println((int)code); //(int)'1'-> 49
		//System.out.println(Character.getNumericValue(code));//'1'->1
	} //main end

}//class END
