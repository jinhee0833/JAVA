package net.hb.day19;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class ButtonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frame f = new Frame("버튼 테스트");
		Panel p = new Panel();

		Button b1 = new Button();
		Button b2 = new Button("출력");
		Button b3 = new Button("정렬");
		Button b4 = new Button("순위");
		
		b1.setLabel("입력");
		
		
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		
		f.add(p);
		
		f.setLocation(300,300);
		f.setSize(300,100);
		f.setVisible(true);
	}

}
