package net.hb.day27;

public class Two {

	public static void main(String[] args) {
		System.out.println("Two.java");
		int kor=85, eng=90, sum=0;//int=4byte
		double avg=0.0; //double=8byte=실수
		String msg="메세지";
		
		sum = kor + eng ;
		
		avg=(double)sum/2; //sum 지역변수=>double 형변환
		
		if( avg==100) 
			{ 
				msg="당신은 합격 및 보너스 지급"; 
			}
		else if (avg>=70)
			{ 
				msg="합격을 축하드립니다"; 
			}
		else 
			{ 
				msg="재시험 보셔야 합니다"; 
			}
				
		System.out.println("중간점수=" + kor);
		System.out.println("기말점수=" + eng);
		System.out.println("총점=" + sum);
		System.out.println("평점=" + avg);
		System.out.println(msg);
		


		
	}//main end	

}//class END
