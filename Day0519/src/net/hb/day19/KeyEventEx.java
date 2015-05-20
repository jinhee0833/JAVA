package net.hb.day19;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventEx extends Frame implements KeyListener{
	TextArea ta = new TextArea();
	
	public KeyEventEx(){
		super("KeyEvent 테스트");
		add(ta);
		setBounds(300, 300, 300, 300);
		setVisible(true);
		ta.addKeyListener(this);
		
	}

	public static void main(String[] args) {
		new KeyEventEx();
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==e.VK_DOWN)
			ta.append("DOWN Key\n");
		if(e.getKeyCode()==e.VK_UP)
			ta.append("UP Key\n");
		if(e.getKeyCode()==e.VK_LEFT)
			ta.append("LEFT Key\n");
		if(e.getKeyCode()==e.VK_RIGHT)
			ta.append("RIGHT Key\n");
		if(e.getKeyCode()==e.VK_ENTER)
			ta.append("ENTER Key\n");
		
			
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
