package biz;

import entity.Manager;
import entity.Student;

public interface UserBiz {
	//�û���¼�����ص��ǵ�¼�û�����Ϣ
	public Student loginStudent(Student student);
	//����Ա��¼�����ص��ǵ�¼����Ա����Ϣ
	public Manager loginManager(Manager manager);
	//ע���û�
	public  int registerStudent(Student student);
}
