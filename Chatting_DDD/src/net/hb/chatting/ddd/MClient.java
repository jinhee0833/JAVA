package net.hb.chatting.ddd;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.List;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class MClient extends JFrame implements ActionListener, Runnable {
	JPanel jp3 = new JPanel();
	BorderLayout border = new BorderLayout();
	JPanel jp4 = new JPanel(border);
	JPanel jp6 = new JPanel(new BorderLayout());
	JPanel jp9 = new JPanel();
	JPanel jp10 = new JPanel(new BorderLayout());
	JPanel jp11 = new JPanel();
	JPanel jp12 = new JPanel();
	JTextField tf_name = new JTextField(10);
	JTextField tf_msg = new JTextField(30);
	Vector<TextArea> v = new Vector<TextArea>();
	JFrame jf = new JFrame("Messenger");
	JTabbedPane jtp = new JTabbedPane();
	TextArea ta_out = new TextArea(25, 1);
	JButton jb_cl = new JButton(new ImageIcon("C:/Mtest/my3/Chatting_DDD/file.gif"));
	JButton jb_send = new JButton(new ImageIcon("C:/Mtest/my3/Chatting_DDD/send.gif"));
	JButton jb_join = new JButton("Join");
	List list = new List(23);
	Map<String, Boolean> NameList = new HashMap<String, Boolean>();
	Boolean isCreatedTab = false;
	JMenuBar mb = new JMenuBar();
	JMenu mfile = new JMenu("File");
	JMenuItem mopen = new JMenuItem("opne file");
	JMenuItem msave = new JMenuItem("save file");
	JMenuItem mexit = new JMenuItem("exit");
	int num = 1, count = 0, hh, mm, ss;
	Calendar now;
	String time;
	OutputStream out;
	BufferedReader in;
	Socket soc;
	String nick = null;

	public MClient() {
		initializeWindow();
		layoutCom();
	}// end

	public void layoutCom() {
		v.add(new TextArea());
		this.jtp.addTab("All", jp11.add((TextArea) v.get(0)));
		v.get(0).setBackground(new Color(178, 204, 255));
		jtp.setPreferredSize(new Dimension(100, 425));
		jp12.add(tf_name);
		jp12.add(jb_join);
		jp3.add(jb_cl); 
		jp3.add(tf_msg);
		jp3.add(jb_send); 
		jp4.add("Center", jtp);
		border.setHgap(15);
		jp4.add("West", list);
		jp6.add("East", jp3);
		jp6.add("West", jp12);
		jf.setJMenuBar(mb);
		jf.getContentPane().add("South", jp6);
		jf.getContentPane().add("North", jp4);
		jf.setSize(700, 640);
		jf.setResizable(false);
		mb.add(mfile);
		mfile.add(mopen);
		mfile.add(msave);
		mfile.addSeparator();
		mfile.add(mexit);
		for (int i = 0; i < 20; i++)
			list.add(" ");
		list.setBackground(new Color(255, 167, 167));
		jf.pack();
		jf.setLocationRelativeTo(null);
		jb_send.setToolTipText("메세지 보내기");
		jb_cl.setToolTipText("파일 전송");
	}// layout end

	public void initializeWindow() {
		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				exit();
			}
		});

		MouseListener mouseListener = new MouseAdapter() {

			public void mouseClicked(MouseEvent ae) {

				if (ae.getClickCount() == 2) {
					nick = list.getSelectedItem().toString();

					if (!(NameList.get(nick))) { // New Create
						v.add(new TextArea());
						jtp.addTab(nick, new JPanel().add(v.get(num)));
						v.get(num).setBackground(new Color(178, 204, 255));
						num++;
						isCreatedTab = true;
						NameList.put(nick, isCreatedTab);
						jtp.setSelectedIndex(jtp.indexOfTab(nick));
					} else if (nick.equals(jtp.getTitleAt(jtp.indexOfTab(nick)))) {
						jtp.setSelectedIndex(jtp.indexOfTab(nick));
					}
				}
				if (ae.getButton() == 3) {
					int i = jtp.getSelectedIndex();
					if (i > 0)
						jtp.remove(i);
				}
			} // end mouseClicked
		}; // end Mouselistener

		jp3.setBackground(Color.white);
		jp4.setBackground(Color.white);
		jp6.setBackground(Color.white);
		jp9.setBackground(Color.white);
		jp10.setBackground(Color.white);
		ta_out.setBackground(Color.white);
		ta_out.setFont(new Font("굴림체", Font.BOLD, 16));
		list.setFont(new Font("굴림체", Font.BOLD, 16));
		jf.setResizable(true);
		ta_out.setEditable(true);
		jf.setVisible(true);
		mexit.addActionListener(this);
		msave.addActionListener(this);
		mopen.addActionListener(this);
		jb_send.addActionListener(this);
		tf_msg.addActionListener(this);
		tf_name.addActionListener(this);
		ta_out.setForeground(Color.white);
		jb_cl.addActionListener(this);
		list.addMouseListener(mouseListener);
		jb_join.addActionListener(this);
		jtp.addMouseListener(mouseListener);
	}// end

	public void exit() {
		try {
			out.write(("/q" + tf_name.getText() + "\n").getBytes());
			System.out.println("sender : " + tf_name.getText());
			ta_out.append("****" + tf_name.getText() + "님이 퇴장하셨습니다****\r\n");
			in.close();
			out.close();
			soc.close();
		} catch (Exception ex) {
			System.out.println("보내기 오류 " + ex.getMessage());
		}
		ta_out.setEnabled(false);
		tf_msg.setEnabled(false);
		tf_name.setEnabled(true);
		tf_name.setText("");
		tf_name.requestFocus();
		System.exit(1);
	}// exit end

	public void fileSave() {
		FileDialog fd = new FileDialog(this, "save", FileDialog.SAVE);
		fd.setVisible(true);
		String dir = fd.getDirectory();
		System.out.println("fd.getDirectory(): " + dir); 
		String file = fd.getFile();
		if (dir == null || file == null)
			return;
		File f = new File(dir + file);
		try {
			PrintWriter pw = new PrintWriter(f);
			pw.println(ta_out.getText());
			pw.close();
			ta_out.append("대화내용이 저장되었습니다\r\n");
		} catch (Exception e) {
		}
	}// fileSave end

	public void fileOpen() {
		FileDialog fd = new FileDialog(this, "open", FileDialog.LOAD);
		fd.setVisible(true);
		String dir = fd.getDirectory();
		String file = fd.getFile();
		if (dir == null || file == null)
			return;
		try {
			FileReader fr = new FileReader(dir + file);
			BufferedReader br = new BufferedReader(fr);
			while (true) {
				String data = "";
				data = br.readLine();
				if (data == null)
					break;
				out.write((tf_name.getText() + data + "\n").getBytes());
			}
		} catch (Exception e) {
		}
	}// fileOpen end

	public void showMsg(int i_Text, String msg, String ipAdress, String sender) throws Exception {

		System.out.println("in showMSg");
		System.out.println("ip adress : " + ipAdress);
		String str = msg;
		int lineMaxCnt = 15;
		int colMaxNum = (int) str.length() / lineMaxCnt;
		int lastCharNum = str.length() - colMaxNum * lineMaxCnt;
		StringBuilder modifyStr;
		String spaceStr = "  ";
		int idx = 0;
		String lastLineStr = null;
		StringBuilder lastmodifyStr = null;
		InetAddress selfIP = InetAddress.getLocalHost();
		if (!(selfIP.getHostAddress().equals(ipAdress))) {
			v.get(i_Text).append(sender + "\n");
			while (true) {
				if (idx + lineMaxCnt >= str.length()) {
					break;
				}
				System.out.println("showMsg : while");
				modifyStr = new StringBuilder(spaceStr);
				modifyStr.append(str.substring(idx,
						Math.min(str.length(), (idx + lineMaxCnt))));
				System.out.println(modifyStr.toString());
				System.out.println("jinhee");
				v.get(i_Text).append(modifyStr.toString() + "\n");
				idx += 15;
			} // end while

			if (str.length() != 15) {
				lastLineStr = str.substring(str.length() - lastCharNum); // String
			} else {
				lastLineStr = str; // String
			}
			lastmodifyStr = new StringBuilder(spaceStr + lastLineStr);
			for (int i = (lastLineStr).length(); i < lineMaxCnt; i++) {
				lastmodifyStr.append(" ");
			}
			System.out.println(lastmodifyStr.toString() + "    " + time);
			v.get(i_Text).append(lastmodifyStr.toString() + "\t" + time + "\n\n\n");
		} else {
			String spaceForRight = " ";
			int spaceCnt = 75;
			StringBuilder sbSpace4Right;
			idx = 0;
			while (true) {
				System.out.println("right side while ");
				if (idx + lineMaxCnt >= str.length()) {
					break;
				}
				sbSpace4Right = new StringBuilder(spaceForRight);
				for (int i = 0; i < spaceCnt; i++) {
					sbSpace4Right.append(spaceForRight);
				}
				sbSpace4Right.append(str.substring(idx,
						Math.min(str.length(), (idx + lineMaxCnt))));
				System.out.println(sbSpace4Right.toString());
				v.get(i_Text).append(sbSpace4Right.toString() + "\n");
				idx += 15;
			}// end while
			System.out.println("from last line ");
			lastLineStr = null; 
			if (str.length() != 15) {
				lastLineStr = str.substring(str.length() - lastCharNum); 
			} else {
				lastLineStr = str; 
			}
			lastmodifyStr = new StringBuilder(spaceStr + lastLineStr); 
			sbSpace4Right = new StringBuilder(spaceForRight);
			for (int i = 0; i < spaceCnt - time.length() - 7; i++) {
				sbSpace4Right.append(spaceForRight);
			}
			System.out.println(sbSpace4Right.toString() + time + " : " + lastLineStr);
			v.get(i_Text).append(
					sbSpace4Right.toString() + time + "  " + lastLineStr + "\n\n\n");
			System.out.println(v.get(i_Text).getWidth());
		} // end if~else
	}// end showMsg

	public void run() {
		String[] receivedStr;
		System.out.println("in run method");
		while (true) {
			try {
				String msg = in.readLine();
				System.out.println("get msg from server : " + msg);
				if (msg.charAt(0) == '/') {
					if (msg.charAt(1) == 'c') {
						if (!(NameList.containsKey(msg.substring(2)))) {
							list.replaceItem(msg.substring(2), count);
							count++;
							NameList.put(msg.substring(2), isCreatedTab);
						}
					}
				}
				int i = jtp.getSelectedIndex();
				jb_join.setEnabled(false);
				receivedStr = msg.split("::");
				showMsg(i, receivedStr[1], receivedStr[0], receivedStr[2]);
				if (msg == null) {
					NameList.put(msg.substring(2), isCreatedTab);
					return;
				}
			} catch (Exception e) {
				ta_out.append(e.getMessage());
			}
		}// end while
	}// run end

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mexit) {
			try {
				out.write(("/q" + tf_name.getText() + "\n").getBytes());
				ta_out.append("****" + tf_name.getText() + "님이 퇴장하셨습니다****\r\n");
				in.close();
				out.close();
				soc.close();
			} catch (Exception ex) {
				System.out.println("보내기 오류 " + ex.getMessage());
			}
			ta_out.setEnabled(false);
			tf_msg.setEnabled(false);
			tf_name.setEnabled(true);
			tf_name.setText("");
			tf_name.requestFocus();
		} else if (e.getSource() == msave) {
			fileSave();
		} else if (e.getSource() == mopen) {
			fileOpen();
		} else if (e.getSource() == jb_send || e.getSource() == tf_msg) {
			sendProcess();
		} else if (e.getSource() == tf_name || e.getSource() == jb_join) {
			System.out.println("action");
			connect();
		} else if (e.getSource() == jb_cl) {
			ta_out.setText("");
		}

	}// actionPerformed end

	public void sendProcess() {
		InetAddress selfIP;
		String str = tf_msg.getText();
		try {
			if (str.charAt(0) == 'q') {
				out.write(("/q" + tf_name.getText() + "\n").getBytes());
				System.out.println("서버로 보냄 >> " + tf_name.getText() + " \n");
				in.close();
				out.close();
				soc.close();
				System.exit(0);
			}
			selfIP = InetAddress.getLocalHost();
			String userName = tf_name.getText();
			System.out.println("send process: " + selfIP.getHostAddress());
			str = selfIP.getHostAddress() + "::" + str + "::" + userName;
			int i = jtp.getSelectedIndex();
			now = Calendar.getInstance();
			hh = now.get(now.HOUR_OF_DAY);
			mm = now.get(now.MINUTE);
			ss = now.get(now.SECOND);
			time = hh + ":" + mm + ":" + ss;
			tf_msg.setText("");
			tf_msg.requestFocus();
		} catch (Exception e) {
			ta_out.append(e.getMessage());
		}
		PrintWriter pw = new PrintWriter(out, true);
		pw.println(str); 
		tf_msg.setText("");
		tf_msg.requestFocus();
		try {
			selfIP = InetAddress.getLocalHost();
		} catch (Exception e) {
			ta_out.append(e.getMessage());
		}

	}// end sendProcess

	public void connect() { 
		System.out.println("connect");
		ta_out.setEnabled(true);
		tf_msg.setEnabled(true);
		try {
			soc = new Socket("203.236.209.120", 8000); 
			in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			out = soc.getOutputStream(); 
			out.write(("/c" + tf_name.getText() + "\n").getBytes()); 
			System.out.println("send to server >> " + tf_name.getText());
			new Thread(this).start(); 
			tf_msg.requestFocus();
		} catch (Exception e) {
			ta_out.append(e.getMessage());
		} 
	}// end connect

	public static void main(String[] args) {
		System.out.println("main 시작");
		MClient mc = new MClient();
		Thread tr = new Thread(mc);
	}// main end

}// class END