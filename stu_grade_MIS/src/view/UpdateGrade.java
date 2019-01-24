package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import biz.impl.GradeBizImpl;
import entity.Grade;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateGrade extends JFrame {

	private JPanel panelContent;
	private JTextField tf_sno;
	private JTextField tf_cno;
	private JTextField tf_cno_name;
	private JTextField tf_grade;
	private JTextField tf_bu_grade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateGrade frame = new UpdateGrade();
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
	public UpdateGrade() {
		setTitle("\u66F4\u65B0\u6210\u7EE9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panelContent = new JPanel();
		panelContent.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelContent);
		panelContent.setLayout(new GridLayout(7, 1, 0, 10));
		
		JPanel panel_1 = new JPanel();
		panelContent.add(panel_1);
		
		JLabel label_4 = new JLabel("\u6210\u7EE9\u4FE1\u606F\uFF1A");
		panel_1.add(label_4);
		
		JPanel panel_2 = new JPanel();
		panelContent.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblNewLabel = new JLabel("\u5B66\u53F7\uFF1A");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lblNewLabel);
		
		tf_sno = new JTextField();
		panel_2.add(tf_sno);
		tf_sno.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panelContent.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("\u8BFE\u7A0B\u53F7\uFF1A");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(lblNewLabel_2);
		
		tf_cno = new JTextField();
		panel_3.add(tf_cno);
		tf_cno.setColumns(10);
		
		JLabel label = new JLabel("");
		panel_3.add(label);
		
		JPanel panel_4 = new JPanel();
		panelContent.add(panel_4);
		panel_4.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("\u8BFE\u7A0B\u540D\u79F0\uFF1A");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_4.add(lblNewLabel_3);
		
		tf_cno_name = new JTextField();
		panel_4.add(tf_cno_name);
		tf_cno_name.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		panel_4.add(label_1);
		
		JPanel panel_5 = new JPanel();
		panelContent.add(panel_5);
		panel_5.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("\u6210\u7EE9\uFF1A");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_5.add(lblNewLabel_4);
		
		tf_grade = new JTextField();
		panel_5.add(tf_grade);
		tf_grade.setColumns(10);
		
		JLabel label_2 = new JLabel("");
		panel_5.add(label_2);
		
		JPanel panel_6 = new JPanel();
		panelContent.add(panel_6);
		panel_6.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNewLabel_5 = new JLabel("\u8865\u8003\u6210\u7EE9\uFF1A");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_6.add(lblNewLabel_5);
		
		tf_bu_grade = new JTextField();
		panel_6.add(tf_bu_grade);
		tf_bu_grade.setColumns(10);
		
		JLabel label_3 = new JLabel("");
		panel_6.add(label_3);
		
		JPanel panel = new JPanel();
		panelContent.add(panel);
		
		JButton btnNewButton = new JButton("\u4FEE\u6539");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sno = Integer.parseInt(tf_sno.getText().trim());
				int cno = Integer.parseInt(tf_cno.getText().trim());
				String course_name = tf_cno_name.getText().trim();
     			int grade = Integer.parseInt(tf_grade.getText().trim());
				int bu_grade = Integer.parseInt(tf_bu_grade.getText().trim());
				GradeBizImpl a = new GradeBizImpl();
//				Grade newgrade = new Grade(sno, cno, course_name, grade, bu_grade);
				boolean b = a.updateGrade(sno, cno, course_name, grade, bu_grade);
				if (b == true) {
					JOptionPane.showMessageDialog(UpdateGrade.this, "更新成功");
				} else {
					JOptionPane.showMessageDialog(UpdateGrade.this, "更新失败");
				}
			}
		});
		panel.add(btnNewButton);
		
		JButton button = new JButton("\u53D6\u6D88");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		panel.add(button);
		this.setVisible(true);
	}

}
