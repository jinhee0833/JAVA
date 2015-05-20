package my.common;

import java.util.Arrays;

public class Lotto {

	public int[] input() {
		//int[] su = { 23, 45, 7, 35, 4, 12 };
		int[] su = new int[6];
		
		for(int i=0;i<su.length;i++){
			su[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<
					i;j++){
				if(su[i]==su[j])
					i--;
			}
		}

		return su;
	}

	public void ouput(int[] val) {
		System.out.print("소트: ");
		for (int i = 0; i < val.length; i++) {
			System.out.print(val[i] + "\t");
		}

		System.out.print("\n소트: ");
		Arrays.sort(val);
		for (int i = 0; i < val.length; i++) {
			System.out.print(val[i] + "\t");
		}
	
	}
	
	public void star() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("★  ");
			}
			System.out.println();
		}
	}// end

	public static void nemo() {
		for (int i = 0; i < 3; i++) {
			System.out.println("# # #");
		}
	}// end

	public void move(String gu, String dong) {
		System.out.println(gu + " " + dong + " 이사가는중");
	}// end

}
