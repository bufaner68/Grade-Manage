package dao;

import java.util.List;

import entity.Course;

public interface CourseDao {
	public boolean addCourse(Course course); //��ӿγ� 
//	public boolean delCourse(int id); //ɾ��ָ��id�Ŀγ�
	public boolean delCourse(int cno); //ɾ���γ�
	public boolean updateCourse(Course course); //���¿γ�
	public List<Course> queryCourse(Course course); //��ѯ�γ�
	public List<Course> queryCourses(); //��ѯ���еĿγ�
	public List<Course> queryCourseByName(String Course_name); //��ѯָ�����ƵĿγ�
	

}
