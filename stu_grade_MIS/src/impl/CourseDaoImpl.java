package impl;

import java.util.ArrayList;
import java.util.List;

import dao.CourseDao;
import entity.Course;
import entity.Student;

public class CourseDaoImpl extends GetConn implements CourseDao {

	@Override
	public boolean addCourse(Course course) {
		String sql = "insert into course(id,cno,course_name,hour,credit)values(?,?,?,?,?)";
		List<Object> params = new ArrayList<Object>();
		params.add(course.getId());
		params.add(course.getCno());
		params.add(course.getCourse_name());
		params.add(course.getHour());
		params.add(course.getCredit());
		return this.OperUpdate(sql, params);
	}

	@Override
	public boolean delCourse(int cno) {
		String sql = "delete from course where cno = ?";
		List<Object> params = new ArrayList<Object>();
		params.add(cno);
		return this.OperUpdate(sql, params);
	}

	@Override
	public boolean updateCourse(Course course) {
		String sql = "update course set id=?,cno=?,course_name=?,hour=?,credit=? where cno = ?";
		List<Object> params = new ArrayList<Object>();
		params.add(course.getId());
		params.add(course.getCno());
		params.add(course.getCourse_name());
		params.add(course.getHour());
		params.add(course.getCredit());
		return this.OperUpdate(sql, params);
	}

	@Override
	public List<Course> queryCourse(Course course) {
		String sql = "select id,cno,course_name,hour,credit from course ";
		List<Course> sList = null;
		try {
			sList = this.OperQuery(sql, null, Course.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sList;
	}

	@Override
	public List<Course> queryCourses() {
		String sql = "select id,cno,course_name,hour,credit from course";
		List<Course> sList = null;
		try {
			sList = this.OperQuery(sql, null, Course.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sList;
	}

	@Override
	public List<Course> queryCourseByName(String Course_name) {
		String sql = "select id,cno,course_name,hour,credit from course where course_name = ?";
		List<Course> sList = null;
		try {
			sList = this.OperQuery(sql, null, Course.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sList;
	}
}
