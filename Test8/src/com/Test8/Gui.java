package com.Test8;

import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
public class Gui {
	JFrame frame =new JFrame("���Ա��");
	JTextField text=new JTextField("��������Ҫ��ѯ��ѧ��...",20);
	Object m[]= {"ID","����","�Ա�","����"};
	JButton button=new JButton("����");
	JTable table=new JTable();
	JPanel panel1 =new JPanel();
	//JPanel panel2=new JPanel(new GridLayout(4,4,5,5));
	Init in=new Init(frame,400,400);//��frame���г�ʼ��
	public Gui() {
		//������ť������
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
			//����굥�������Զ��������������Ҫ��ѯ��ѧ��...��
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				String ch = text.getText();
		        if(ch.equals("��������Ҫ��ѯ��ѧ��...")){
		            text.setText("");
		            }
			}
		});
		//�����������ӵ�frame��
	panel1.add(text);
	panel1.add(button);
	frame.add(panel1,BorderLayout.NORTH);
	}
}
