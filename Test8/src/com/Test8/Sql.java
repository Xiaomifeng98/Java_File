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
			//准备SQl语句
			n[0][0]="ID";n[0][1]="姓名";n[0][2]="性别";n[0][3]="年龄";
			Class.forName("com.mysql.jdbc.Driver");//注册驱动
			con=DriverManager.getConnection(url, user, password);//获取连接对象
			sta= (Statement) con.createStatement();//创建Statement
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
		//最后关闭链接通道：注意，后打开的先关闭
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
