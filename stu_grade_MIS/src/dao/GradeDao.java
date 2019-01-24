package dao;

import java.util.List;

import entity.Grade;

public interface GradeDao {
	public boolean addGrade(Grade grade); //���ѧ���ɼ�
	public boolean delGrade(int sno,int cno); //ɾ��ѧ���ɼ�
	public boolean updateGrade(int sno,int cno,String course_name,int grade,int b_grade); //����ѧ���ɼ�
	public List<Grade> queryGrades(); //��ѯѧ���ɼ�
	public List<Grade> queryGradeByCno(int cno); //��ѯָ���γ̺ŵ�ѧ���ɼ�
	public List<Grade> queryGradeBySno(int sno); //��ѯָ��ѧ�ŵ�ѧ���ɼ�
	public List<Grade> queryGradeByClassroom(int classroom); //��ѯָ���༶��ѧ���ɼ�
	public List<Grade> queryGradeByMajor(String major); //��ѯָ��רҵ��ѧ���ɼ�
	public List<Grade> queryGradeByFaculty(String faculty); //��ѯָ��ѧԺ��ѧ���ɼ�

}
