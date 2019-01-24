package view;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import biz.impl.StudentBizImpl;
import entity.Student;

public class UpdateStudent1 extends JFrame {
	private JPanel contentPane;
	private JTextField tf_name;
	private JTextField tf_password;
	private JTextField tf_sex;
	private JTextField tf_birthday;
	private JTextField tf_classroom;
	private JTextField tf_major;
	private JTextField tf_faculty;
	private JTextField tf_sno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateStudent frame = new UpdateStudent();
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
	public UpdateStudent1() {
		setTitle("\u66F4\u65B0\u5B66\u751F\u4FE1\u606F");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 444, 370);
		setBounds(100, 100, 444, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(10, 1, 0, 8));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		JLabel label = new JLabel("\u5B66\u751F\u4FE1\u606F\uFF1A");
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblNewLabel = new JLabel("\u59D3\u540D\uFF1A");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lblNewLabel);
		
		tf_name = new JTextField();
		panel_2.add(tf_name);
		tf_name.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		panel_2.add(label_1);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("\u5BC6\u7801\uFF1A");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(lblNewLabel_1);
		
		tf_password = new JTextField();
		panel_3.add(tf_password);
		tf_password.setColumns(10);
		
		JLabel label_2 = new JLabel("");
		panel_3.add(label_2);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel label_3 = new JLabel("\u5B66\u53F7\uFF1A");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_4.add(label_3);
		
		tf_sno = new JTextField();
		panel_4.add(tf_sno);
		tf_sno.setColumns(10);
		
		JLabel label_11 = new JLabel("");
		panel_4.add(label_11);
		
		JPanel panel_5 = new JPanel();
		contentPane.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("\u6027\u522B\uFF1A");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_5.add(lblNewLabel_3);
		
		tf_sex = new JTextField();
		panel_5.add(tf_sex);
		tf_sex.setColumns(10);
		
		JLabel label_4 = new JLabel("");
		panel_5.add(label_4);
		
		JPanel panel_6 = new JPanel();
		contentPane.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("\u51FA\u751F\u5E74\u6708\uFF1A");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_6.add(lblNewLabel_4);
		
		tf_birthday = new JTextField();
		panel_6.add(tf_birthday);
		tf_birthday.setColumns(10);
		
		JLabel label_6 = new JLabel("");
		panel_6.add(label_6);
		
		JPanel panel_7 = new JPanel();
		contentPane.add(panel_7);
		panel_7.setLayout(new GridLayout(1, 3, 0, 0));
		
		JLabel label_5 = new JLabel("\u73ED\u7EA7\uFF1A");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_7.add(label_5);
		
		tf_classroom = new JTextField();
		panel_7.add(tf_classroom);
		tf_classroom.setColumns(10);
		
		JLabel label_7 = new JLabel("");
		panel_7.add(label_7);
		
		JPanel panel_8 = new JPanel();
		contentPane.add(panel_8);
		panel_8.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblNewLabel_5 = new JLabel("\u4E13\u4E1A\uFF1A");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_8.add(lblNewLabel_5);
		
		tf_major = new JTextField();
		panel_8.add(tf_major);
		tf_major.setColumns(10);
		
		JLabel label_8 = new JLabel("");
		panel_8.add(label_8);
		
		JPanel panel_9 = new JPanel();
		contentPane.add(panel_9);
		panel_9.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel label_9 = new JLabel("\u5B66\u9662\uFF1A");
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_9.add(label_9);
		
		tf_faculty = new JTextField();
		panel_9.add(tf_faculty);
		tf_faculty.setColumns(10);
		
		JLabel label_10 = new JLabel("");
		panel_9.add(label_10);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JButton btn_add = new JButton("\u66F4\u65B0");
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String student_name = tf_name.getText().trim();
				String password = tf_password.getText().trim();
				int sno = Integer.parseInt(tf_sno.getText().trim());
				String sex = tf_sex.getText().trim();
				String birthday = tf_birthday.getText().trim();
				int classroom =Integer.parseInt(tf_classroom.getText().trim()) ;
				String major = tf_major.getText().trim();
				String faculty = tf_faculty.getText().trim();
				StudentBizImpl a = new StudentBizImpl();
				Student student = new Student(student_name,password,sno, sex, birthday,classroom, major, faculty);
				boolean b = a.addStudent(student);
				if (b == true) {
					JOptionPane.showMessageDialog(UpdateStudent1.this, "更新成功");
				} else {
					JOptionPane.showMessageDialog(UpdateStudent1.this, "更新失败");
				}
			}
		});
		panel.add(btn_add);
		JButton btn_quit = new JButton("\u53D6\u6D88");
		btn_quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		panel.add(btn_quit);
		this.setVisible(true);
	}



}
