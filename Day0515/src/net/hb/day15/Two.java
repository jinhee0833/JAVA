package net.hb.day15;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Two {

	public static void main(String[] args) {
		System.out.println("Two.java");
		
		Date dt = new Date();
//		System.out.println("날짜:"+dt.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String nalja = sdf.format(dt);
		System.out.println(nalja);
		
		Timestamp tt = new Timestamp(System.currentTimeMillis());
		System.out.println(tt);
		
	}//main end

}//class END
