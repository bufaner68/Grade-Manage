package biz;

import entity.Manager;
import entity.Student;

public interface UserBiz {
	//用户登录，返回的是登录用户的信息
	public Student loginStudent(Student student);
	//管理员登录，返回的是登录管理员的信息
	public Manager loginManager(Manager manager);
	//注册用户
	public  int registerStudent(Student student);
}
