package net.hb.day16;

import java.util.Vector; //Calendar, Date, Arrays, Random

public class Guest {

	public static void main(String[] args) {
		Vector<GuestBean> chatt = new Vector<GuestBean>();
		// Vector=벡터에서 항목추가메소드 add()
		GuestBean gb = new GuestBean();
		GuestBean gb2 = new GuestBean();
		GuestBean gb3 = new GuestBean();
		
		gb2.setName("ground");
		gb2.setSabun(4500);
		gb2.setGrade('B');
		gb2.setTitle("목요일");
		
		gb.setName("sky");
		gb.setSabun(2300);
		gb.setGrade('A');
		gb.setTitle("금요일");
		
		gb3.setName("love");
		gb3.setSabun(2000);
		gb3.setGrade('C');
		gb3.setTitle("수요일");
		chatt.add(gb2);
		chatt.add(gb);
		chatt.add(gb3);
		
		for (int i = 0; i < chatt.size(); i++) {
			GuestBean ob = (GuestBean)chatt.get(i);
			System.out.print(ob.getName()+ " " + ob.getSabun() + " ");
			System.out.println(ob.getGrade()+ " " + ob.getTitle() + " ");
		}
	}
}
