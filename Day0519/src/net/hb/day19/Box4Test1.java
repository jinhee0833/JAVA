package net.hb.day19;

class  Box4{  //Box4.java파일없음  팩키지~~\Box4.class
	 private int width;
	 private int height;
	 private int depth;
	 private int area;//리턴값 getter, setter(인자)
	
	public Box4(int w, int h, int d){
		width=w;
		height=height;
		depth=depth;
	}//생성자 end
	
	public  int myarea( ){
		 int hap = this.width*this.height*this.depth;
		 return hap ;
	}//end
}//Box4 class END

public class Box4Test1 {//PDF 9장 7페이지
	public static void main(String[] args) {
		Box4  mybox1 = new  Box4(2,3,4);
		int vol = mybox1.myarea();
		System.out.println("박스의 부피: " + vol );
	}//main end
}//Box4Test1 class END






