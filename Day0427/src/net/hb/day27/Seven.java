package net.hb.day27;

public class Seven {

	public static void main(String[] args) {
		System.out.println("Seven.java");
		int kor=85, eng=90,sum=0;//int=4byte
		double avg=0; //�������ε� �ڵ����� 0.0�ν�
		
		sum = kor + eng; 
		avg = (double)sum/2;
		
		System.out.println("����=" + kor);
		System.out.println("����=" + eng);
		System.out.println("����=" + sum);
		System.out.println("���=" + avg);
		
	}//main end	

}//class END
