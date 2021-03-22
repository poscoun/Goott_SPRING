package java_network;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame implements ActionListener, KeyListener, Runnable {

	// GUI 관련 요소
	JButton jbtn1, jbtn2, jbtn3;
	JPanel jp1, jp2, jp3;
	JTextField jtf1, jtf2;
	JTextArea jta;
	JLabel jlb;
	JScrollPane jsp;
	CardLayout layout;
	
	// 채팅 관련 요소
	Socket s;
	PrintWriter pw;
	BufferedReader br;
	
	// ip
	String ip;
	
	public ChatClient() {
		super("ChatClient v 1.01");
		setBounds(1100, 400, 400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		layout = new CardLayout();
		setLayout(layout);
		
		jbtn1 = new JButton("Login");
		jbtn2 = new JButton("Exit");
		
		jbtn3 = new JButton("Insert");
		
		jbtn1.setBounds(60, 200, 80, 50);
		jbtn2.setBounds(180, 200, 60, 50);
		
		jlb = new JLabel("I P : ");
		jlb.setBounds(40, 60, 60, 50);
		
		jtf1 = new JTextField("172.16.7.50");
		jtf1.setBounds(100, 60, 150, 40);
		
		jtf2 = new JTextField(25);
		
		jta = new JTextArea();
		
		jsp = new JScrollPane(jta, 
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		jp1 = new JPanel();
		jp1.setLayout(null);
		jp1.add(jbtn1);
		jp1.add(jbtn2);
		jp1.add(jtf1);
		jp1.add(jlb);
		
		Color c1 = new Color(29, 119, 22);
		jp1.setBackground(c1);
		
		add(jp1, "Login View");
		
		jp2 = new JPanel();
		jp3 = new JPanel();
		
		jp2.setLayout(new BorderLayout());
		jp2.add(jsp, "Center");
		
		add(jp2, "Chat");
		
		Color c2 = new Color(241, 232, 92);
		jp3.setBackground(c2);
		
		jp3.add(jtf2);
		jp3.add(jbtn3);
		
		jp2.add(jp3, "South");
		
		jbtn1.addActionListener(this);
		jbtn2.addActionListener(this);
		
		jtf2.addKeyListener(this);
		
		setVisible(true);		
	}
	
	public static void main(String[] args) {
		new ChatClient();
	}	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 소켓 IO
		
		try {
			s = new Socket(ip, 5000);
			
			// 발신부
			pw = new PrintWriter(
					new BufferedWriter(
							new OutputStreamWriter(
									s.getOutputStream())));
			
			// 수신부
			br = new BufferedReader(
					new InputStreamReader(
							s.getInputStream()));
			
			String msg = null;
			while(true) {
				msg = br.readLine();
				
				jta.append(msg + "\n");
				
				JScrollBar bar = jsp.getVerticalScrollBar();
				bar.setValue(bar.getMaximum());
				
			}
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_ENTER) {
			String msg = jtf2.getText();
			
			jta.append(msg + "\n");
			
			pw.println(msg);
			pw.flush();
			
			jtf2.setText("");			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		
		if(obj==jbtn1) {
			System.out.println("login");
			ip = jtf1.getText();
			//System.out.println("ip : "+ ip);
			layout.show(getContentPane(), "Chat");
			
			// client 채팅 기능 수행 (시작)
			Thread th = new Thread(this);
			th.start();
			
		}else if(obj==jbtn2) {
			int result = 
					JOptionPane.showConfirmDialog(this, "종료할까요?", "real", JOptionPane.YES_NO_CANCEL_OPTION);
			
			if(result==JOptionPane.YES_OPTION) {
				System.out.println("종료합니다");
				System.exit(0);
			}
			
		}
		
		
	}

}

















