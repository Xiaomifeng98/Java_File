package com.实验3_1;

class Trangle  
{  
   double sideA,sideB,sideC,area,length;
   boolean boo;
   public  Trangle(double a,double b,double c) 
   { 
	   sideA=a;
	   sideB=b;
	   sideC=c;
     if(a+b>c&&a+c>b)
     { 
        boo=true;
     }    
    else
     { 
    	boo=false;
     }
   }
   double getLength() 
   {
	   length=sideA+sideB+sideC;
	   return length;
  }
   public double  getArea() 
   {  
      if(boo)
        { 
          double p=(sideA+sideB+sideC)/2.0;
          area=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC)) ;
          return area;
        }
      else
        { 
          System.out.println("不是一个三角形,不能计算面积");
          return 0;
        }
   } 
   public void setABC(double a,double b,double c)
   { 
	   sideA=a;
	   sideB=b;
	   sideC=c;
     if(a+b>c&&a+c>b)
     {
    	boo=true;
     }    
    else
     {
    	boo=false;
     }
   }
}
class Lader 
{   
    double above,bottom,height,area; 
    Lader(double a,double b,double h)
    {
    	above=a;
    	bottom=b;
    	height=h;
    }
    double getArea()
    {
    	area=(above+bottom)*height/2;
    	return area;
    }
}

class Circle 
{  
    double radius,area;
    Circle(double r)
    {
    	radius=r;
    }
    double getArea() 
    {
    	area=3.14*radius*radius;
    	return area;
    }
    double getLength() 
    {
    	double length=2*3.14*radius;
    	return length;
    }
    void setRadius(double newRadius)
    {  
       radius=newRadius;
    }
    double getRadius() 
    { 
        return radius;
    }
}
public class AreaAndLength 
{  
    public static void main (String[] args)
    { 
       double length,area;
       Circle circle=null;
       Trangle trangle;
       Lader lader;
       circle= new Circle(5);
       trangle=new Trangle(3, 3, 5);
       lader= new Lader(2, 5, 5);
       length=circle.getLength();
       System.out.println("圆的周长:"+length); 
        area=circle.getArea();
        System.out.println("圆的面积:"+area);
        length=trangle.getLength();
        System.out.println("三角形的周长:"+length);
        area=trangle.getArea();
        System.out.println("三角形的面积:"+area);
        area=lader.getArea();
        System.out.println("梯形的面积:"+area); 
        trangle.setABC(12, 34, 1);
        area=trangle.getArea();
        System.out.println("三角形的面积:"+area); 
        length=trangle.getLength();
        System.out.println("三角形的周长:"+length);
        circle=new Circle(10);
        System.out.println("更改后圆的半径为："+circle.radius);
        System.out.println("更改后圆的周长为："+circle.getLength());
        System.out.println("更改后圆的面积为："+circle.getArea());
    }
}