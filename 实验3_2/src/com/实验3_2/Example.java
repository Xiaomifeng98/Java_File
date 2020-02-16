package com.สตั้3_2;

class A
{
	float a;
	static float b;
    void setA(float a)
    {
    	this.a=a;
    }
    void setB(float b)
    {
    	A.b=b;
    }
    float getA()
    {  
       return a;
    }
    float getB()
    {  
       return b;
    }
    void inputA()
    {
       System.out.println(a);
    }
    static void inputB()
    {
       System.out.println(b);
    }
}
public class Example
{   
    public static void main(String args[]) 
    {
    	A.b=100;
    	A.inputB();
       A cat=new A();
       A dog=new A();
       cat.setA(200);
       cat.setB(400);
       dog.setA(150);
       dog.setB(300);
       cat.inputA();
       A.inputB();
       dog.inputA();
       A.inputB();
    } 
}