package net.hb.day19;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Note extends Frame implements WindowListener {
	private Label info = new Label("메세지: ");
	private TextField tf = new TextField(20);
	private Button btnsend = new Button("전송");
	private Button btnexit = new Button("종료");
	private Panel pan = new Panel();
	private TextArea ta = new TextArea();
	private Font font = new Font("궁서체", Font.BOLD, 20);

	public Note() {
		// 1단계 - 판넬에 안내문, 입력란, 버튼2개 붙이기
		pan.add(info);
		pan.add(tf);
		pan.add(btnsend);
		pan.add(btnexit);
		pan.setBackground(Color.ORANGE);
		// 2단계 Frame 상속받은 Note바탕에 add("위치",TextArea)
		ta.setFont(font);
		this.add("Center", ta);	
		this.add("South", pan);
		// 현재화면 Note하단에 panel 붙이기

		setTitle("연습장");
		setBounds(200, 200, 600, 400);
		setVisible(true);
		setBackground(new Color(250, 0, 0));
		addWindowListener(this);
	}// end

	public static void main(String[] args) {
		new Note();

	}// main end

	public class MyExit extends WindowAdapter {

		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("프로그램 종료");
			System.exit(0);
		}// end

	}// MyExit End=================================

	public void windowActivated(WindowEvent e) {

	}

	public void windowClosed(WindowEvent e) {

	}

	public void windowClosing(WindowEvent e) {
		System.exit(1);
	}

	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	public void windowDeiconified(WindowEvent e) {

	}

	public void windowIconified(WindowEvent e) {

	}

	public void windowOpened(WindowEvent e) {

	}

}// Note class END
