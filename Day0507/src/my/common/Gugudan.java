package my.common;

public class Gugudan {
	private int dan=1;
	public static void main(String[] args) {
		Gugudan gg = new Gugudan();
		gg.input();
		gg.output();

	}
	
	public void input(){
		int dan=23;
		this.dan = dan;
	}

	public void output(){
		for(int i=1; i<10; i++){
			
			System.out.println(dan+"*"+i+"="+(dan*i));
			
		}
	}
}
