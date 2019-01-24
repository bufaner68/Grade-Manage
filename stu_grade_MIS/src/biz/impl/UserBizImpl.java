package biz.impl;

import biz.UserBiz;
import dao.UserDao;
import entity.Manager;
import entity.Student;
import impl.UserDaoImpl;

public class UserBizImpl implements UserBiz {
	private UserDao userDao = null;
	public UserBizImpl(){
		userDao= new UserDaoImpl();
	}

	@Override
	public Student loginStudent(Student student) {
		return userDao.loginStudent(student);
	}

	@Override
	public int registerStudent(Student student) {
		if(userDao.loginStudent(student)!=null){
			return 1;//此用户已存在
		}else{
			Boolean res=userDao.SaveStudent(student);
			if(res){
				return 2;//注册成功
			}else {
				return 3;//注册失败
			}
		}
	}

	@Override
	public Manager loginManager(Manager manager) {
		return userDao.loginManager(manager);
	}

}
