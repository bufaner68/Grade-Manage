package biz.impl;

import java.util.List;

import biz.GradeBiz;
import dao.GradeDao;
import entity.Grade;
import impl.GradeDaoImpl;

public class GradeBizImpl implements GradeBiz {
	private GradeDao gradeDao = null;
	public GradeBizImpl(){
		gradeDao=new GradeDaoImpl();
	}

	@Override
	public boolean addGrade(Grade grade) {
		return gradeDao.addGrade(grade);
	}

	@Override
	public boolean delGrade(int sno, int cno) {
		return gradeDao.delGrade(sno, cno);
	}

	@Override
	public boolean updateGrade(int sno,int cno,String course_name,int grade,int b_grade) {
		return gradeDao.updateGrade(sno, cno,course_name,grade,b_grade);
	}

	@Override
	public List<Grade> queryGrades() {
		return gradeDao.queryGrades();
	}

	
	@Override
	public List<Grade> queryGradeByMajor(String major) {
		return gradeDao.queryGradeByMajor(major);
	}

	@Override
	public List<Grade> queryGradeByFaculty(String faculty) {
		return gradeDao.queryGradeByFaculty(faculty);
	}

	@Override
	public List<Grade> queryGradeBySno(int sno) {
		return gradeDao.queryGradeBySno(sno);
	}

	@Override
	public List<Grade> queryGradeByClassroom(int classroom) {
		return gradeDao.queryGradeByClassroom(classroom);
	}

	@Override
	public List<Grade> queryGradeByName(String student_name) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public List<Grade> queryGradeByCno(int cno) {
		return gradeDao.queryGradeByCno(cno);
	}
}
