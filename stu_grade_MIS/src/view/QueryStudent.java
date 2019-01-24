package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import entity.Grade;
import entity.Student;
import entity.Student2;
import impl.GradeDaoImpl;
import impl.StudentDaoImpl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class QueryStudent extends JFrame {

	private JPanel contentPane=null;
	private JScrollPane panel_left=null;
	private JPanel panel_right=null;
	private JTextField tf_type;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QueryStudent frame = new QueryStudent();
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
	public QueryStudent() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 550, 350);
		contentPane = new JPanel();
		this.setContentPane(contentPane);
//		this.setResizable(false);//不可拖放
		this.setTitle("\u7BA1\u7406\u5458\u67E5\u8BE2\u5B66\u751F\u4FE1\u606F\u754C\u9762");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		panel_right = new JPanel();
		panel_right.setBounds(388, 0, 146, 301);
		panel_right.setLayout(null);
		panel_left= new JScrollPane();
		panel_left.setBounds(10, 10, 376, 291);
		
		String[] bg= {"学号","姓名","性别","出生日","班级","专业","学院"};
		DefaultTableModel tableScore=new DefaultTableModel(null,bg);
		JTable table=new JTable(tableScore);
		panel_left.setViewportView(table);
		contentPane.add(panel_right);
		
		JLabel label = new JLabel("\u67E5\u8BE2\u6761\u4EF6");
		label.setBounds(10, 10, 54, 15);
		panel_right.add(label);
		     
		JLabel label_1 = new JLabel("\u67E5\u8BE2\u7C7B\u578B");
		label_1.setBounds(0, 46, 54, 15);
		panel_right.add(label_1);
		
		JComboBox cb_type = new JComboBox();
		cb_type.setModel(new DefaultComboBoxModel(new String[] {"\u6309\u5B66\u53F7\u67E5\u8BE2", "\u6309\u73ED\u7EA7\u67E5\u8BE2", "\u6309\u4E13\u4E1A\u67E5\u8BE2", "\u6309\u5B66\u9662\u67E5\u8BE2"}));
		cb_type.setBounds(30, 83, 86, 34);
		panel_right.add(cb_type);
		
		JButton btn_select = new JButton("\u67E5\u8BE2");
		btn_select.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int count1= tableScore.getRowCount(); 
				for(int i=0;i<count1;i++){
					tableScore.removeRow(0);
				}
				int index = cb_type.getSelectedIndex();
				if(index==0){
					
					int sno = Integer.parseInt(tf_type.getText().trim());
					StudentDaoImpl student = new StudentDaoImpl();
					 List<Student2> b =student.queryStudentBySno(sno);
					 if(b.size()<=0){
						 JOptionPane.showMessageDialog(QueryStudent.this, "查询结果为空！");
					 }else{
							 for(int i=0;i<b.size();i++){
								 String[] count = {String.valueOf(b.get(i).getSno()),b.get(i).getStudent_name(),b.get(i).getSex(),String.valueOf(b.get(i).getBirthday()),String.valueOf(b.get(i).getClassroom()),String.valueOf(b.get(i).getMajor()),String.valueOf(b.get(i).getFaculty())};
								 tableScore.addRow(count);
							 }
						 }
					 }
				 if(index==1){
					int classroom =  Integer.parseInt(tf_type.getText().trim());
					StudentDaoImpl student = new StudentDaoImpl();
					 List<Student2> b =student.queryStudentByClassroom(classroom);
					 if(b==null){
						 JOptionPane.showMessageDialog(QueryStudent.this, "查询结果为空！");
					 }else{
							 for(int i=0;i<b.size();i++){
								 String[] count = {String.valueOf(b.get(i).getSno()),b.get(i).getStudent_name(),b.get(i).getSex(),String.valueOf(b.get(i).getBirthday()),String.valueOf(b.get(i).getClassroom()),String.valueOf(b.get(i).getMajor()),String.valueOf(b.get(i).getFaculty())};
								 tableScore.addRow(count);
							 }
						 }
				}
				else if(index==2){
					String major =tf_type.getText().trim();
					StudentDaoImpl student = new StudentDaoImpl();
					 List<Student2> b =student.queryStudentByMajor(major);
					 if(b.size()<=0){
						 JOptionPane.showMessageDialog(QueryStudent.this, "查询结果为空！");
					 }else{
							 for(int i=0;i<b.size();i++){
								 String[] count = {String.valueOf(b.get(i).getSno()),b.get(i).getStudent_name(),b.get(i).getSex(),String.valueOf(b.get(i).getBirthday()),String.valueOf(b.get(i).getClassroom()),String.valueOf(b.get(i).getMajor()),String.valueOf(b.get(i).getFaculty())};
								 tableScore.addRow(count);
							 }
							 }
						 }
				else if(index==3){
					String faculty =tf_type.getText().trim();
					StudentDaoImpl student = new StudentDaoImpl();
					 List<Student2> b =student.queryStudentByFaculty(faculty);
					 if(b.size()<=0){
						 JOptionPane.showMessageDialog(QueryStudent.this, "查询结果为空！");
					 }else{
							 for(int i=0;i<b.size();i++){
								 String[] count = {String.valueOf(b.get(i).getSno()),b.get(i).getStudent_name(),b.get(i).getSex(),String.valueOf(b.get(i).getBirthday()),String.valueOf(b.get(i).getClassroom()),String.valueOf(b.get(i).getMajor()),String.valueOf(b.get(i).getFaculty())};
								 tableScore.addRow(count);
							 }
							 }
						 }
			}
		});
		btn_select.setBounds(33, 190, 86, 34);
		panel_right.add(btn_select);
		
		JButton btn_quit = new JButton("\u8FD4\u56DE");
		btn_quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btn_quit.setBounds(33, 241, 86, 34);
		panel_right.add(btn_quit);
		
		tf_type = new JTextField();
		tf_type.setBounds(17, 138, 118, 32);
		panel_right.add(tf_type);
		tf_type.setColumns(10);
		contentPane.add(panel_left);
		this.setVisible(true);
	}
}
