package net.hb.day11;

import java.util.Arrays;

import my.common.Lotto;

public class First {

	public static void main(String[] args) {
		System.out.println("First.java");

		Lotto LG = new Lotto();
//		LG.star();
		System.out.println();
		int[] data = LG.input();
		LG.ouput(data);
		
	
	}// main end
}// class END
