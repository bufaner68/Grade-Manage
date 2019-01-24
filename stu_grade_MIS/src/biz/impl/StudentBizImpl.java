package biz.impl;

import java.util.List;

import biz.StudentBiz;
import dao.StudentDao;
import entity.Student;
import entity.Student2;
import impl.StudentDaoImpl;

public class StudentBizImpl implements StudentBiz {
	private StudentDao studentDao = null;
	public StudentBizImpl(){
		studentDao = new StudentDaoImpl();
	}
	@Override
	public boolean addStudent(Student student) {
		return studentDao.addStudent(student);
	}

	@Override
	public boolean delStudent(int sno) {
		return studentDao.delStudent(sno);
	}

	@Override
	public boolean updateStudent(Student student) {
		return studentDao.updateStudent(student);
	}

	@Override
	public List<Student> queryStudents() {
		return studentDao.queryStudents();
	}

	@Override
	public List<Student2> queryStudent() {
		return studentDao.queryStudent();
	}

	@Override
	public List<Student2> queryStudentByName(String Student_name) {
		return studentDao.queryStudentByName(Student_name);
	}

	@Override
	public List<Student2> queryStudentBySno(int sno) {
		return studentDao.queryStudentBySno(sno);
	}

	@Override
	public List<Student2> queryStudentByClassroom(int classroom) {
		return studentDao.queryStudentByClassroom(classroom);
	}

	@Override
	public List<Student2> queryStudentByMajor(String major) {
		return studentDao.queryStudentByMajor(major);
	}

	@Override
	public List<Student2> queryStudentByFaculty(String faculty) {
		return studentDao.queryStudentByFaculty(faculty);
	}

}
