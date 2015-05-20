package net.hb.day06;

public class Last {

	public static void main(String[] args) {
		System.out.println("Last.java");

		String jumin = "840725-1793726";
		//substring(시,끝+1) 문자열 가져오기
		System.out.println("당신은 "+jumin.substring(2,4)+ "월 "+ jumin.substring(4,6)+"일 생일입니다.");
		String ju1 = "840725"; // 6자리
		String ju2 = "1793726"; // 7자리
		
		char gender = jumin.charAt(7);
		
		if(gender=='1'||gender=='3')
			System.out.println("남자");	
		else if(gender=='2'||gender=='4')
			System.out.println("여자");
		else if(gender=='5')
			System.out.println("외국인");
		
		int a = ju1.length();
		System.out.println(a+"자리");
		int b = ju2.length();
		System.out.println(b+"자리");
		
		String data="bankHBbank";
		System.out.println(data.toLowerCase());
		System.out.println(data.toUpperCase());
		System.out.println(data.replace("bank", "apple"));
		
		
	}

}
