import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.Label;


public class IpFounder extends JFrame{
	private JTextField txtAddress;
	private JLabel lbl = new JLabel("");
	private JButton btnFind;
	private EnterKeyListener enterKeyListener = new EnterKeyListener();

	public IpFounder() {
		setBackground(Color.DARK_GRAY);
		getContentPane().setLayout(null);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(132, 89, 255, 22);
		getContentPane().add(txtAddress);
		txtAddress.setColumns(10);
		
		JButton btnFind = new JButton("Find IP");
		btnFind.setBounds(214, 184, 84, 30);
		getContentPane().add(btnFind);
		
		getContentPane().setLayout(null);
		
		lbl.setBounds(132, 142, 255, 16);
		getContentPane().add(lbl);
		setVisible(true);
		setSize(500,400);
	
		txtAddress.addKeyListener(enterKeyListener);
		btnFind.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ipCheck();
				
			}

		});
		
	}
	
	private void ipCheck() {
		String host = txtAddress.getText();
		try {
			
			String ip = java.net.InetAddress.getByName(host).getHostAddress();

			lbl.setText("IP of "+ host +" is: "+ip);
			
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null,"Do not found any ip address");
		}// TODO Auto-generated method stub
	}
	
	
	public class EnterKeyListener implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getKeyCode()==KeyEvent.VK_ENTER) {
				ipCheck();				
			}
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
	

	public static void main(String[] args) {
		IpFounder ipfound = new IpFounder();
		

	}
}
