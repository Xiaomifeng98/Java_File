package com.Test8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Statement;
public class Sql {
	String url="jdbc:mysql://localhost:3306/student";
	String user="root";
	String password="root";
	Statement sta = null;
	Connection con=null;
	Object n[][]=new Object[4][4];
	public Object [][] play(int a) {
		try {
			//׼��SQl���
			n[0][0]="ID";n[0][1]="����";n[0][2]="�Ա�";n[0][3]="����";
			Class.forName("com.mysql.jdbc.Driver");//ע������
			con=DriverManager.getConnection(url, user, password);//��ȡ���Ӷ���
			sta= (Statement) con.createStatement();//����Statement
			String sql_1="SELECT * FROM stu where id="+a+"";
			ResultSet st=sta.executeQuery(sql_1);
			while(st.next()){
				int p=1;
				int id = st.getInt("id");
				String name = st.getString("name");
				String sex = st.getString("sex");
				int age=st.getInt("age");
				n[p][0]= id;n[p][1]=name;n[p][2]= sex;n[p][3]= age;
				p++;
				//System.out.println(id);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		//���ر�����ͨ����ע�⣬��򿪵��ȹر�
		finally {
			if(sta!=null)
				try {
					sta.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(con!=null)
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return n;
	}
}
