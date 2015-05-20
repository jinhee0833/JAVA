package net.hb.day19;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class CanvasEx {

	public static void main(String[] args) {
		Frame f=new Frame("Canvas 테스트");
		MyCanvas canvas=new MyCanvas();
		
		canvas.setBackground(Color.yellow);
		f.add(canvas);
		f.setLocation(300, 300);
		f.setSize(200, 200);
		f.setVisible(true);

	}
		}
class MyCanvas extends Canvas{
	public void paint(Graphics g){
		g.setColor(Color.red);
		g.drawRect(20, 20, 100, 100);
	}
}
