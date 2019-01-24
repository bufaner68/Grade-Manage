package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

import entity.Student;

public class StudentMainView extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel main_panel = null;//�����
	private JPanel wel_panel = null;//welcome ���
	private JPanel btn_panel = null;//��ť�����
	private JDesktopPane funcDesktop = null;//�������
	
	private JButton btn_query = null;//ѧ���ɼ���ѯ��ť
	private JButton btn_query_grade = null;//ѧ��������Ϣ��ѯ��ť
	private JButton btn_exit = null;//�˳���ť
	private JLabel deskLabel = null; //�����Ƭ��Label
	private JLabel lb_welcome = null;//��ӭ����
	private Student student = null;
	
	public StudentMainView(){
//		this.student = student;
		init();
		registerListener();
		registerListerer1();
	}
	
	private void init(){
		main_panel = new JPanel(new BorderLayout());
		btn_panel = new JPanel(new GridLayout(5,3,1,30));
		btn_query_grade = new JButton("�ɼ���ѯ");
		btn_query = new JButton("������Ϣ��ѯ");
		btn_exit = new JButton("�˳�ϵͳ");
		
		//������Щ��ť������䰴ť���
		btn_panel.add(new JLabel());
		btn_panel.add(btn_query_grade);
		btn_panel.add(btn_query);
		btn_panel.add(btn_exit);
		btn_panel.add(new JLabel());
		
		//�������ı߿����
		btn_panel.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createRaisedBevelBorder(),"��ݹ�����"));
		
		//��ʼ����ӭ���
		wel_panel = new JPanel();
		lb_welcome = new JLabel("��ӭʹ�óɼ�����ϵͳ");
		lb_welcome.setFont(new Font("����", Font.BOLD, 18));
		lb_welcome.setForeground(Color.BLACK);
		wel_panel.add(lb_welcome);
		
		//��ʼ���������
		funcDesktop = new JDesktopPane();
		ImageIcon image = new ImageIcon("src/images/manager.jpg");
		deskLabel = new JLabel(image);
		deskLabel.setBounds(0,0,image.getIconWidth(),image.getIconHeight());
		funcDesktop.add(deskLabel,-1000);
		
		main_panel.add(btn_panel,BorderLayout.EAST);
		main_panel.add(wel_panel,BorderLayout.NORTH);
		main_panel.add(funcDesktop,BorderLayout.CENTER);
		
		this.setTitle("ѧ������");
		this.getContentPane().add(main_panel);
		this.setSize(650,450);//���ڴ�С
		this.setVisible(true);
		this.setResizable(false);//�����϶������С
		this.setLocationRelativeTo(null);//���������ʾ
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رմ���
		
	}
	
	private void registerListener(){
		btn_exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			 dispose();
			}
		});
		btn_query_grade.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				StudentQueryGradeView qgd = new StudentQueryGradeView();
				funcDesktop.add(qgd);//��ָ������ͼ��ӵ�������
				qgd.toFront();//��ͼ��ʾ��ǰ��
			}
		});
	}
	private void registerListerer1(){
		btn_query.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				StudentQueryView qgd = new StudentQueryView();
				funcDesktop.add(qgd);//��ָ������ͼ��ӵ�������
				qgd.toFront();//��ͼ��ʾ��ǰ��
				
			}
		});
	}
}
