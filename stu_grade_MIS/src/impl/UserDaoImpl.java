package impl;

import java.util.ArrayList;
import java.util.List;

import dao.UserDao;
import entity.Manager;
import entity.Student;

public  class UserDaoImpl extends GetConn implements UserDao {
	
	@Override
	public Student loginStudent(Student student) {
		String sql=" select * from student  where student_name=? and password=? ";
		List<Student> uList=null;
		List<Object>params=new ArrayList<Object>();
		params.add(student.getStudent_name());
		params.add(student.getPassword());
		try {
			uList=this.OperQuery(sql, params,Student.class);
			System.out.println(uList.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(uList.size()>0){
			return uList.get(0);
		}
		else return null;
	}

	@Override
	public Manager loginManager(Manager manager) {
		String sql=" select * from manager  where manager_name=? and password=? ";
		List<Manager> uList=null;
		List<Object>params=new ArrayList<Object>();
		params.add(manager.getManager_name());
		params.add(manager.getPassword());
		try {
			uList=this.OperQuery(sql, params, Manager.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(uList.size()>0){
			return uList.get(0);
		}
		else return null;
	}
	public boolean SaveStudent(Student student) {
			String sql="insert into student(student_name,password) values(?,?)";
			List<Object>param=new ArrayList<Object>();
			param.add(student.getStudent_name());
			param.add(student.getPassword());
			return this.OperUpdate(sql,param);
		}
	@Override
	public Student QueryStudent(Student student) {
		String sql=" select * from student  where student_name=? and password=? ";
		List<Student> uList=null;
		List<Object>params=new ArrayList<Object>();
		params.add(student.getStudent_name());
		params.add(student.getPassword());
		try {
			uList=this.OperQuery(sql, params,Student.class);
			System.out.println(uList.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(uList.size()>0){
			return uList.get(0);
		}
		else return null;
	}
	}


