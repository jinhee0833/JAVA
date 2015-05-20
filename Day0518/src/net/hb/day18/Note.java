package net.hb.day18;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Note extends Frame implements WindowListener {
	public Note(){
		setTitle("간단한 메신저창 만들기");
		setBackground(Color.gray);
		this.setBounds(100, 100, 450, 600);
		this.setVisible(true);
		//4단계 - 컴포넌트 Button,Window 등 이벤트 연결
		
		addWindowListener( this );
		
	}
	public static void main(String[] args) {
		Note notepad = new Note();
		
	}// main end

	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		System.out.println("프로그램을 종료합니다.");
		System.exit(1);
	}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
}// class END
