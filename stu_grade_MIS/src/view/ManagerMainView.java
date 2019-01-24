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
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ManagerMainView extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel main_panel = null;//主面板
	private JPanel wel_panel = null;//welcome 面板
	private JPanel btn_panel = null;//按钮组面板
	private JDesktopPane funcDesktop = null;//桌面面板
	
	private JButton btn_query = null;//学生成绩查询按钮
	private JButton btn_query_grade = null;//学生个人信息查询按钮
	private JButton btn_exit = null;//退出按钮
	private JLabel deskLabel = null; //存放照片的Label
	private JLabel lb_welcome = null;//欢迎标题
//	private Manager manager =null;
	
	public ManagerMainView(){
		init();
		registerListener();
		registerListerer1();
	}
	
	private void init(){
		main_panel = new JPanel(new BorderLayout());
		btn_panel = new JPanel(new GridLayout(5,3,1,30));
		btn_query_grade = new JButton("学生成绩查询");
		btn_query = new JButton("学生个人信息查询");
		btn_exit = new JButton("退出系统");
		
		//下面这些按钮用来填充按钮面板
		btn_panel.add(new JLabel());
		btn_panel.add(btn_query_grade);
		btn_panel.add(btn_query);
		btn_panel.add(btn_exit);
		btn_panel.add(new JLabel());
		
		//设置面板的边框外观
		btn_panel.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createRaisedBevelBorder(),"快捷功能区"));
		
		//初始化欢迎面板
		wel_panel = new JPanel();
		lb_welcome = new JLabel("欢迎使用成绩管理系统");
		lb_welcome.setFont(new Font("宋体", Font.BOLD, 18));
		lb_welcome.setForeground(Color.BLACK);
		wel_panel.add(lb_welcome);
		
		//初始化桌面面板
		funcDesktop = new JDesktopPane();
		ImageIcon image = new ImageIcon("src/images/manager.jpg");
		deskLabel = new JLabel(image);
		deskLabel.setBounds(0,0,image.getIconWidth(),image.getIconHeight());
		funcDesktop.add(deskLabel,-1000);
		
		main_panel.add(btn_panel,BorderLayout.EAST);
		main_panel.add(wel_panel,BorderLayout.NORTH);
		main_panel.add(funcDesktop,BorderLayout.CENTER);
		
		this.setTitle("\u7BA1\u7406\u5458\u4E3B\u7A97\u53E3");
		this.getContentPane().add(main_panel);
		this.setSize(650,450);//窗口大小
		this.setVisible(true);
		this.setResizable(false);//不可拖动窗体大小
		this.setLocationRelativeTo(null);//窗体居中显示
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗体
		
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
				ManagerQueryGradeView qgd = new ManagerQueryGradeView();
				funcDesktop.add(qgd);//把指定的视图添加到容器中
				qgd.toFront();//视图显示在前面
			}
		});
	}
	private void registerListerer1(){
		btn_query.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ManagerQueryView qgd = new ManagerQueryView();
				funcDesktop.add(qgd);//把指定的视图添加到容器中
				qgd.toFront();//视图显示在前面
				
			}
		});
	}
}
