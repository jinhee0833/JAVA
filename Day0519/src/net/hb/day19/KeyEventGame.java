package net.hb.day19;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class KeyEventGame extends Frame implements KeyListener,WindowListener,Runnable{
	private Image image;
	private int x,y,mx,my,sel;
	private boolean flag=true;
	
	public KeyEventGame(){
		x=150;
		y=150;
		
		Toolkit tk = null;
		tk = Toolkit.getDefaultToolkit();
		image = tk.getImage("C:/Mtest/images/packman.png");
		setTitle("KeyEvent 및 그림이동");
		this.setBackground(Color.yellow);
		setBounds(200, 200, 600, 400);
		setVisible(true);	
		this.addWindowListener(this);
		this.addKeyListener(this);
	}

	public void paint(Graphics g) {
		g.drawImage(image, x, y, x+50, y+50, sel*50, 0, sel*50+50, 50, this);
//		g.drawImage(image, x, y,  this);
		String pos = "x="+x+"\ty="+y;
		g.drawString(pos, 50, 50);
	}

	public static void main(String[] args) {
		new KeyEventGame();
	}

	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode()==e.VK_RIGHT){
			if(flag==true){
				sel=6; flag=false;}
			else{
				sel=7;
				flag=true;}
			x=x+20;
			
			if(x>=550)
				x=0;
		}
		else if(e.getKeyCode()==e.VK_LEFT){
			if(flag==true){
				sel=0; flag=false;}
			else{
				sel=1;
				flag=true;}
			
			x=x-20;

				if(x<=0)
					x=600;
			
		}
		else if(e.getKeyCode()==e.VK_UP){
			if(flag==true){
				sel=3; flag=false;}
			else{
				sel=2;
				flag=true;}
			y=y-20;
			
			if(y<=0)
				y=400;
		}
		else if(e.getKeyCode()==e.VK_DOWN){
			if(flag==true){
				sel=4; flag=false;}
			else{
				sel=5;
				flag=true;}
			y=y+20;
	
			if(y>=400)
				y=0;
		}
		else if(e.getKeyCode()==e.VK_ESCAPE){
			System.exit(0);
		}
		
		this.repaint();
			
	}
	public void keyReleased(KeyEvent e) {
		
	}
	public void keyTyped(KeyEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) { System.exit(1);}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}

	public void run() {
		//무한루프while(true) { } =>게임,채팅,네트워크 프로그램
		
	}

}
