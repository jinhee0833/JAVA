package net.hb.day08;

public class Seven {// 186page

	public static void main(String[] args) {
	//배열은 같은 타입, 배열은 사이즈크기 고정, 0번째
//		int[] su = new int[3];
//		su[0]=77;
//		su[1]=88;
//		su[2]=99;
		
		int[] su = { 23,45,69};
		
		for(int i=0;i<su.length;i++){
			System.out.print( su[i] + "\t");
		}
		System.out.println();
		String[] juso = new String[3];
		juso[0]="신수동";
		juso[1]="시청";
		juso[2]="여의도";
		
		for(int i=0;i<juso.length;i++)
			System.out.println(juso[i]);
		
		String menu="사과,바나나,체리,오렌지,망고";
		String[] data = menu.split(",");
		for(int i=0;i<data.length;i++)
			System.out.println(data[i]);
		
	}// main end

}// class END
