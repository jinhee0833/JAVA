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

public class MyPack2 extends Frame implements KeyListener {
	private Image image;
	public MyPack2() {
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		image = tk.getImage("C:/Mtest/images/packman.png");
		

		this.setTitle("PackMan");
		this.setBackground(new Color(250, 0, 0));
		this.setBounds(200, 200, 600, 400);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}
	
	
	
	public void paint(Graphics g) {
		
	}


	public static void main(String[] args) {
		new MyPack2();

	}
	
	

	public void keyPressed(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
	}

}
