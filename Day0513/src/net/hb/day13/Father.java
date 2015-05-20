package net.hb.day13;

public class Father {

	private String name;
	private int age;
	public Father(String name) {
		this.name = name;
	}
	public Father(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		
		String name = "무명씨";
		Father john = new Father("홍길동",52);
		john.bank();
		Father.house("아파트");

	}

	public void bank() {
		int m = 230;
		System.out.println(this.name + "님 "+ age +"세");
		System.out.println("200억 있어요.");
	}
	public static void house(String a){
		
	}

}
