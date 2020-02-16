package com.Test8;

import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
public class Gui {
	JFrame frame =new JFrame("测试表格");
	JTextField text=new JTextField("请输入你要查询的学号...",20);
	Object m[]= {"ID","姓名","性别","年龄"};
	JButton button=new JButton("查找");
	JTable table=new JTable();
	JPanel panel1 =new JPanel();
	//JPanel panel2=new JPanel(new GridLayout(4,4,5,5));
	Init in=new Init(frame,400,400);//对frame进行初始化
	public Gui() {
		//设立按钮监听器
		button.addActionListener(new ActionListener() {
			public void actionPerformed1(ActionEvent e) {
				int a=Integer.parseInt(text.getText()) ;
				Sql s=new Sql();
				Object n[][]=s.play(a);
				 	frame.remove(table);
			        table = new JTable(n,m);
			        frame.getContentPane().add(BorderLayout.CENTER,table);
			        frame.repaint();
			        frame.setVisible(true);
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		text.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			//当鼠标单击，会自动清除“请输入你要查询的学号...”
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				String ch = text.getText();
		        if(ch.equals("请输入你要查询的学号...")){
		            text.setText("");
		            }
			}
		});
		//将所有组件添加到frame上
	panel1.add(text);
	panel1.add(button);
	frame.add(panel1,BorderLayout.NORTH);
	}
}
