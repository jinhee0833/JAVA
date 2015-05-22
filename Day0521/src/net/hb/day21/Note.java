package net.hb.day21;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Note extends Frame {

	public Note() {
		Ex a = new Ex();
		this.addWindowListener(a);
	}

	public static void main(String[] args) {

		Note nt =new Note();
		Button btn1 = new Button("입력");
		Button btn2 = new Button("출력");
		Button btn3 = new Button("정렬");
		Button btn4 = new Button("종료");
		Panel p = new Panel();

		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		p.add(btn4);
		nt.add(p);
		nt.setTitle("Frame Test");
		nt.setBackground(Color.green);
		nt.setSize(400, 350);
		nt.setVisible(true);
	}

	public class Ex extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}
