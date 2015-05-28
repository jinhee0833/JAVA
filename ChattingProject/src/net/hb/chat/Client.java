package net.hb.chat;

import java.awt.Container;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Client extends JFrame {
	private TextArea ta = new TextArea(30, 60);
	private TextField tf = new TextField(30);
	private JButton btnsend = new JButton("Send");
	private JPanel pan = new JPanel();
	private JPanel pan2 = new JPanel();
	private JPanel pan3 = new JPanel();
	private JLabel lb = new JLabel("Server IP:");

	public Client() {
		super("Talk");
		Container ct = getContentPane();
		JMenuBar menubar = new JMenuBar();
		JMenu filemenu = new JMenu("File");
		JMenu helpmenu = new JMenu("Help");
		JMenuItem openItem = new JMenuItem("New");
		JMenuItem saveItem = new JMenuItem("Save");
		JMenuItem exitItem = new JMenuItem("Exit");

		setJMenuBar(menubar);
		menubar.add(filemenu);
		menubar.add(helpmenu);
		filemenu.add(openItem);
		filemenu.add(saveItem);
		filemenu.add(exitItem);

		pan.add(tf);

		pan.add(btnsend);
		pan2.add(ta);
		pan3.add(lb);
		ct.add("North", pan2);
		ct.add("Center", pan);
		ct.add("South", pan3);
		setSize(500, 600);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// end

	public static void main(String[] args) {
		Client cl = new Client();

	}// main end

}// class end
