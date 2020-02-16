package com.Test3_3;

interface ICal{
	public double getArea();
	public double getPerimeter();
}

class Circle implements ICal{
	double radius;
	public Circle(double r){
		this.radius=r;
	}
	
	public double getArea(){
		double area;
		area=3.14*radius*radius;
		return area;
	}
	
	public double getPerimeter(){
		double Perimeter;
		Perimeter=2*3.14*radius;
		return Perimeter;
	}
	
	public String toString(){
		System.out.println("radius="+radius+",perimeter="+getPerimeter()+",area="+getArea());
		return null;
	}
}

class Rectangle implements ICal{
	double length,width;
	Rectangle(double l,double w){
		this.length=l;
		this.width=w;
	}

	public double getArea() {
		double area;
		area=length*width;
		return area;
	}
	
	public double getPerimeter(){
		double Perimeter;
		Perimeter=2*(length+width);
		return Perimeter;
	}
	
	public String toString(){
		System.out.println("length="+length+",width="+width+",Perimeter="+getPerimeter()+",area="+getArea());
		return null;
	}
}

public class ½Ó¿Ú {
	public static void main(String args[]){
		Circle Ci = new Circle(1.0);
		Ci.toString();
		Rectangle Re = new Rectangle(1.0,2.0);
		Re.toString();
	}
}
