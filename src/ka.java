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


public class ka {

	private JFrame frame;

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
		ChatArea.setEditable(false);
		ChatArea.setBounds(10, 43, 357, 139);
		frame.getContentPane().add(ChatArea);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(373, 43, 17, 139);
		frame.getContentPane().add(scrollBar);
		
		JTextArea inputText = new JTextArea();
		inputText.setEditable(false);
		inputText.setLineWrap(true);
		inputText.setBounds(10, 209, 277, 91);
		frame.getContentPane().add(inputText);
		
		JButton btnSend = new JButton("Send");
		btnSend.setBounds(297, 209, 89, 37);
		frame.getContentPane().add(btnSend);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(297, 257, 89, 43);
		frame.getContentPane().add(btnClear);
	}
	
}
