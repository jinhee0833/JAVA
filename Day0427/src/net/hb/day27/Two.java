package net.hb.day27;

public class Two {

	public static void main(String[] args) {
		System.out.println("Two.java");
		int kor=85, eng=90, sum=0;//int=4byte
		double avg=0.0; //double=8byte=�Ǽ�
		String msg="�޼���";
		
		sum = kor + eng ;
		
		avg=(double)sum/2; //sum ��������=>double ����ȯ
		
		if( avg==100) 
			{ 
				msg="����� �հ� �� ���ʽ� ����"; 
			}
		else if (avg>=70)
			{ 
				msg="�հ��� ���ϵ帳�ϴ�"; 
			}
		else 
			{ 
				msg="����� ���ž� �մϴ�"; 
			}
				
		System.out.println("�߰�����=" + kor);
		System.out.println("�⸻����=" + eng);
		System.out.println("����=" + sum);
		System.out.println("����=" + avg);
		System.out.println(msg);
		


		
	}//main end	

}//class END
