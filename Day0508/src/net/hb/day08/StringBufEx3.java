package net.hb.day08;

public class StringBufEx3 {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("jin-hee");
		StringBuffer sb2 = sb1.append("&jeon-gyeom");
		
		sb2.insert(7, "&Yun-A");
		String msg = sb1.toString();
		System.out.println("sb1: "+msg);

	}

}
