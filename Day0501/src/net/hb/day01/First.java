package net.hb.day01;

public class First {

	public static void main(String[] args) {
		System.out.println("First.java 9:26 9:20");
		// 미녀는 석류를 좋아해, static은 static 좋아해
		First a = new First();
		a.note();
	}

	public void note() { // Non-static 일반 메소드= 함수
		String a = book();
		int b = price();

		System.out.println("책제목=" + a);
		System.out.println("책가격=" + b);

	}// note end

	public String book() {	//함수에 리턴값이 있으면 함수 이름 자체가 값을 기억
		String title = "융프라우";
		return title;

	}// book end

	public int price() {
		int m = 23000;
		return m;
	}// price end

	public double save() {
		double point = 7.8;
		return point;
	}// save end

	public boolean gender() {
		boolean trans = true;
		return trans;
	}// gender end
}// class end
