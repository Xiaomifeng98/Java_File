package com.Test8;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Init {
public Init(JFrame frame,int x,int y) {
	 // frame.setResizable(false); 
	Toolkit toolkit=Toolkit.getDefaultToolkit() ;
	Dimension d=toolkit.getScreenSize();
	int a=(int)d.getWidth();
	int b=(int)d.getHeight();
	frame.setBounds((a-x)/2,(b-y)/2, x, y);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}

