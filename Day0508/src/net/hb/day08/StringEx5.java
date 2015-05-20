package net.hb.day08;

public class StringEx5 {// 186page

	public static void main(String[] args) {
		String data = "kim Sun Ban";
		// 문제1 indexOf

		int a = data.indexOf('n');
		System.out.println(a);

		String jumin = "840725-1973526";
		String b = jumin.substring(2, 4);
		String c = jumin.substring(4, 6);
		a = jumin.indexOf('-');
		String d = jumin.substring(a + 1);

		System.out.println(b + "월 " + c + "일 생일입니다.");

		System.out.println(d);

	}// main end

}// class END
