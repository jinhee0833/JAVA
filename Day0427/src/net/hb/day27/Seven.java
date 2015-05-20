package net.hb.day27;

public class Seven {

	public static void main(String[] args) {
		System.out.println("Seven.java");
		int kor=85, eng=90,sum=0;//int=4byte
		double avg=0; //정수형인데 자동으로 0.0인식
		
		sum = kor + eng; 
		avg = (double)sum/2;
		
		System.out.println("국어=" + kor);
		System.out.println("영어=" + eng);
		System.out.println("총점=" + sum);
		System.out.println("평균=" + avg);
		
	}//main end	

}//class END
