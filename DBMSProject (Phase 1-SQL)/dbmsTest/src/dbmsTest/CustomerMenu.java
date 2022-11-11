package dbmsTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerMenu frame = new CustomerMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CustomerMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 796, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer Info");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 760, 47);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Insert Customer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InsertCustomer ic = new InsertCustomer();
				ic.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(154, 114, 167, 40);
		contentPane.add(btnNewButton);
		
		JButton btnUpdateInfo = new JButton("Update info");
		btnUpdateInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchCustomer sc= new searchCustomer();
				sc.setVisible(true);
				dispose();
			}
		});
		btnUpdateInfo.setForeground(Color.WHITE);
		btnUpdateInfo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnUpdateInfo.setBackground(Color.BLACK);
		btnUpdateInfo.setBounds(451, 114, 167, 40);
		contentPane.add(btnUpdateInfo);
		
		JButton btnDeleteCustomer = new JButton("Delete Customer");
		btnDeleteCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteCustomer dc= new DeleteCustomer();
				dc.setVisible(true);
				dispose();
			}
			
		});
		btnDeleteCustomer.setForeground(Color.WHITE);
		btnDeleteCustomer.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnDeleteCustomer.setBackground(Color.BLACK);
		btnDeleteCustomer.setBounds(301, 193, 167, 40);
		contentPane.add(btnDeleteCustomer);
	}

}
