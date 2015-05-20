package net.hb.day16;

import java.util.Vector; //Calendar, Date, Arrays, Random

public class Game {

	public static void main(String[] args) {
		Vector<String> chatt = new Vector<String>();
		// Vector=벡터에서 항목추가메소드 add()

		chatt.add("sky"); // 익명=anonymous

		chatt.add("23");

		chatt.add("A");

		// Vector에서 사이즈size(), 항목가져오기get()

		for (int i = 0; i < chatt.size(); i++) {
			System.out.print(chatt.get(i) + " ");
		}
		System.out.println();
		for(String data : chatt){
			System.out.print(data+" ");
		}
		
		
	}

}
