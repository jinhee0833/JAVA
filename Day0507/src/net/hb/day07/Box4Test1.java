package net.hb.day07;

class Box4 {
	//field=필드 int초기값 0세팅
 private int width, height, depth;

	public Box4() {
	}// 기본생성자 보통은 생략

	public Box4(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public int area(){
		int size = this.width*this.depth*this.depth;
		return size;
		
	}
}// class END

public class Box4Test1 {

	public static void main(String[] args) {
		Box4 mybox1 = new Box4(10, 20, 30);
		
		int vol = mybox1.area();
		
		//int vol = mybox1.width * mybox1.height * mybox1.depth;
		//System.out.println("박스의 부피: = " + vol);

	}

}
