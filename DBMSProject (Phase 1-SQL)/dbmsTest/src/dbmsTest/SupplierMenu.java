package dbmsTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SupplierMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SupplierMenu frame = new SupplierMenu();
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
	public SupplierMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Supplier Menu");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(36, 11, 726, 52);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add Supplier");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddSupplier as = new AddSupplier();
				as.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(90, 109, 144, 36);
		contentPane.add(btnNewButton);
		
		JButton btnViewAllSuppliers = new JButton("View Suppliers Info");
		btnViewAllSuppliers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewSupplier vs = new ViewSupplier();
				vs.setVisible(true);
				dispose();
			}
		});
		btnViewAllSuppliers.setForeground(Color.WHITE);
		btnViewAllSuppliers.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnViewAllSuppliers.setBackground(Color.BLACK);
		btnViewAllSuppliers.setBounds(551, 109, 144, 36);
		contentPane.add(btnViewAllSuppliers);
		
		JButton btnUpdate = new JButton(" Update Supplier Info");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateSupplier1 us = new UpdateSupplier1();
				us.setVisible(true);
				dispose();
			}
		});
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnUpdate.setBackground(Color.BLACK);
		btnUpdate.setBounds(153, 193, 177, 36);
		contentPane.add(btnUpdate);
		
		JButton btnDeleteSupplier = new JButton("Delete Supplier");
		btnDeleteSupplier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteSupplier ds = new DeleteSupplier();
				ds.setVisible(true);
				dispose();
			}
		});
		btnDeleteSupplier.setForeground(Color.WHITE);
		btnDeleteSupplier.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnDeleteSupplier.setBackground(Color.BLACK);
		btnDeleteSupplier.setBounds(444, 193, 182, 36);
		contentPane.add(btnDeleteSupplier);
	}
}
