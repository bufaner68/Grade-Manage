package impl;

import java.util.ArrayList;
import java.util.List;

import dao.GradeDao;
import entity.Grade;

public class GradeDaoImpl extends GetConn implements GradeDao {

	@Override
	public boolean addGrade(Grade grade) {
		String sql = "insert into grade(id,sno,cno,course_name,grade,b_grade)values(?,?,?,?,?,?)";
		List<Object> params = new ArrayList<Object>();
		params.add(grade.getId());
		params.add(grade.getSno());
		params.add(grade.getCno());
		params.add(grade.getCourse_name());
		params.add(grade.getGrade());
		params.add(grade.getB_grade());
		return this.OperUpdate(sql, params);
	}

	@Override
	public boolean delGrade(int sno,int cno) {
		String sql = "delete from grade where sno = ? and cno = ?";
		List<Object> params = new ArrayList<Object>();
		params.add(sno);
		params.add(cno);
		System.out.println("sno="+sno+"cno="+cno);
		return this.OperUpdate(sql, params);
	}

	@Override
	public boolean updateGrade(int sno,int cno,String course_name,int grade,int b_grade) {
		String sql = "update grade set sno = ?,cno=?,course_name=?,grade=?,b_grade=? where sno = ? and cno = ?";
		List<Object> params = new ArrayList<Object>();
		params.add(sno);
		params.add(cno);
		params.add(course_name);
		params.add(grade);
		params.add(b_grade);
		params.add(sno);
		params.add(cno);
		return this.OperUpdate(sql, params);
	}

	

	@Override
	public List<Grade> queryGradeByCno(int cno) {
		String sql = "select id,sno,cno,course_name,grade,b_grade from grade where cno = ?";
		List<Grade> sList = null;
		List<Object> params = new ArrayList<Object>();
		params.add(cno);
		try {
			sList = this.OperQuery(sql, params, Grade.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sList;
	}

	@Override
	public List<Grade> queryGradeBySno(int sno) {
		String sql = "select sno,cno,course_name,grade,b_grade from grade where sno = ?";
		List<Grade> sList = null;
		List<Object> params = new ArrayList<Object>();
		params.add(sno);
		try {
			sList = this.OperQuery(sql, params, Grade.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(sList.size()>0){
		return sList;}
		else {
			return null;
		}
	}

	@Override
	public List<Grade> queryGradeByClassroom(int classroom) {
		String sql = "select sno,cno,course_name,grade,b_grade from grade where classroom = ?";
		List<Grade> sList = null;
		List<Object> params = new ArrayList<Object>();
		params.add(classroom);
		try {
			sList = this.OperQuery(sql, params, Grade.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(sList.size()>0){
			return sList;}
			else {
				return null;
			}
	}

	@Override
	public List<Grade> queryGradeByMajor(String major) {
		String sql = "select sno,cno,course_name,grade,b_grade from grade where major = ?";
		List<Grade> sList = null;
		List<Object> params = new ArrayList<Object>();
		params.add(major);
		try {
			sList = this.OperQuery(sql, params, Grade.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(sList.size()>0){
			return sList;}
			else {
				return null;
			}
	}

	@Override
	public List<Grade> queryGradeByFaculty(String faculty) {
		String sql = "select sno,cno,course_name,grade,b_grade from grade where faculty = ?";
		List<Grade> sList = null;
		List<Object> params = new ArrayList<Object>();
		params.add(faculty);
		try {
			sList = this.OperQuery(sql, params, Grade.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(sList.size()>0){
			return sList;}
			else {
				return null;
			}
	}
	@Override
	public List<Grade> queryGrades() {
				List<Grade> sList = null;
				String sql = "select id,sno,cno,course_name,grade,b_grade from grade where id = ? and sno = ? and cno = ? and course_name = ? and grade = ? and b_grade = ?";
				try {
					sList = this.OperQuery(sql, null, Grade.class);
				} catch (Exception e) {
					e.printStackTrace();
				}
				if(sList.size()>0){
					return sList;
				}
				return null;
			
	}
}
