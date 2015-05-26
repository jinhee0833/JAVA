package net.hb.day26;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Note extends Frame implements ActionListener,WindowListener{
	
	private Button btnsend = new Button("전 송");
	private Button btnexit = new Button("종 료");
	private TextField tf = new TextField(20);
	private TextArea ta = new TextArea();
	private Panel pan=new Panel();
	private Label info = new Label("입력: ");
	private Font font = new Font("궁서체", Font.BOLD,32);
	
	public Note(){
		System.out.println("Note() 기본 생성자");
		//1단계 
		pan.add(this.info);
		pan.add(tf);
		pan.add(btnsend);
		pan.add(btnexit);
		addWindowListener(this);
	
		//2단계 ta를 중앙에 
		ta.setFont(font);
		this.add("Center",ta);
		this.add("South",pan);
		
		//3단계 add()메소드로 화면 만들기
		
		this.setTitle("채팅창만들기");
		this.setBackground(Color.green);
		this.setBounds(200, 200,400, 500);
		this.setVisible(true);
		
		//4단계 이벤트액션처리하도록 컴포넌트에 add~~~Listener()
			btnsend.addActionListener(this);
			tf.addActionListener(this);
			btnexit.addActionListener(this);
	}
	
	public static void main(String[] args) {
		Note pad = new Note();
		
	}

	public void actionPerformed(ActionEvent ae) {	//버튼, 메뉴,일력란
		if(ae.getSource()==btnsend){
			String data=tf.getText();
			ta.append(data+"\n");
			tf.setText("");
			tf.requestFocus();
		}else if(ae.getSource()==btnexit){
			System.out.println("프로그램 종료 버튼");
			System.exit(1);
		}else if(ae.getSource()==tf){
			String data=tf.getText();
			ta.append(data+"\n");
			tf.setText("");
			tf.requestFocus();
		}else{
			
		}
	}//actionPerformed
	
	public void message(){
		String data=tf.getText();
		ta.setText(data);
	}

	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) { System.exit(1);}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
}
