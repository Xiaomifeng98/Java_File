package cn.edu.ctgu;

public class TestStudent {
	public static void main(String[] args) {
        Student a=new Student();
		a.SetNo(2015);
		a.SetName("����");
		a.SetSex("��");
		Student b=new Student(2016,"����","��");
		System.out.println("aѧ����ѧ��Ϊ��"+a.GetNo());
		        System.out.println("aѧ��������Ϊ��"+a.GetName());
		System.out.println("aѧ�����Ա�Ϊ��"+a.GetSex());
		System.out.println("bѧ����ѧ��Ϊ��"+b.GetNo());
		        System.out.println("bѧ��������Ϊ��"+b.GetName());
		System.out.println("bѧ�����Ա�Ϊ��"+b.GetSex());
}
}
