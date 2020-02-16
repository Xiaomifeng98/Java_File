package com.内存解析;

class Point {
    private double x;
    private double y;
    Point(double x1, double y1) { 
    	x = x1; 
    	y = y1;
    }
    public double getX() { return x; }
    public double getY() { return y; }
    public void setX(double i) { x = i; }
    public void setY(double i) { y = i; }
}
class Circle {
    private Point o;
    private double radius;
    Circle(Point p, double r) {
    	o = p; 
    	radius = r;
    }
    Circle(double r) {
        o = new Point(0.0, 0.0);
        radius = r;
    }
    public void setO(double x, double y) {
        o.setX(x); 
        o.setY(y);
    }
    public Point getO() { return o; }
    public double getRadius() { return radius;}
    public void setRadius(double r) { radius = r;}
    public double area() { 
        return 3.14 * radius * radius;
    }
}
class panduan{
	panduan(Circle p){
		double a=p.getO().getX();
		double b=p.getO().getY();
		double c=p.getRadius();
		if((a-0)*(a-0)+(b-5)*(b-5)==c*c){System.out.println("点（0，5）在以"+c+"为半径，以("+a+","+b+")的圆上");}
		if((a-0)*(a-0)+(b-5)*(b-5)<c*c){System.out.println("点（0，5）在以"+c+"为半径，以("+a+","+b+")的圆内");}
		if((a-0)*(a-0)+(b-5)*(b-5)>c*c){System.out.println("点（0，5）在以"+c+"为半径，以("+a+","+b+")的圆外");}
	}
}
public class TestCircle {
    public static void main(String args[]) {
        Circle c1 = new Circle(new Point(1.0,2.0), 2.0);
        Circle c2 = new Circle(5.0);
        System.out.println("c1:("+c1.getO().getX()+","
            +c1.getO().getY()+"),"+c1.getRadius());
        new panduan(c1);
        System.out.println("c2:("+c2.getO().getX()
            +","+c2.getO().getY()+"),"+c2.getRadius());
        new panduan(c2);
        System.out.println("c1 area = "+c1.area());
        System.out.println("c2 area = "+c2.area());
        c1.setO(5,6);
        c2.setRadius(9.0);
        System.out.println("c1:("+c1.getO().getX()+","
            +c1.getO().getY()+"),"+c1.getRadius());
        new panduan(c1);
        System.out.println("c2:("+c2.getO().getX()+","
            +c2.getO().getY()+"),"+c2.getRadius());
        new panduan(c2);
        System.out.println("c1 area = "+c1.area());
        System.out.println("c2 area = "+c2.area());
       }
}

