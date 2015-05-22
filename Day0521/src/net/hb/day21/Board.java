package net.hb.day21;

public interface Board {
	//interface상속 키워드 implements
	//interface 상속하면 interface안에 있는 함수는 무조건 재정의
	
	public abstract boolean dbSave();	//내용이 없고 함수이름만 있음
	public void login();
	public boolean search(String str);
	public boolean modify();
	public int recordCount();
	
}//interface end
