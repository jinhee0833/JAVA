package net.hb.day12;

public class Seven {

	public static void main(String[] args) {

		int a = 26, b = 0;
		int sum = 0, sub = 0, gob = 1, mok = 0, nmg = 0;
		
		try{	//실행중에 에러발생하면 예외 = 제외시키고 아래문장 수행
			mok = a/b; 
			nmg = a%b;
		}catch(Exception ex){
			
		}
		sum=a+b; sub=a-b; gob=a*b;
		System.out.println(a + "*" + b + "=" + gob);
		System.out.println(a + "/" + b + "=" + mok);
		System.out.println(a + "%" + b + "=" + nmg);
		System.out.println(a + "+" + b + "=" + sum);
		System.out.println(a + "-" + b + "=" + sub);

	}// main end
}// class end
