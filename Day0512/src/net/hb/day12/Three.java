package net.hb.day12;

import java.util.Arrays;

public class Three {

	public static void main(String[] args) {
		Three et = new Three();
		String[] a = et.city();
		et.display(a);
	}// main end
	
	public String[] city(){
		String[] juso={"종각","시청","신촌","홍대","당산","수원"};
		return juso;
	}
	
	public void display(String[] dong){
		Arrays.sort(dong);
		for(int i=dong.length-1;i>=0;i--){
			System.out.print(dong[i] + " ");
			
		}
	}
}// class end
