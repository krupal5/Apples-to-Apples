import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JButton;

import java.net.*;
import java.io.*;
import java.util.*;
import javax.swing.JTextField;


public class ka {

	private JFrame frame;
	String username, serverIP = "192.168.5.99";
	int port = 5000;
	Socket sock;
	BufferedReader reader;
	PrintWriter writer;
	Boolean isConnected = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ka window = new ka();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	public class IncomingReader implements Runnable {
		public void run() {
			
		}
	}
	
    private JTextField textField;
	/**
	 * Create the application.
	 */
	public ka() {
		initialize();
	}
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 416, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblChatRoom = new JLabel("Chat Room");
		lblChatRoom.setBounds(163, 11, 78, 14);
		frame.getContentPane().add(lblChatRoom);
		
		JTextArea ChatArea = new JTextArea();
		ChatArea.setLineWrap(true);
		ChatArea.setBounds(10, 43, 357, 139);
		frame.getContentPane().add(ChatArea);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(373, 43, 17, 139);
		frame.getContentPane().add(scrollBar);
		
		JTextArea inputText = new JTextArea();
		inputText.setLineWrap(true);
		inputText.setBounds(10, 209, 277, 91);
		frame.getContentPane().add(inputText);
		
		JButton btnSend = new JButton("Send");
		btnSend.setBounds(297, 209, 89, 37);
		frame.getContentPane().add(btnSend);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(297, 257, 89, 43);
		frame.getContentPane().add(btnClear);
		
		textField = new JTextField();
		textField.setBounds(10, 8, 143, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.setBounds(230, 7, 73, 23);
		frame.getContentPane().add(btnConnect);
		
		JButton btnNewButton = new JButton("cancel");
		btnNewButton.setBounds(313, 7, 77, 23);
		frame.getContentPane().add(btnNewButton);
	}
	
}
