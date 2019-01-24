package dao;

import java.util.List;

import entity.Course;

public interface CourseDao {
	public boolean addCourse(Course course); //添加课程 
//	public boolean delCourse(int id); //删除指定id的课程
	public boolean delCourse(int cno); //删除课程
	public boolean updateCourse(Course course); //更新课程
	public List<Course> queryCourse(Course course); //查询课程
	public List<Course> queryCourses(); //查询所有的课程
	public List<Course> queryCourseByName(String Course_name); //查询指定名称的课程
	

}
