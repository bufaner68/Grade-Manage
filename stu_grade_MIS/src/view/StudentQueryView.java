package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

public class StudentQueryView extends JInternalFrame {
	private static final long serialVersionUID = 1L;
	private JPanel paneltable = null;//用来保存JTable的面板
	private JTable table = null;
	private JPanel panelButton = null;//按钮面板
	private JButton btn_query = null;
	private JButton btn_add = null;
	private JButton btn_del = null;
	private JButton btn_update = null;
	private JButton btn_exit = null;
	private JComboBox<String> cb_type = null;
	private JLabel lb_type = null;
	
	public StudentQueryView(){
		init();
		registerListener();
	}
	private void init(){
		this.setTitle("学生个人信息查询");
		this.setSize(450,280);
		this.setVisible(true);
		this.setResizable(false);//不可拖动窗体大小
		this.setClosable(true);//窗体可被关闭
		this.setIconifiable(true);//窗体可被最小化
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//关闭窗体
		table = new JTable();
		paneltable = new JPanel(new BorderLayout());//创建面板
		//给面板设置边框
		paneltable.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(null, null), "查询信息"));
		paneltable.add(table);
		getContentPane().add(paneltable,BorderLayout.CENTER);
		
		panelButton=new JPanel(new GridLayout(7, 1,10,10));
		panelButton.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(null, null),"查询信息"));
		getContentPane().add(panelButton, BorderLayout.EAST);
		lb_type = new JLabel("\u64CD\u4F5C");
		panelButton.add(lb_type);
//		cb_type = new JComboBox<>(new String[]{"按学号查询","按姓名查询","按班级查询","按专业查询","按学院查询"});
//		panelButton.add(cb_type);
		
		JLabel label = new JLabel("");
		panelButton.add(label);
		btn_query = new JButton("查询信息");
		btn_query.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new QueryStudent1();
			}
		});
		panelButton.add(btn_query);
		btn_update = new JButton("更新信息");
		btn_update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new UpdateStudent1();
			}
		});
		panelButton.add(btn_update);
		btn_exit = new JButton("退出");
		panelButton.add(btn_exit);
		this.setVisible(true);
	}
	private void registerListener(){
		btn_exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}
