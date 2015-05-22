package net.hb.day20;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyPack extends Frame implements KeyListener {
	private int x, y, sel;
	private boolean flag = true;
	private Image image;

	public MyPack() {
		x = 200;
		y = 200;
		sel = 0;

		Toolkit tk = null;
		tk = Toolkit.getDefaultToolkit();
		image = tk.getImage("C:/Mtest/images/packman.png");

		this.setTitle("PackMan");
		this.setBackground(Color.green);
		this.setBounds(200, 200, 600, 400);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(1);
			}
		});
		this.addKeyListener(this);

	}

	public void paint(Graphics g) {

		g.drawImage(image, x, y, x + 50, y + 50, sel * 50, 0, sel * 50 + 50, 50,
				this);
		g.drawString("x=" + x + "\ty=" + y, 50, 50);
	}

	public static void main(String[] args) {
		new MyPack();
	}

	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==e.VK_RIGHT)
		{
			if(flag==true){
				sel=6; flag=false;
			}else{
				sel=7; flag=true;
			}
				
			x=x+20;
			
			if(x>=550){
				x=0;
			}	
		}
		else if(e.getKeyCode()==e.VK_LEFT)
		{
			if(flag==true){
				sel=0; flag=false;
			}else{
				sel=1; flag=true;
			}
				
			x=x-20;
			
			if(x<=0){
				x=550;
			}	
		}
		else if(e.getKeyCode()==e.VK_UP)
		{
			if(flag==true){
				sel=3; flag=false;
			}else{
				sel=2; flag=true;
			}
				
			y=y-20;
			
			if(y<=0){
				y=400;
			}	
		}
		else if(e.getKeyCode()==e.VK_DOWN)
		{
			if(flag==true){
				sel=4; flag=false;
			}else{
				sel=5; flag=true;
			}
				
			y=y+20;
			
			if(y>=350){
				y=0;
			}	
		}
		else if(e.getKeyCode()==e.VK_ESCAPE)
		{
			System.exit(0);
		}
		this.repaint();
	}

	public void keyReleased(KeyEvent arg0) {
	}

	public void keyTyped(KeyEvent arg0) {
	}

}
