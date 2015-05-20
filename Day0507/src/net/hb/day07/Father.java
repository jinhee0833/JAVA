package net.hb.day07;

public class Father {
	public Father(){
		
	}
	public Father(String a){
		System.out.println(a);
	}
	
	public Father(String a,int age){
		System.out.println(a+" 장군의 연세는 "+ age+"세 입니다.");
	}
	public void bank() {
		System.out.println("bank()");
		System.out.println("200억");
	}// end
}// class END
