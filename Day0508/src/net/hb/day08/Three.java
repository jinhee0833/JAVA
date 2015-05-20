package net.hb.day08;

public class Three {

	public static void main(String[] args) {
		System.out.println("Three.java");
		String msg1="우리나라 ";
		String msg2="대한민국 ";
		String msg3="금수강산 ";
		String msg4="뭐지?";
		String data = msg1 + msg2 + msg3; //문자열 연결
		System.out.println(data);
		
		StringBuffer sb = new StringBuffer();
		sb.append(msg1).append(msg4).append(msg2).append(msg3);
		System.out.println(sb);
		System.out.println(sb.toString());//toString()메소드는 문자열
	}// main end
}// class END
