package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import impl.GradeDaoImpl;
import impl.StudentDaoImpl;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DelGrade extends JFrame {

	private JPanel contentPane;
	private JTextField tf_cno;
	private JTextField tf_sno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DelGrade frame = new DelGrade();
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
	public DelGrade() {
		setTitle("\u7BA1\u7406\u5458\u5220\u9664\u5B66\u751F\u6210\u7EE9\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 1, 0, 15));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel label = new JLabel("\u8F93\u5165\u5220\u9664\u5B66\u53F7\uFF1A");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(label);
		
		tf_sno = new JTextField();
		panel_2.add(tf_sno);
		tf_sno.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblNewLabel = new JLabel("\u8F93\u5165\u5220\u9664\u8BFE\u7A0B\u53F7\uFF1A");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(lblNewLabel);
		
		tf_cno = new JTextField();
		panel_3.add(tf_cno);
		tf_cno.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		
		JButton button = new JButton("\u786E\u8BA4\u5220\u9664");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int sno = Integer.parseInt(tf_sno.getText().trim())  ;
			int cno = Integer.parseInt(tf_cno.getText().trim());
			GradeDaoImpl grade = new GradeDaoImpl();
			boolean b= grade.delGrade(sno, cno);
			System.out.println(b);
			if(b==true){
				JOptionPane.showMessageDialog(DelGrade.this, "É¾³ý³É¹¦");
			}else {
				JOptionPane.showMessageDialog(DelGrade.this, "É¾³ýÊ§°Ü");
			}
			}
		});
//		button.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				int index = cb_type.getSelectedIndex();
//				if(index ==0){
//					int sno=Integer.parseInt(tf_del.getText().trim());
//					GradeDaoImpl grade = new GradeDaoImpl();
//					grade.delGrade(sno, cno);
//					boolean b = grade.delGrade(sno,cno);
//					if(b==true){
//						JOptionPane.showMessageDialog(DelGrade.this, "É¾³ý³É¹¦");
//					}else if(b==false){
//						JOptionPane.showMessageDialog(DelGrade.this, "É¾³ýÊ§°Ü");
//					}
//				}
//
//				}
//			}
//		});
		panel_4.add(button);
		
		JButton button_1 = new JButton("\u9000\u51FA");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		panel_4.add(button_1);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		this.setVisible(true);
	}

}
