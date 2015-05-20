package net.hb.day15;

import java.util.Calendar;


public class CalendarEx1 {

	public static void main(String[] args) {

		// 추상메소드가 하나라도 있으면 추상클래스
		// 추상클래스는 new연산자로 개체생성불가능

//		int a = Mother.cash();
		Calendar now = Calendar.getInstance(); 
		StringBuffer sb = new StringBuffer("년중 ");
		
		int week_YY = now.get(now.WEEK_OF_YEAR);
		int YY = now.get(now.YEAR);
		int mm = now.get(now.MONTH)+1;
		int dd = now.get(now.DAY_OF_MONTH);
		
		sb.append(week_YY);
		sb.append("주째인 ");
		sb.append(YY);
		sb.append("년 ");
		sb.append(mm);
		sb.append("월 ");
		sb.append(dd);
		sb.append("일 ");
		
		System.out.println(sb.toString());
 
	}// main end

}// class END
