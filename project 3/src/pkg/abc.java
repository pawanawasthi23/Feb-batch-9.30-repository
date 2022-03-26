package pkg; //3/d/1/4/2

import java.nio.charset.MalformedInputException;

public class abc {
public void m()
{
System.out.println("Default method");	
}
public void m1(int a)
{
	System.out.println("one parameterized method");
}
public void m2(int a, int b)
{
	this.m3(1,2,3);
	this.m();
	this.m1(1);
	this.m4(1,2,3,4);
	System.out.println("two parameterized method");
}
public void m3(int a, int b, int c)
{
	System.out.println("three parameterozed method");
}
public void m4(int a, int b, int c,int d) {
	System.out.println("four parameterized method");
}
public static void main(String[] args) {
	abc obj=new abc();
	obj.m2(1, 2);
			
}
}

